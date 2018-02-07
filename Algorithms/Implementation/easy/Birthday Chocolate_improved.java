import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Answer time > Reading&Understaing Q.
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] choco=new int[n];
		for(int i=0; i<n;i++){
			choco[i]=in.nextInt();
		}
		int d=in.nextInt();
		int m=in.nextInt();
		int result=0;
			for(int i=0;i<=n-m;i++){
				int temp=0;
				for(int j=i;j<m+i;j++){
					temp+=choco[j];
				}
				if(temp==d)
					result++;
			}
        //전의 추가조건은 필요가 없음. 어짜피 for문은 한번만 실행되니까
		System.out.println(result);
		
		
	}
}
