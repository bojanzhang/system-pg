package com.waya.sysytem.design.factory.factorymethod;

import com.waya.sysytem.design.factory.simplefactory.ICourse;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:48
 */
public class Test {
	public static void main(String[] args) {
		ICourseFactory factory = new PythonCourseFactory();
		ICourse iCourse = factory.create();
		iCourse.record();

		factory = new JavaCourseFactory();
		iCourse = factory.create();
		iCourse.record();


	}
}
