import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();//back starting
		int p=in.nextInt();//searching
		int front=0;
		int back=0;
		if(n%2==1) {
			n-=1;
		}
		int temp=1;
		while(temp<p) {
			front++;
			temp+=2;
		}
		temp=n;
		while(temp>p) {
			back++;
			temp-=2;
		}
		if(front>=back) {
			System.out.println(back);
		}
		else {
			System.out.println(front);
		}

		
	}


}
