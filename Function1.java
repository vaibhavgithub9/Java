
public class Function1 {
int I=9;//Instance
static int S=18;//Static
	public static void main(String[] args) {
		Function1 f1= new Function1();
		Function1 f2= new Function1();
		System.out.println(""+f1.I);// For Instance class name should be used
		System.out.println(""+f2.I);// For Static class name, object etc can be used 
		System.out.println(""+Function1.S);//For Static without object can be used
		System.out.println(""+Function1.S);
		f1.I=10; Function1.S=20;
		System.out.println(""+f1.I);
		System.out.println(""+f2.I);
		System.out.println(""+S);
		System.out.println(""+S);
	}

}
