package com.waya.sysytem.design.factory.simplefactory;

/**
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 15:14
 */
public class CourseFactory {
	/**
	 * @param className 参数为字符串，可控性有待提升，而且需要强制转换, 可以升级一下
	 * @return
	 * @create bojan 2021/6/21 15:21
	 */

	public ICourse create(String className) {
		try {
			if(!(null == className || "".equals(className))) {
				return (ICourse) Class.forName(className).newInstance();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * create  方法升级
	 *
	 * @param clazz
	 * @return
	 * @create bojan 2021/6/21 15:23
	 */

	public ICourse create(Class<? extends ICourse> clazz) {

		try {
			if(clazz != null) {
				return clazz.newInstance();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
