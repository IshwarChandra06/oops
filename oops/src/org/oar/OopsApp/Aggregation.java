package org.oar.OopsApp;

public class Aggregation 
{

	public static void main(String[] args) 
	{
		Driver d=new Driver(new Car());
		d.drive();

	}

}
class Car
{
	void start()
	{
		System.out.println("car starts");
	}
}
class Driver
{
	Car c;
	Driver(Car c)
	{
		this.c=c;
	}
	void drive()
	{
		c.start();
	}
}
