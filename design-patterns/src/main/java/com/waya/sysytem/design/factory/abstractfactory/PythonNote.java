package com.waya.sysytem.design.factory.abstractfactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:05
 */
public class PythonNote implements INote {
	@Override
	public void edit() {
		System.out.println("python  笔记");
	}
}
