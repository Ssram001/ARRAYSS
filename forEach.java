package Array;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }


        for (int ele : arr){
            System.out.println(ele);
        }

    }
}
