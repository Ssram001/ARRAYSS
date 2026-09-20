package Array;

import java.util.Scanner;

public class missingElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextLong();
        }
        long m = n+1;
        long sum = m*(m+1)/2;
        long sum1 = 0;
        for (int i=0;i<arr.length;i++){
           sum1+=arr[i];
        }

        System.out.println("The missing element is "+(sum - sum1));
    }
}
