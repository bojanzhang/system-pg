package com.waya.sysytem.design.factory.factorymethod;

import com.waya.sysytem.design.factory.simplefactory.ICourse;

/**
 * 课程工厂接口
 *
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:45
 */
public interface ICourseFactory {
	ICourse create();
}
