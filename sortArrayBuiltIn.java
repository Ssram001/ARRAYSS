package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sortArrayBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        // input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//       Arrays.sort(arr);
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


//        for (int i = 0; i < arr.length; i++) {
//            if (i%2 ==1) {
//                System.out.print(2*arr[i] + " ");
//            }
//            else {
//                System.out.print((arr[i]+10)+" ");
//            }
//            System.out.println();
//        }



        //question---search in array

//        int target = sc.nextInt();
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//               flag = true;
//                break;
//            }
//
//        }
//        if (flag == true){
//            System.out.print("Element is present in the array ");
//        }
//        else {
//            System.out.print("Element is not present in the array ");
//        }



    }
}
