package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		//First create Empty container
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
		//2 find all classes from given base package and subpackage
		
				ac.scan("my.app");
				
				//3. refresh spring container
				
				ac.refresh();
			//4 read the object	
			HandlerInfo hb=	ac.getBean("hob", HandlerInfo.class);
			
			//5. print the object
			System.out.println(hb);
	}

}
