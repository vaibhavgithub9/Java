
public class Bikeoop {

	static int wheels=2;//static Variable
	String color="";//Instance Variable
	static void braking()
	{
		System.out.println("bike stops when brakes are applied");	}
	void mileage(int s)
	{
		System.out.println("mileage is "+s+"kmph");
	}
	public static void main(String[] args) {
	Bikeoop Activa=new Bikeoop();
	Bikeoop Jupiter=new Bikeoop();
	Bikeoop Vespa=new Bikeoop();
	System.out.println("no.of Wheels"+Activa.wheels);
	System.out.println("no.of Wheels"+Jupiter.wheels);
	System.out.println("no.of Wheels"+Vespa.wheels);
	Activa.color="White";
	Jupiter.color="Grey";
	Vespa.color="yellow";
	System.out.println(""+Activa.color);
	System.out.println(""+Jupiter.color);
	System.out.println(""+Vespa.color);
	Activa.braking();
	Jupiter.braking();
	Vespa.braking();
	
	Activa.mileage(60);
	Jupiter.mileage(65);
	Vespa.mileage(59);
	
	}

}
