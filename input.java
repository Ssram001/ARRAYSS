package Array;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

//        inserting inputs
        for (int i = 0; i < arr.length; i++) {
//            int x = sc.nextInt();
//            arr[i]=x;
//    or
            arr[i] = sc.nextInt();

        }

//      output
//        for (int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


//  print negative value only
//        for (int i =0;i<arr.length;i++){
//            if(arr[i]<0) {
//                System.out.print(arr[i] + " ");
//            }
//        }


//        int sum =0;
//        for (int i =0;i<arr.length;i++){
//            sum += arr[i];
//        }
//        System.out.println(sum);
//


//        int product =1;
//        for (int i =0;i<arr.length;i++){
//            product *= arr[i];
//        }
//        System.out.println(product);


        //METHOD---1
//        int max = arr[0] ;
//        OR
//        int max = Integer.MIN_VALUE;
//        for (int i =0;i<arr.length;i++){
//           if(arr[i]>max){
//               max = arr[i];
//           }
//        }
//        System.out.println(max);

        //METHOD--2
//        int max = arr[0] ;
//        OR
//        int min = Integer.MAX_VALUE;
//        for (int i =0;i<arr.length;i++){
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);


        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }


}
