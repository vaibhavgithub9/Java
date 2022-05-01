public class Looping {
public static void main(String[] args) 
//While loop
{
	int i=0;
	while(i<=5)
	{
		System.out.println("the number is "+i);
		i++;
	}
//For loop
	int sum=0;
	for (int a=1;a<=9;a++)
	{
		sum=a+sum;
	}
		System.out.println("the sum of first 9 natural numbers is "+sum);
//Do while
	int b=6;
	do
	{
		System.out.println("the number is "+b);
		b++;
	}
	while(b<=6);
}
}
