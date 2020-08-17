package com.kadum.classes;

import org.springframework.stereotype.Component;

import com.kadum.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		// TODO Auto-generated method stub
		return "SWift Dzire from Maruti";
	}

}
