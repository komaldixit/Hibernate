package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Client_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/test.xml");
		
		Car c1 = (Car)ap.getBean("c");
		c1.Details();
	}

}
