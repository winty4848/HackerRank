import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int actual=0;
		for(int i=0; i<n; i++) {
			int temp=in.nextInt();
			if(i!=k) {
				actual+=temp;
			}
		}
		actual/=2;
		int charged=in.nextInt();
		if(actual==charged) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(charged-actual);
		}
		
	}


}
