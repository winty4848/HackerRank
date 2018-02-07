import java.util.Scanner;

public class Solution {

    static void staircase(int n) {
        for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}//앞부분 띄우기
			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}
            System.out.println("");
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
