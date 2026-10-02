package Array;

import java.util.Scanner;

public class twoSumProblem {

    public static boolean twosum(int[] brr ){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<brr.length;i++){
            brr[i]= sc.nextInt();
        }

        int target = sc.nextInt();

        for(int i=0;i<brr.length;i++){
            for(int j=i+1;j<brr.length;j++){
                if (brr[i]+brr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(twosum(arr));
    }
}
