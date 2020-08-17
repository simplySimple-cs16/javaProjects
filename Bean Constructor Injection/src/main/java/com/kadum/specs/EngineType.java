package com.kadum.specs;

import com.kadum.interfaces.Engine;

public class EngineType implements Engine {
	
	String type;
	
	

	public EngineType(String type) {
		this.type = type;
	}



	@Override
	public String type() {
		return type;
	}

}