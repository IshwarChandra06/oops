package org.oar.OopsApp;

public class Composition {

	public static void main(String[] args)
	{
	Caar c=new Caar(new Engine());
	c.drive();

	}

}
class Engine
{
	void start()
	{
		System.out.println("engine starts");
	}
}
class Caar
{
	Engine e;
	Caar(Engine e)
	{
		this.e=e;
	}
	void drive()
	{
		e.start();
	}
}
