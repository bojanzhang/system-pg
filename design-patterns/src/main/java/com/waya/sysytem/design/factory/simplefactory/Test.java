package com.waya.sysytem.design.factory.simplefactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:19
 */
public class Test {
	public static void main(String[] args) {
		CourseFactory factory = new CourseFactory();
		ICourse course = factory.create("com.waya.sysytem.design.simplefactory.JavaCourse");
		course.record();
		// 升级后的调用方式
		ICourse iCourse = factory.create(JavaCourse.class);
		iCourse.record();
	}
}
