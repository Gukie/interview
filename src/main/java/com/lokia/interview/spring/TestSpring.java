package com.lokia.interview.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext();
		context.getBean("");
	}

}
