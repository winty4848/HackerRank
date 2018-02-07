import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int max, min;
		int best=0, worst=0;
		int[] arr=new int[n];
		int i=1;
		arr[0]=in.nextInt();
		max=arr[0];
		min=arr[0];
		
		while(i<n){
			arr[i]=in.nextInt();
			if(arr[i]>max){
				max=arr[i];
				best++;
			}
			else if(arr[i]<min){
				min=arr[i];
				worst++;
			}
			i++;
		}
		System.out.print(best+" "+worst);
	}
}
