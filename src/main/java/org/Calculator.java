package org;

public class Calculator {
	public int findBig(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;			
	}
	public int findSmall(int x,int y)
	{
		if(x>y)
			return y;
		else
			return x;			
	}
	public int findMax(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;			
	}
	public boolean findequals(int x,int y)
	{
		if(x==y)
			return true;
		else
			return false;			
	}

}