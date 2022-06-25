
public class localvari {

	void printmyname()
	{
		String v="vaibhav";
		System.out.println("my name is "+v);
	}// 2nd-end of function, deallocates memory
	public static void main(String[] args) {
		localvari obj=new localvari();
		obj.printmyname();// 1st-Memory calling, allocates memory
	}

}
