package com.waya.sysytem.design.factory.factorycase;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Pool 抽象类
 * 自定义连接池， getInstance()返回 Pool唯一实例， 第一次调用时执行构造函数
 * Pool(),调用驱动装载loadDrivers()函数;
 * createPool() 连接池创建
 * loadDrivers() 装载驱动
 * getConnection() 返回连接实例
 * getConnection(Long times) 有时间限制的连接实例
 * freeConnection(Connection con) 释放连接， 将连接返回给连接池
 * getnum() 空闲连接数
 * getnumActive() 返回当前使用的连接数
 *
 * @version 1.0
 * @auther bojan
 * @date 2021/6/21 17:20
 */
public abstract class Pool {
	public String propertiesName = "connection-INF.properties";
	private static Pool instance = null;// 定义唯一实例

	protected int maxConnect = 100;//最大连接数
	protected int normalConnect = 10;//保持连接数
	protected String driverName = null;// 驱动字符串
	protected Driver driver = null;// 驱动变量

	/**
	 * 私有构造函数， 不允许外界访问
	 *
	 * @return
	 * @create bojan 2021/6/21 17:29
	 */
	protected Pool() {
		try {
			init();
			loadDriver(driverName);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 读取配置参数
	 *
	 * @return
	 * @create bojan 2021/6/21 17:36
	 */

	private void init() throws IOException {
		InputStream is = Pool.class.getResourceAsStream(propertiesName);
		Properties p = new Properties();
		p.load(is);
		driverName = p.getProperty("driverName");
		maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
		normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
	}

	/**
	 * 装载驱动
	 *
	 * @param driverName
	 * @return
	 * @create bojan 2021/6/21 17:36
	 */

	protected void loadDriver(String driverName) {
		try {
			driver = (Driver) Class.forName(driverName).newInstance();
			DriverManager.registerDriver(driver);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建连接池
	 *
	 * @return
	 * @create bojan 2021/6/21 17:37
	 */

	abstract void createPool();

	/**
	 * 单例模式， 返回数据库连接池Pool 实例
	 *
	 * @return
	 * @create bojan 2021/6/21 17:38
	 */

	public static synchronized Pool getInstance() throws ClassNotFoundException, IllegalAccessException,
			InstantiationException, IOException {
		if(instance == null) {
			instance = (Pool) Class.forName("com.waya.sysytem.design.factory.factorycase.Pool").newInstance();
			instance.init();
		}
		return instance;
	}

	/**
	 * 获取一个可用的连接，如果没有则创建一个连接， 且小于最大连接限制
	 *
	 * @return
	 * @create bojan 2021/6/21 17:44
	 */

	abstract Connection getConnection();

	/**
	 * 获得一个连接,有时间限制
	 *
	 * @param time 设置该连接的持续时间(以毫秒为单位)
	 * @return
	 * @create bojan 2021/6/21 17:45
	 */

	abstract Connection getConnection(long time);

}
