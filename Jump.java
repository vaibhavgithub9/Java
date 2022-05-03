public class Jump {
	
public static void main(String[] args) 
{
//Break in Jump statement
	for(int a=1;a<=9;a++)
	{
		if(a==4)
		{
			break;
		}
		System.out.println(a);
	}
	System.out.println("The end");
//Continue in Jump statement
	for(int b=0;b<=10;b++)
	{
		if(b==5)
		{
			continue;
		}
		System.out.println(b);
	}
	System.out.println("Good bye");
}

}
