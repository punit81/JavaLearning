package MisysRemainingProblems;
import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicatePart2 {
	public static void main(String[] args) {
		int[] a=new int[] {5,5,5,11,11,12,13,14,14,14,78,89,89,89,100};
		List<Integer> a1=new ArrayList<Integer>();
		int i=1,num=a[0],j=0;
		a1.add(num);
		while(i<a.length) {
			if(num!=a[i]) {
				num=a[i];
				a1.add(num);
			}
			i++;
		}
		System.out.println(a1);
	}

}
