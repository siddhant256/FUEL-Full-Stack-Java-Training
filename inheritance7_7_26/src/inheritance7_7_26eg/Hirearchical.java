package inheritance7_7_26eg;

 class Shape 
 {	 

}
 class Circle extends Shape
 {
	 void area()
	 {
		 double radius=10;
		 double area=3.14 * radius * radius;
		 System.out.println("Area Of Circle:"+area);
		 
	 }
 }
 class Rectangle extends Shape
 {
	 void area()
	 {
		 int length=10;
		 int breadth=20;
		 int area=length*breadth;
		 System.out.println("Area Of Rectangle:"+area);
		 
	 }
 }
 
 class Hirearchical
 {
	 public static void main(String args[])
	 {
		 Rectangle r=new Rectangle();
		 Circle c=new Circle();
		 c.area();
		 r.area();
		 
	 }
 }
 
 
