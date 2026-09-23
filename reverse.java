package Array;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        //int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //for loop give only odd input's reverse and it run to n/2 times only buz if we run full loop it again reverse the elements and give same output

        int i = sc.nextInt();
        int j = sc.nextInt();
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
