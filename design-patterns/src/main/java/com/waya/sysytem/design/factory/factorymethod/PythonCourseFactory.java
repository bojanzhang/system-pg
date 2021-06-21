package com.waya.sysytem.design.factory.factorymethod;

import com.waya.sysytem.design.factory.simplefactory.ICourse;
import com.waya.sysytem.design.factory.simplefactory.PythonCourse;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:47
 */
public  class PythonCourseFactory implements ICourseFactory {
	@Override
	public ICourse create() {
		return new PythonCourse();
	}
}
