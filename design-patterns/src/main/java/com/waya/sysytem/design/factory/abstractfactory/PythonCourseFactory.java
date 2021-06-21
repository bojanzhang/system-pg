package com.waya.sysytem.design.factory.abstractfactory;

/**
 * python 产品族的具体工厂类
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:05
 */
public class PythonCourseFactory implements CourseFactory {
	@Override
	public INote createNote() {
		return new PythonNote();
	}

	@Override
	public IVideo createVideo() {
		return new PythonVideo();
	}
}
