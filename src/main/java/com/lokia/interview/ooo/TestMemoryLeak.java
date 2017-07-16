package com.lokia.interview.ooo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMemoryLeak {

	private static Map<String, Object> data = new HashMap<String, Object>();

	public static void main(String[] args) {
		addData();
		System.gc();
		printData();
	}

	private static void printData() {
		System.out.println("****** print data *******");
		for (Entry<String, Object> entry : data.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}

	private static void addData() {
		System.out.println("****** add data *******");
		for (int i = 0; i < 10; i++) {
			Object object = new Object();
			data.put(String.valueOf(i), object);
			System.out.println(object);
			object = null;
		}
	}
}
