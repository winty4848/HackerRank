import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//[time complexity] 
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();//³ª´­ ¼ö
		int[] arr=new int[n+1];
		int result=0;
		for(int i=0; i<n; i++){
			int temp=in.nextInt()%k;
			if(temp==0){
                temp=k;
            }
            result+=arr[k-temp];
            if(temp==k){
                temp=0;
            }
			arr[temp]++;			
		}
		System.out.println(result);

	}
}
