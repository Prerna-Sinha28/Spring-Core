package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


	
	//Generally we use @ComponentScan to give the base package
	
	@ComponentScan(basePackages= {"com.app"})
	//that means all your classes present inside this annottaion bases itself
	
	@PropertySource("classpath:myapp.properties")
	// I want to tell go to src/main/resource(class path meaning) and the file name is myapp.properties and load
	//1. first annotation will try to find the classes from current package com.app
	//app package and sub package
	
	//2.Second annotation will try to property file
	//annotation you can write in any order (annotation never follow order over a class)
	//now let us try read yhe data
	
	public class MyAppConfig {

}
