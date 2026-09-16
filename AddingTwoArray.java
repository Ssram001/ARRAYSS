package Array;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;


//public class AddingTwoArray {

//    public static ArrayList<Integer> addTwoArrays(int [] arr1, int[] arr2) {
//        ArrayList<Integer> list = new ArrayList<>();
//        {
//            int arr1Length = arr1.length;
//            int arr2Length = arr2.length;
//
//            int carry = 1;
//            if (arr1Length > arr2Length) {
//                for (int i = 0; i < arr1Length; i++) {
//                    if (arr1[i] +arr2[i] <=9) {
//                        list.add(arr1[i]+arr2[i]);
//                        carry = 0;
//
//                    }
//                    else {
//                        list.add(0);
//                        carry = 1;
//                    }
//
//                }
//                if  (carry == 1) {
//                    list.add(1);
//                }
//            }
//            else if (arr1Length < arr2Length) {
//                for (int i = 0; i < arr2Length; i++) {
//                    if (arr2[i] +arr1[i] <=9) {
//                        list.add(arr2[i]+arr1[i]);
//                        carry = 0;
//
//                    }
//                    else {
//                        list.add(0);
//                        carry = 1;
//                    }
//
//                }
//                if  (carry == 1) {
//                    list.add(1);
//                }
//            }
//            Collections.reverse(list);
//            return list;
//        }
//
//    }
//    public static void reverse(int [] arr){
//        int i=0;
//        int j=arr.length-1;
//        while (i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//    }
//
//    public static void userinput(int [] arr){
//        Scanner sc  = new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//    }
//     public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        int m = sc.nextInt();
//        int [] brr = new int[m];
//        System.out.println("Enter the 1st array");
//        userinput( arr);
//        System.out.println("Enter the 2nd array");
//        userinput( brr);
//
//        reverse(arr);
//        reverse(brr);
//
//        ArrayList<Integer> result = addTwoArrays(arr,brr);
//        System.out.println(result);
//
//    }
//}

import java.util.*;

public class AddingTwoArray {

    public static ArrayList<Integer> addTwoArrays(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            list.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(list);

        return list;
    }

    public static void userinput(int[] arr) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int m = sc.nextInt();
        int[] brr = new int[m];

        System.out.println("Enter the 1st array");
        userinput(arr);

        System.out.println("Enter the 2nd array");
        userinput(brr);

        ArrayList<Integer> result = addTwoArrays(arr, brr);

        System.out.println(result);
    }
}