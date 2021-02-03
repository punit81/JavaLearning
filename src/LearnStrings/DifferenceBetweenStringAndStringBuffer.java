package LearnStrings;
import java.lang.StringBuffer;
public class DifferenceBetweenStringAndStringBuffer {
	public static void main(String[] args) {
		String s="Hello";
		s.concat(" World!");
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" World!");
		System.out.println(s);//output "Hello" as String class is immutable
		System.out.println(sb);//output "Hello World!" as StringBuilder class is mutable
	}

}
