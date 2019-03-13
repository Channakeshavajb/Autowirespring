package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.ShowRoom;

public class ShowRoomTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resource/context.xml");
		System.out.println(context.getBeanDefinitionCount());
		ShowRoom refOfShowroom = context.getBean(ShowRoom.class);

		
		
		System.out.println(refOfShowroom.getType());
		//refOfShowroom.selling("city", new Double(16));
		refOfShowroom.selling("city", 160.0);

	}

}
