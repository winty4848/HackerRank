import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 
		 int number, height, temp, result=1;
		 number=in.nextInt();
		 height=in.nextInt();
		 temp=height;
		 
		 if(number>1) {
			 for(int i=2; i<=number; i++) {
				 height=in.nextInt();
				 if(height==temp) {
					 result++;				 			 
				 }//현재 최대값
				 else if(height>temp) {
					 temp=height;
					 result=1;
				 }
			 }
		 
		 }
		 System.out.println(result);
	}

}

