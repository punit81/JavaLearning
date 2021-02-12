package LearnStrings;
import java.util.Scanner;
interface chk_anagram{
	void chanagram(String str1,String str2);
}
public class CheckAnagram {
	public static void main(String[] args) {
		String str1,str2;
		System.out.println("Enter the first String:");
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		System.out.println("Enter the Second String:");
		str2=s.nextLine();
		chk_anagram chk=(st1,st2)->{
			boolean flag=false;
			if(st1.length()!=st2.length())
			{
				System.out.println("Not anagram...!");
				flag=true;
			}
			else{
				for(String a:st1.split("")) {
					if(!st2.contains(a)) {
						System.out.println("Not Anagram...!");
						flag=true;
					}
				}
				if(!flag)
					for(String a:st2.split("")) {
						if(!st1.contains(a)) {
							System.out.println("Not Anagram...!");
							flag=true;
						}
					}
			}
			if(!flag) {
				System.out.println("Strings are anagram !");
			}
		};
		chk.chanagram(str1, str2);
	}
}
