package com.waya.sysytem.design.factory.abstractfactory;

/**
 *抽象工厂类
 * 用户的主入口
 * spring中应用最广泛的一种设计模式
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 16:58
 */
public interface CourseFactory {
	INote createNote();
	IVideo createVideo();
}
