import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[100];
		int result=0;
		for(int i=0; i<n; i++){
			int temp=in.nextInt();
			arr[temp-1]++;
		}
		for(int i=0; i<100; i++){
			if(arr[i]>0){
				result+=arr[i]/2;
			}
		}
		System.out.println(result);
	}
}
