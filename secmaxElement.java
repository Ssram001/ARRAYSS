package Array;


import java.util.Scanner;

public class secmaxElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        for (int i =0;i<arr.length;i++){
            if (arr[i]>secmax && arr[i]!=max ){
                secmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
