package conecpts;

public class Vehicle 
{
	
	int size=10;
	int no=2061;
	String name="RR";
	String brand="White Plantinum";
	
	void start()//Behaviors/methods
	{
		System.out.println("Car is Start");
	}
	
	void speed()
	{
		System.out.println("Car is Running");
	}
	
	void gearshifting()
	{
		System.out.println("Shift Gear");
	}
	
	void break_car()
	{
		System.out.println("Car is Stopped");
	}
	
	void carparking()
	{
		System.out.println("Car is Parked");
	}
	
	void display()
	{
		System.out.println("\n Size:" +size +"\n Car_No:"+no + "\n Car Name:" +name +
				"\n Brand:" + brand);
	}
	

public static void main(String args[])
{
	 Vehicle v=new Vehicle();
	 v.start();//method calling
	 v.speed();
	 v.gearshifting();
     v.break_car();
     v.carparking();
     v.display();
}
}


