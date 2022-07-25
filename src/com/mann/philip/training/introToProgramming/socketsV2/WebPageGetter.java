
package com.mann.philip.training.introToProgramming.socketsV2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;

/*******************************************************************************
*<b>Title:</b> WebPageGetter.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 25, 2022
*<b>updates:</b>
*******************************************************************************/

public class WebPageGetter {
	/**
	 * location of text.properties
	 */
	public final String TEXT = System.getProperty("user.dir") + "/resources/text.properties";
	/**
	 * location of outout file
	 */
	public final String OUTPUT_PATH = System.getProperty("user.dir") + "/output/";
	/**
	 * Member variables
	 */
	private String host;
	private int port;
	private StringBuilder html;

	public static void main(String[] args) {
		WebPageGetter ex = new WebPageGetter("localhost", 80);
		ex.getWebPage(ex.getHost(), ex.getPort());
		ex.saveWebPage(ex.getHost());
	}
	
	public WebPageGetter(String hostName, int portNum) {
		setHost(hostName);
		setPort(portNum);
		host = hostName;
		port = portNum;
	}
	
	/**
	 * to log to the console
	 * @param Text
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @returns a string of text from text.properties
	 */
	public String getTextProps(String text) {
		Properties prop = new Properties();
		try (InputStream propsFile = new FileInputStream(TEXT)) {
			prop.load(propsFile);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(text);
	}
	
	/**
	 * creates a socket connection and request a webpage from host and port
	 * and sets the htmlFromHost to html
	 * 
	 * @param hostName
	 * @param portNum
	 */
	public void getWebPage(String hostName, int portNum) {
		StringBuilder htmlFromHost = new StringBuilder();
		try(Socket socket = new Socket(hostName, portNum)) {
			System.out.println(getTextProps("fetching"));
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.writeBytes(getTextProps("get") + " / " + getTextProps("http") + "\r\n");
			out.writeBytes("Host: " + hostName + "\r\n");
			out.writeBytes("\r\n");
			String inData = null;
			while((inData = in.readLine()) != null) {
				htmlFromHost.append(inData).append("\n");
			}
			out.flush();
			out.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setHtml(htmlFromHost);
	}
	
	/**
	 * writes var html to an output file
	 */
	public void saveWebPage(String hostName) {
		File file = new File(OUTPUT_PATH + hostName + ".html");
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.append(getHtml());
			System.out.println(getTextProps("success"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @returns the host, stripped of white space
	 */
	public String getHost() {
		return host.strip();
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @returns port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @returns html
	 */
	public StringBuilder getHtml() {
		return html;
	}

	/**
	 * @param html the html to set
	 */
	public void setHtml(StringBuilder html) {
		this.html = html;
	}

}
