package org.oar.OopsApp;

public class Singleton 
{
private Singleton()
{
	
}
public static Singleton getInstance()
{
	return new Singleton();
}
	public static void main(String[] args)
	{
		Singleton s1=Singleton.getInstance();

	}

}
