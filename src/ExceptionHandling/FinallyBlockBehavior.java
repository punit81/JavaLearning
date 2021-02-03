package ExceptionHandling;

public class FinallyBlockBehavior {

	public static void main(String[] args) {
		try {
			int d=5/0;
		}
		catch(NullPointerException n){
			System.out.println(n);
		}
		finally {
			System.out.println("In finally");
		}
		System.out.println("Outside Finally");
	}

}
