package com.kadum;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kadum.classes.Corolla;
import com.kadum.classes.Swift;
import com.kadum.specs.EngineType;

@Configuration
@ComponentScan("com.kadum")
public class AppConfig {

	@Bean("corolla")
	public Corolla corolla(){
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift(){
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType(){
		return new EngineType("V6");
	}
	
}
