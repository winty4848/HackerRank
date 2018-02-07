import java.io.*;
import java.util.*;

public class Solution {
    static int getSum(int n, int array[][]){
        int first=0;
        int second=0;
        int result=0;
        for(int i=0; i<n; i++){
            first=first+array[i][i];
        }
        for(int i=0; i<n; i++){
            second=second+array[n-i-1][i];
        }
        result=(first-second<0?(first-second)*-1:first-second);
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][]=new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j=0; j< n; j++)
                arr[i][j] = in.nextInt();
        }    
        int SI=getSum(n,arr);
        System.out.println(SI);
    }
}