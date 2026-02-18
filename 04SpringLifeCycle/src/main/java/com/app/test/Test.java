package com.app.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
			Object o1=ac.getBean("eobj");
			System.out.println(o1);
			ac.close();
			//close method is important because without close method destroying object is not possible and it will force container to stop by destrying the object 
	
}
}
