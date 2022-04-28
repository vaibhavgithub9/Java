
public class Operators {
	public static void main(String[] args) {
		int a=5,b=4;
		boolean c=false;
		int d=10;
		int e=-10;
		int f;
		int max=(a>b)?a:b;
// Arithmetic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
// Unary operator
	//	System.out.println(++b);
	//	System.out.println(--a);
	//	System.out.println(a++);
	//	System.out.println(a);
	//	System.out.println(b--);
	//	System.out.println(b);
	//	System.out.println(a+b);
	//	System.out.println(~a);
	//	System.out.println(!c);
// Shift operator
	//	System.out.println(d<<2);
	//	System.out.println(d>>2);
	//	System.out.println(e<<2);
	//	System.out.println(e>>2);
// Relational operator
	//	System.out.println(a>b);
	//	System.out.println(a>=b);
	//	System.out.println(a==d);
	//	System.out.println(d<e);
// Assignment operator
	//	System.out.println(f=9);
	//	System.out.println(f+=1);
	//	System.out.println(f*=2);
//Logical operator
	//	System.out.println(a>b && b>d);
	//	System.out.println(a>b || b<d);
//Bitwise operators
	//	System.out.println(a|b); //0101 0100= 0101=5
	//	System.out.println(a&b); //0101 0100= 0100=4
//Bitwise and logical operators &&,&
	//	System.out.println(a<b && b++ <a); //In logical op if the first value is false the next value is not considered
	//	System.out.println(a);
	//	System.out.println(a<b & a++ <b); //Next value is checked if first value is false
	//	System.out.println(a);
//Bitwise and logical operator ||,|
	//	System.out.println(a>b || b++<a);
	//	System.out.println(a);
	//	System.out.println(a>b | b++<a);
	//	System.out.println(a);
//Ternary operator
		System.out.println(max);	
	}
}
