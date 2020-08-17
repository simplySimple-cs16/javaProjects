package com.kadum.classes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kadum.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	
	@Autowired
	Engine engine;

	@Override
	public String specs() {
		return "Sedan from Toyota with engine verion "+engine.type;
	}

}
