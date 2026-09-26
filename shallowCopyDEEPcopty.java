package Array;

import java.util.Arrays;
import java.util.Scanner;

public class shallowCopyDEEPcopty {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//         int j = sc.nextInt();
//
//        for (int i =0; i<arr.length; i++){
//            arr[i]= sc.nextInt();
//        }
//
//        int[] z = arr;//Shallow copy
//        z[j] = sc.nextInt();
///// /function also follow shallow copy concept
//
//        int[]  deep= Arrays.copyOf(arr,arr.length);//it give us a deep copy of any array
//        deep[j] = sc.nextInt();
//
//        for (int i =0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        for (int i =0; i<z.length; i++){
//            System.out.print(z[i]+" ");
//        }
//
//        for (int i =0; i < deep.length; i++){
//            System.out.print(deep[i]+" ");
//        }
//
//
//    }
//
//}

 // BOTH ARE CORRECT CODE DON'T CHANGE ANY CODE



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print(" enter the changing index: ");
        int j = sc.nextInt(); // index to modify

        // input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Deep copy FIRST
        int[] deep = Arrays.copyOf(arr, arr.length);

        //another method of deep copy
        int[] brr = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            brr[i]=arr[i];
        }




        // ✅ Shallow copy
        //int[] z = arr;

        // modify shallow copy
       // z[j] = sc.nextInt();   // affects arr

        // modify deep copy
        deep[j] = sc.nextInt(); // does NOT affect arr

        // print original array
        System.out.println("Original / Shallow affected array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//        System.out.println("\nShallow copy:");
//        for (int i = 0; i < z.length; i++) {
//            System.out.print(z[i] + " ");
//        }

        System.out.println("\nDeep copy:");
        for (int i = 0; i < deep.length; i++) {
            System.out.print(deep[i] + " ");
        }
    }
}
