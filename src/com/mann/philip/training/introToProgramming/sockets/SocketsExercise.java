
package com.mann.philip.training.introToProgramming.sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*******************************************************************************
*<b>Title:</b> SocketsExercise.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 15, 2022
*<b>updates:</b>
*******************************************************************************/

public class SocketsExercise {

	public static void main(String[] args) {
		SocketsExercise sE = new SocketsExercise();
		String host = "127.0.0.1";
		int port = 80;
		sE.getWebPage(host, port);
	}
	
	public void getWebPage(String hostName, int portNum) {
		StringBuilder html = new StringBuilder();
		try (Socket socket = new Socket(hostName, portNum)) {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.writeBytes("GET / HTTPS/1.1 \r\n");
			out.writeBytes("Host:" + hostName + "\r\n\r\n");
			out.writeBytes("\r\n");
			out.flush();
			String inData = null;
			while((inData = in.readLine()) != null) {
				System.out.println(inData);
				html.append(inData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("html: " + html);
	}
}