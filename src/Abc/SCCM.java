package Abc;

interface Shape{
	final double PI = 3.14;
	double area();
}

class Circle implements Shape{
	double radius;
	public Circle(double r) {
		this.radius = r;
	}
	@Override
	public double area() {
		return PI*radius*radius;
	}
	public double perimeter() {
		return PI*2*radius;
	}
}

class Cylinder extends Circle{
	double height;
	public Cylinder(double r,double height) {
		super(r);
		this.height = height;
	}
	
	public double area() {
		return 2*super.area()+super.perimeter()*height;
	}
	
	public double volume() {
		return area()*height;
	}
}

public class SCCM {
	public static void main(String[] args) {
		Circle cir1 = new Circle(2);
		Circle cir2 = new Circle(6);
		System.out.println("c1 area:"+cir1.area()+" per:"+cir2.perimeter());
		System.out.println("c2 area:"+cir2.area()+" per:"+cir2.perimeter());
		
		Cylinder c1 = new Cylinder(2, 3);
		Cylinder c2 = new Cylinder(3, 6);
		
		System.out.println("c1 area:"+c1.area()+" per:"+c1.volume());
		System.out.println("c2 area:"+c2.area()+" per:"+c2.volume());
	}
}
