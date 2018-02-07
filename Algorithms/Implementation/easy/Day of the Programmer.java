import java.util.Scanner;

/* 만약 Day_of_the_Programmer가 유동적이었다면 밑처럼 구성해야 할 것.
하지만 문제에서는 고정된 상태이기에 미리 날짜 계산하여 알고리즘 구성하면
문제 풀이 시간은 짧아짐. */

public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int Day_of_the_Programmer=256;
		int y=in.nextInt();
		int feb;
		int month=0;
		int day=Day_of_the_Programmer;
		if(y<=1917){
			if(y%4==0){
				feb=29;
			}
			else
				feb=28;
		}
		else if(y==1918){
			feb=15;//28-14+1
		}
		else{
			if(((y%4==0)&&(y%100!=0))||(y%400==0))
				feb=29;
			else
				feb=28;
		}
		
		int temp=0;
		while(day>0){
			month++;
			if(month==2){
				day-=feb;
				temp=feb;
			}
			else if(month<=7){
				if(month%2==1){
					day-=31;
					temp=31;
				}
				else{
					day-=30;
					temp=30;
				}
			}
			else{
				if(month%2==1){
					day-=30;
					temp=30;
				}
				else{
					day-=31;
					temp=31;
				}	
			}
		}
		day+=temp;
		if(day<10){
			System.out.print("0");
		}
		System.out.print(day+".");
		if(month<10){
			System.out.print("0");
		}
		System.out.print(month+"."+y);
	}
}
