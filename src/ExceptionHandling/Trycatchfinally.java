package ExceptionHandling;

import java.io.IOException;

public class Trycatchfinally {
public static void method(){
	try {
		throw new Error("Thrown an I/O Exception");
	}
	finally {
		System.out.println("In finally");
	}
}
	public static void main(String[] args) {
		try {
			method();
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		/*catch(Error e) {
			System.out.println("Error Occured");
		}*/
		catch(Throwable th) {
			System.out.println(th.getStackTrace());
		}

	}

}
