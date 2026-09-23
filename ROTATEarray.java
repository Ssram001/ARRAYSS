package Array;

import java.util.Scanner;

public class ROTATEarray {

//    public static void reverse(int[] arr,int i,int j){
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();

        }

        int d = sc.nextInt();
//        int m = d%n;
        int k = arr.length-1;


//        reverse(arr,0,m-1);
//        reverse(arr,m,k);
//        reverse(arr,0,k);
//
//        for(int i =0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//        WRONG CODE
//        int idx =0;
//        int[] brr = new int[n];
//
//        for(int i=d;i< arr.length;i++){
//            brr[i]= arr[idx];
//            idx++;
//        }
//        for(int i=0;i<d;i++){
//            brr[i]= arr[idx];
//            idx++;
//        }
//        for(int i =0;i<= k;i++){
//            System.out.print(brr[i]+" ");
//        }

//        CORRECT CODE
        int idx =0;
        int[] brr = new int[n];

        for(int i=d;i< arr.length;i++){
            brr[idx]= arr[i];
            idx++;
        }
        for(int i=0;i<d;i++){
            brr[idx]= arr[i];
            idx++;
        }
        for(int i =0;i<= k;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
