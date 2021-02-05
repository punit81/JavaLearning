package Overridingmethhods;
class address{
	String City;
	int pincode;
	public address(){
		City="";
		pincode=0;
	}
	public address(String City,int pincode){
		this.City=City;
		this.pincode=pincode;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
class Person implements Cloneable{
	int age;
	String name;
	address add;
	int places[]=new int[2];
	public Person() {
		age=0;
		name="";
		add=new address();
	}
	public Person(int age,String name,address add){
		this.age=age;
		this.name=name;
		this.add=add;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class Cloning {

	public static void main(String[] args)throws CloneNotSupportedException {
		Person p1=new Person(15,"xyz",new address("New York",841210));
		p1.places[0]=1;
		p1.places[1]=2;
		Person p2=(Person)p1.clone();
		System.out.println("\nAge:"+p1.getAge()+"\nName:"+p1.getName()+"\nCity:"+p1.add.getCity()+"\nPincode:"+p1.add.getPincode()+"\nPlaces:"+p1.places[0]+" "+p1.places[1]);
		System.out.println("\nAge:"+p2.getAge()+"\nName:"+p2.getName()+"\nCity:"+p2.add.getCity()+"\nPincode:"+p2.add.getPincode()+"\nPlaces:"+p2.places[0]+" "+p2.places[1]);
		p2.setAge(56);
		p2.add.setCity("Nevada");
		p2.setName("Pqr");
		p2.places[0]=3;
		System.out.println("\nAge:"+p1.getAge()+"\nName:"+p1.getName()+"\nCity:"+p1.add.getCity()+"\nPincode:"+p1.add.getPincode()+"\nPlaces:"+p1.places[0]+" "+p1.places[1]);
		System.out.println("\nAge:"+p2.getAge()+"\nName:"+p2.getName()+"\nCity:"+p2.add.getCity()+"\nPincode:"+p2.add.getPincode()+"\nPlaces:"+p2.places[0]+" "+p2.places[1]);
	}
}