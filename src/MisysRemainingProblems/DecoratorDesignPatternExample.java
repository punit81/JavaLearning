package MisysRemainingProblems;
interface Food {
	String getName();
	double getPrice();
}
class VegFood implements Food{
	public String getName() {
		// TODO Auto-generated method stub
		return "Veg Food";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 60.0;
	}
	
}
abstract class NonVegFoodDecorator implements Food{
	private Food food;
	public NonVegFoodDecorator(Food food) {
		this.food=food;
	}
	public String getName() {
		return food.getName();
	}
	public double getPrice() {
		return food.getPrice();
	}
}
class ChineseFood extends NonVegFoodDecorator{

	public ChineseFood(Food food) {
		super(food);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+" with Manchurian and chicken soup";
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+40.0;
	}
	
}
class IndianNonVegFood extends NonVegFoodDecorator{

	public IndianNonVegFood(Food food) {
		super(food);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+" with Indian Non-Veg Curry";
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+50.0;
	}
	
}
public class DecoratorDesignPatternExample {

	public static void main(String[] args) {
		Food food=new VegFood();
		System.out.println("Food Name:"+food.getName()+"\tPrice:"+food.getPrice());
		Food food1=new IndianNonVegFood(new VegFood());
		System.out.println("Food Name:"+food1.getName()+"\tPrice:"+food1.getPrice());
		Food food2=new ChineseFood(new VegFood());
		System.out.println("Food Name:"+food2.getName()+"\tPrice:"+food2.getPrice());
	}

}
