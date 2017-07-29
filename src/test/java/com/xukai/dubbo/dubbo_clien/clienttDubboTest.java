package com.xukai.dubbo.dubbo_clien;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.common.utils.ConfigUtils;
import com.alibaba.dubbo.container.Main;
import com.alibaba.dubbo.container.spring.SpringContainer;
import com.xukai.dubbo.dubbo_zookeeper.DubboAndZookeeperServer;

public class clienttDubboTest {
	static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		System.setProperty(SpringContainer.SPRING_CONFIG, "META-INF/dubbo-provider.xml");
	// TODO Auto-generated method stub
		String configPath = ConfigUtils.getProperty(SpringContainer.SPRING_CONFIG);
        if (configPath == null || configPath.length() == 0) {
            configPath = SpringContainer.DEFAULT_SPRING_CONFIG;
        }
        context = new ClassPathXmlApplicationContext(configPath.split("[,\\s]+"));
        
        context.start();
        DubboAndZookeeperServer dubooAndZookeeperServer = (DubboAndZookeeperServer) context.getBean("dubboAndZookeeperServer");
        String messege = dubooAndZookeeperServer.initDubboServer();
        System.out.println("result:"+messege);
	}

}
