import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x1=in.nextInt();
		int v1=in.nextInt();
		int x2=in.nextInt();
		int v2=in.nextInt();
		
		//���ǹ� ���� �ٲٸ� / by zero ���ü��� �ִ�.
		if((v1>v2)&&((x2-x1)%(v1-v2)==0)){
			int temp=(x2-x1)/(v1-v2);
			if((x2+v2*temp)==(x1+v1*temp)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		else{
			System.out.println("NO");
		}
	}
}
