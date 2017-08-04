package com.xukai.dubbo.dubbo_zookeeper.imp;

import com.xukai.dubbo.dubbo_zookeeper.DubboAndZookeeperServer;

public class DubboAndZookeeperServerImp implements DubboAndZookeeperServer {
	
	volatile static int count ;

	public String initDubboServer() {
		// TODO Auto-generated method stub
		count++;
		System.out.println("dubbo and zookeeper config is success["+count+"]");
		
		return "dubbo and zookeeper config is success";
	}

}
