import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		int flag=0;
		int result=0;
		for(int i=0; i<n; i++){
			char c;
			c=s.charAt(i);
			if(c=='U'){
				flag++;
				if(flag==0){
					result++;
				}
			}
			else{
				flag--;
			}

				
		}		
		System.out.println(result);
	}
}
