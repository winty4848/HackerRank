import java.util.Scanner;

/* ���� Day_of_the_Programmer�� �������̾��ٸ� ��ó�� �����ؾ� �� ��.
������ ���������� ������ �����̱⿡ �̸� ��¥ ����Ͽ� �˰��� �����ϸ�
���� Ǯ�� �ð��� ª����. */

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
