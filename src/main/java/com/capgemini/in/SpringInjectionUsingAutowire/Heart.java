package com.capgemini.in.SpringInjectionUsingAutowire;

import org.springframework.stereotype.Component;
@Component
public class Heart {
	public void pumping() {
		System.out.println("Heart is pumping");
	}
}
