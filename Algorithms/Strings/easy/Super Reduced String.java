import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		StringBuilder result=new StringBuilder(in.next());
		for(int i=1; i<result.length(); i++){
			char first=result.charAt(i-1);
			char second=result.charAt(i);
			if(first==second){
				result.delete(i-1, i+1);
				i=i-2;
				if(i<0){
					i=0;
				}
			}
			
		}
		
		if(result.length()==0){
			System.out.println("Empty String");
		}
		else{
			System.out.println(result);
		}
		
	}
}
