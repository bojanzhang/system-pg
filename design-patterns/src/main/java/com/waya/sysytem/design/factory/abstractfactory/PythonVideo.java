package com.waya.sysytem.design.factory.abstractfactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:04
 */
public class PythonVideo implements IVideo {
	@Override
	public void record() {
		System.out.println("python 视频");
	}
}
