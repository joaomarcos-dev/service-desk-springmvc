package com.jodev.servicedesk.config;

public class LogNdc {

	public static void log() {
		System.out.println("DBG: " + Thread.currentThread().getStackTrace()[2]);
	}

	public static void log(String s) {
		System.out.println("DBG: " + Thread.currentThread().getStackTrace()[2] + s);
	}

	public static void log(Object o) {
		System.out.println("DBG: " + Thread.currentThread().getStackTrace()[2] + o);
	}
}
