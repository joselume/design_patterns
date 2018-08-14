package com.design.patterns;

public class Motorcycle extends SelfDrivenVehicle {
	
	@Override
	protected void accelerate() {
		System.out.println("Motorcycle.accelerate()");		
	}
	@Override
	protected void steer() {
		System.out.println("Motorcycle.steer()");	
	}
	@Override
	protected void brake() {
		System.out.println("Motorcycle.brake()");		
	}
}
