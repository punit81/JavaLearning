package LearnStrings;

public class StringsComparison {

	public static void main(String[] args) {
		String st1="Hello";
		String st2="Hello";
		String st3=new String("Hello");
		System.out.println(st1==st2);	//true
		System.out.println(st1.equals(st2));//true
		System.out.println(st1==st3);//false
		System.out.println(st1.equals(st3));//true
		
		String st4=new String("Hello World !");
		String st5=st4.intern(); //using intern method
		String st6="Hello World !";
		
		System.out.println(st4==st5);	//false
		System.out.println(st4.equals(st5));//true
		System.out.println(st5==st6);//true
		System.out.println(st5.equals(st6));//true
		
	}

}
