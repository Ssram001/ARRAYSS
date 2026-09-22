package Array;


import java.util.*;


public class otherDataTYPES {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String x = "Ram is a good";
//        String[] arr = {"Ram", "Sabyasachi", "Boy"};
//
//        for (int i=0;i<arr.length;i++)
//            System.out.print(arr[i]+" ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }


        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        change(arr);

        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


        }
    public static void change(int[] x){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
         x[i] = sc.nextInt();
    }
}
