package com.xukai.dubbo.dubbo_zookeeper;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Main;
import com.alibaba.dubbo.container.spring.SpringContainer;

public class ServerDubboTest {
	static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		System.setProperty(SpringContainer.SPRING_CONFIG, "META-INF/dubbo-provider.xml");
	// TODO Auto-generated method stub
		Main.main(args);
        
	}

}
