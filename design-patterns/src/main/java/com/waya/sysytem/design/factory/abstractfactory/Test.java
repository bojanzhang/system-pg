package com.waya.sysytem.design.factory.abstractfactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:06
 */
public class Test {
	public static void main(String[] args) {
		JavaCourseFactory factory = new JavaCourseFactory();
		factory.createNote().edit();
		factory.createVideo().record();
	}
}
