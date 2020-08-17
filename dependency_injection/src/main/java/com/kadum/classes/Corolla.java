package com.kadum.classes;

import org.springframework.stereotype.Component;

import com.kadum.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		return "Sedan from Toyota";
	}

}
