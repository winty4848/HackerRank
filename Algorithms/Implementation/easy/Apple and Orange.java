import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 int house_starting=in.nextInt();
		 int house_ending=in.nextInt();
		 int appletree=in.nextInt();
		 int orangetree=in.nextInt();
		 int num_apple=in.nextInt();
		 int num_orange=in.nextInt();
		 
		 int result=0, result2=0;
		 for(int i=1;i<=num_apple;i++) {
			 int temp=in.nextInt();			 
			 if(temp>0) {
				 if((appletree+temp>=house_starting)
						 &&(appletree+temp<=house_ending)) {
					 result++;
				 }
			 }
			 
		 }//apple
		 for(int i=1;i<=num_orange;i++) {
			 int temp=in.nextInt();
			 if(temp<0) {
				 if((orangetree+temp<=house_ending)
						 &&(orangetree+temp>=house_starting)) {
					 result2++;
				 }
			 }			 
		 }//orange
		 System.out.println(result);
		 System.out.println(result2);
		 
	}

}
