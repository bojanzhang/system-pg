package com.waya.sysytem.design.factory.abstractfactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:01
 */
public class JavaNote implements INote {

	@Override
	public void edit() {
		System.out.println("Java 笔记");
	}
}
