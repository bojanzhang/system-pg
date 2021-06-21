package com.waya.sysytem.design.factory.simplefactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:12
 */
public class JavaCourse implements ICourse {
	@Override
	public void record() {
		System.out.println("录制java课程");
	}
}
