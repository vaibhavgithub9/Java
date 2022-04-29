
public class Conditionalstatements {

	public static void main(String[] args) 
	{
int a=-33;
int b=25;
int c=33;
int d=0;
int e=4;
//if
	if(a>0)
	{System.out.println("the number is greater than 0");}
	System.out.println("Not greater than 0");
//if inside if
	{
	if (b>0)
	if(b%5==0)
	{System.out.println ("Its a multiple of 5");}
	}
	System.out.println("the end");
//if else
	{
		if(c>0)
		{System.out.println("its a positive number");}
		else
		{System.out.println("its a negative number");}
	}
//else if in if else
	{
		if(d>0)
		{System.out.println("its greater than zero");}
		else if(d==0)
		{System.out.println("its equal to zero");}
		else
		{System.out.println("its lesser than zero");}
		
	}
//Switch case
	switch(e)
	{
	case 1:
	System.out.println("Case 1");
	break;
	case 2:
	System.out.println("Case 2");
	break;
	case 3:
	System.out.println("Case 3");
	break;
	case 4:
	System.out.println("Case 4");
	break;
	default:
		System.out.println("out of the case");
	}
	
	}

}
