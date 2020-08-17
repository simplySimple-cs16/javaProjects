package com.kadum.classes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.kadum.interfaces.Car;
import com.kadum.interfaces.Engine;

public class Corolla implements Car {
	
	
	@Autowired
	@Qualifier("engineType")
	Engine engine; //Engine interface now implemented by V8 class
	

	@Override
	public String specs() {
		return "Sedan from Toyota with engine verion "+engine.type();
	}

}

