package com.kadum;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kadum.interfaces.Car;

public class App {

	public static void main(String[] args) {
//		Car swift = new Swift();
//		Car corolla = new Corolla();
//
//		System.out.println(swift.specs());
//		System.out.println(corolla.specs());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
