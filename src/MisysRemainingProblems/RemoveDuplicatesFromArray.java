package MisysRemainingProblems;
import java.util.Set;
import java.util.LinkedHashSet;
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,1,3,5,2,1,5,7,3,42,4,678,3,2,9,2,4};
		Set<Integer> deduplicatedset=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			deduplicatedset.add(a[i]);
		}
		Integer[] a1=new Integer[deduplicatedset.size()];
		a1=deduplicatedset.toArray(a1);
		System.out.print("[");
		for(Integer i:a1) {
			System.out.println(i+",");
		}
		System.out.print("]");
	}

}
