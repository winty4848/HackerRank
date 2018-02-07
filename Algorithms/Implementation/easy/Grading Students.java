import java.util.Scanner; 

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int grade;
		int[] result=new int[number];
		for(int i=0; i<number; i++){
			grade=in.nextInt();
			if(grade<38){
				result[i]=grade;
			}
			else{
				if(5-grade%5<3){
					result[i]=grade+(5-grade%5);
				}
				else
					result[i]=grade;
			}
			
		}
		for(int i=0; i<number; i++){
			System.out.println(result[i]);
		}
	}
}