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
        //���� �߰������� �ʿ䰡 ����. ��¥�� for���� �ѹ��� ����Ǵϱ�
		System.out.println(result);
		
		
	}
}
