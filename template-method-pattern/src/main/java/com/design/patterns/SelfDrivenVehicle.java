package com.design.patterns;

public abstract class SelfDrivenVehicle {
	
	public final void DriveToDestination ()
	{
		accelerate();
		steer();
		brake();
		reachDestination();
	}	
	
	private void reachDestination()
	{
		System.out.println("reachDestination()");
	}
	
	protected abstract void accelerate ();	
	
	protected abstract void steer ();
	
	protected abstract void brake ();
	
}
