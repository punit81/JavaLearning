package LearnLambdaExpressions;

interface CalcArea{
	double area();
}
class Rectangle{
	public double length;
	public double breadth;
	public Rectangle() {
		this.length=0.0;
		this.breadth=0.0;
	}
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
}
class Circle{
	public double radius;
	public Circle() {
		this.radius=0.0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
}
public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(4,5);
		Circle c=new Circle(6);
		
		CalcArea areaofrectangle=()->{return r.length * r.breadth;};
		
		System.out.println("Area of rectangle:"+areaofrectangle.area());
		
		CalcArea areaofCircle=()->{return 3.14*c.radius*c.radius;};
		System.out.println("Area of circle:"+areaofCircle.area());
	}

}
