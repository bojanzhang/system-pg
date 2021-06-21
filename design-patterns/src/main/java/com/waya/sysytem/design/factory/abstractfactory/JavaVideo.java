package com.waya.sysytem.design.factory.abstractfactory;

/**
 * java 产品族， Java视频类
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:00
 */
public class JavaVideo implements IVideo {

	@Override
	public void record() {
		System.out.println("java 视频");
	}
}
