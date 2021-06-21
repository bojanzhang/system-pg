package com.waya.sysytem.design.factory.abstractfactory;

/**
 * java  产品族的具体工厂类
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:02
 */
public class JavaCourseFactory implements CourseFactory {
	@Override
	public INote createNote() {
		return new JavaNote();
	}

	@Override
	public IVideo createVideo() {
		return new JavaVideo();
	}
}
