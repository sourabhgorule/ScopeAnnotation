package com.demo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Asus implements Laptop {

	@Override
	public String brandName() {
		
		
		return "Asus here";
	}

}
