package com.kadum.specs;


import com.kadum.interfaces.Engine;

public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 engine";
	}

}