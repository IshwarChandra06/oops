package org.oar.encap;



public class Button
{
private int height;
public void setheight(int n)
{
	height=n;
}
public int getheight()
{
	return height;
}
}
class Test
{public static void main(String[] args) 
{
	Button b1=new Button();
	b1.setheight(6);
	int n=b1.getheight();
	System.out.println(n);
}
}
