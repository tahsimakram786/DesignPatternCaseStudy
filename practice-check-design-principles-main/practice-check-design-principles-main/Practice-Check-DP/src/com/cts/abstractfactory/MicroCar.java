package com.cts.abstractfactory;

public class MicroCar extends Car{
	
	MicroCar(Location location)
	{
		super(CarType.MICRO, location);
		construct();
	}
	@Override
	public void construct() {
		System.out.println("Connecting to Micro Car");
	}

}
