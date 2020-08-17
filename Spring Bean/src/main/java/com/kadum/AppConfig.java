package com.kadum;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kadum.classes.Corolla;
import com.kadum.classes.Swift;
import com.kadum.specs.V6;
import com.kadum.specs.V8;

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
	
	@Bean("V6Engine")
	public V6 v6(){
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8(){
		return new V8();
	}
	
}
