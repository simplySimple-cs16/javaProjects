package com.kadum.specs;

import org.springframework.stereotype.Component;

import com.kadum.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 engine";
	}

}