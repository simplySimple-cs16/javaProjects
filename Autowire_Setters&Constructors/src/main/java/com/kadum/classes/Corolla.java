package com.kadum.classes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kadum.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	
	
	@Autowired
	Engine engine;
	
	//Must be autowired if we want to reflect the change in engine object via setter
	public void setEngine(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
	
	//Autowire constructor is optional
	public Corolla(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}


	@Override
	public String specs() {
		return "Sedan from Toyota with engine verion "+engine.type;
	}

}

