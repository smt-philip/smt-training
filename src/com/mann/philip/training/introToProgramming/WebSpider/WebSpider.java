package com.mann.philip.training.introToProgramming.WebSpider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*******************************************************************************
*<b>Title:</b> WebSpider.java
*<b>Project:</b> smt-training
*<b>Description:</b> Web Spider Tutorial: https://www.section.io/engineering-education/how-to-build-a-web-crawler-with-java/
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jul 26, 2022
*<b>updates:</b>
*******************************************************************************/

public class WebSpider {
	
	private Queue<String> urlQueue;
	private List<String> visitedURLs;
	
	public static void main(String[] args) {
		WebSpider spider = new WebSpider();
		String rootURL = "https://www.siliconmtn.com/";
		spider.crawl(rootURL, 100);
	}
	
	public WebSpider() {
		urlQueue = new LinkedList<>();
		visitedURLs = new ArrayList<>();
	}
	
	public void crawl(String root, int breakpoint) {
		urlQueue.add(root);
		visitedURLs.add(root);
		
		while(!urlQueue.isEmpty()) {
			String s = urlQueue.remove();
			String rawHTML = "";
			try {
				URL url = new URL(s);
				BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				String inputLine = in.readLine();
				while(inputLine != null) {
					rawHTML += inputLine;
					inputLine = in.readLine();
				}
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			String urlPattern = "((http|https)://)(www.)?"
	          + "[a-zA-Z0-9@:%._\\+~#?&//=]"
	          + "{2,256}\\.[a-z]"
	          + "{2,6}\\b([-a-zA-Z0-9@:%"
	          + "._\\+~#?&//=]*)";
			
			Pattern pattern = Pattern.compile(urlPattern);
			Matcher matcher = pattern.matcher(rawHTML);
			
			breakpoint = getBreakpoint(breakpoint, matcher);
			
			if(breakpoint == 0) {
				break;
			}
			System.out.println(visitedURLs);
		}
	}
	
	private int getBreakpoint(int breakpoint, Matcher matcher) {
		while(matcher.find()) {
			String actualURL = matcher.group();
			if(!visitedURLs.contains(actualURL)) {
				visitedURLs.add(actualURL);
				urlQueue.add(actualURL);
			}
			
			if(breakpoint == 0 ) {
				System.out.println("Crawling Complete");
				break;
			}
		}
		return breakpoint;
	}
}
