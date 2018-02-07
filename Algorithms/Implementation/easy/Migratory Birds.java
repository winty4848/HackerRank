import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[5];
		for(int i=0; i<n; i++) {
			int temp=in.nextInt();
			arr[temp-1]++;
		}
		int result=0;
		int max_type=arr[result];
		
		for(int i=1; i<5; i++) {
			if(arr[i]>max_type) {
				max_type=arr[i];
				result=i;
			}
		}
		System.out.println(result+1);
		
		
	}


}
