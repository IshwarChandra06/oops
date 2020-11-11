package org.oar.OopsApp;

public class St 
{
private static St obj=null;
private St()
{
	
}
public static St getInstance()
{
	if(obj==null)
	{
		obj= new St();
	}
	return obj;
	
}
public static void main(String[] args)
{
	St s2=St.getInstance();
}
}
