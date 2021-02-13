package MisysRemainingProblems;
import java.util.ArrayList;
public class FindMaxSum1 
{ 
    /*Function to return max sum such that no two elements 
      are adjacent */
    int FindMaxSum(int arr[], int n) //copied code
    { 
        int incl = arr[0]; 
        int excl = 0; 
        int excl_new; 
        int i; 
  
        for (i = 1; i < n; i++) 
        { 
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl; 
  
            /* current max including i */
            incl = excl + arr[i]; 
            excl = excl_new; 
        } 
  
        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl); 
    } 
    public int findmaxsum(int arr[]) {  ///mycode
    	int max=0,tempmax=0;
    	for(int i=0;i<arr.length;i++) {
    		for(int k=0;k<arr.length;k++) {
    			tempmax=arr[i];
    			for(int j=2+i;j<arr.length;j+=2+k) {
    				tempmax+=arr[j];
    				if(tempmax>max)
    					max=tempmax;
    			}
    		}
    	}
    	return max;
    }
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        FindMaxSum1 sum = new FindMaxSum1(); 
        //int arr[] = new int[]{3,2,5,10,17,7,12,1,100};
        int arr[] = new int[]{5, 5, 10, 100, 10, 5}; 
        System.out.print('[');
        for (int i: arr)
        	System.out.print(i+",");
        System.out.print("]\n");
        System.out.println(sum.FindMaxSum(arr, arr.length));
        System.out.println(sum.findmaxsum(arr));
    } 
} 