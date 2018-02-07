import java.util.Scanner; 

//more simple. no repeat
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();//back starting
		int p=in.nextInt();//searching
		int result;
		if((p%2==1)&&(p!=1)) {
			p--;
		}
		if(n-p>p-1) {
			result=p/2;
		}
		else {
			result=(n-p)/2;
		}
		System.out.println(result);
		
	}


}
