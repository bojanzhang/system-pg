package com.waya.sysytem.design.factory.simplefactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:14
 */
public class PythonCourse implements ICourse {

	@Override
	public void record() {
		System.out.println("python 课程");
	}
}
