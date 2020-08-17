package com.kadum.classes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kadum.interfaces.Car;
import com.kadum.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {
	
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine; //Engine interface now implemented by V8 class
	

	@Override
	public String specs() {
		return "Sedan from Toyota with engine verion "+engine.type();
	}

}

