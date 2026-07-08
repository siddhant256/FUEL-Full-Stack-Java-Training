package polymorphismeg;
// Method Overriding
class Animals 
{
void sound()
{
	System.out.println("Animal Sound");
}
}
class Dog
{
	void sound()
	{
		System.out.println("Dogs Barks");
	}	
}

class Cat
{
	void sound()
	{
		System.out.println("Meow");
	}	
}

class Animal
{
	public static void main(String args[])
	{  
		
		Animals  a=new Animals();
		a.sound();
		Dog d=new Dog();
		d.sound();
		Cat c=new Cat();
		c.sound();
	}
}

