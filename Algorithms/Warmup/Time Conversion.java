import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String time=in.nextLine();
		String result;
		int i;
		result=time.substring(0,2);
		i=Integer.parseInt(result);
		result=time.substring(8);
		if(result.equals("PM")){
			if(i<12)
				i+=12;
			result=Integer.toString(i);
		}
		else if(result.equals("AM")){
			if(i==12){
				result="00";
			}
			else if(i<=9){
				result="0"+Integer.toString(i);
			}
		}
		result=result+":"+
		time.substring(3,5)+":"+time.substring(6,8);
		System.out.println(result);
	}

}