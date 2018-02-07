import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int money=in.nextInt();
		int keyboard=in.nextInt();
		int usb=in.nextInt();
		int[] money_key=new int[keyboard];
		for(int i=0; i<keyboard; i++){
			money_key[i]=in.nextInt();			
		}
		int[] money_usb=new int[usb];
		for(int i=0; i<usb; i++){
			money_usb[i]=in.nextInt();
		}
		int max=0;
		for(int i=0; i<keyboard; i++){
			for(int j=0; j<usb; j++){
				int temp=money_key[i]+money_usb[j];
				if(temp>max&&temp<=money){
					max=temp;
				}				
			}
		}
		if(max>0){
			System.out.println(max);
		}
		else{
			System.out.println(-1);
		}
	}
}
