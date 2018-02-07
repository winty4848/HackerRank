import java.util.Scanner;
import java.util.Arrays;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] a_arr=new int[n];
		for(int i=0;i<n;i++){
			a_arr[i]=in.nextInt();
		}
		int[] b_arr=new int[m];
		for(int i=0;i<m;i++){
			b_arr[i]=in.nextInt();
		}

		Arrays.sort(a_arr);
		Arrays.sort(b_arr);
		int count=0;
        /*�ð����⵵ ���.
        a_arr�� ���� ū ��Һ��� ���� ���� ���� ������Ű�� x�� ����
        b_arr�� ���� ���� ��Һ��� ū ���� ���� ������Ű�� x�� ����.*/
		for(int i=a_arr[n-1]; i<=b_arr[0];i++){
			int result=0;
			for(int j=0;j<n;j++){
				result+=i%a_arr[j];
			}
			for(int k=0;k<m;k++){
				result+=b_arr[k]%i;
			}
			if(result==0)
				count++;
		}

		System.out.println(count);
		
		
	}
}
