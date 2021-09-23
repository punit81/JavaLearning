package LearnLambdaExpressions;
interface CalcArea1{
	double area();
}
class Rectangle1 implements CalcArea1{
	public double length;
	public double breadth;
	public Rectangle1() {
		this.length=0.0;
		this.breadth=0.0;
	}
	public Rectangle1(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double area() {
		return length*breadth;
	}
}
class Circle1 implements CalcArea{
	public double radius;
	public Circle1() {
		this.radius=0.0;
	}
	public Circle1(double radius) {
		this.radius=radius;
	}
	public double area() {
		return 3.14*radius*radius;
	}
}

public class Codewithoutlambdaexpression {
	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1(4,5);
		Circle1 c=new Circle1(6);
		
		System.out.println("Area of rectangle:"+r.area());
		System.out.println("Area of circle:"+c.area());
	}
}
