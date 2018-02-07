import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long[] result=new long[5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				result[i]=result[i]+arr[j];
			}
			result[i]=result[i]-arr[i];
		}
        long min=result[0], max=result[0];
		for(long i : result) {
			if(min>i)
				min=i;
			if(max<i)
				max=i;
		}
		System.out.println(min+" "+max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}