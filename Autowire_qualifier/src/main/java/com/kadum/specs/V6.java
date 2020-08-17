package com.kadum.specs;

import org.springframework.stereotype.Component;
import com.kadum.interfaces.Engine;

@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 engine";
	}

}