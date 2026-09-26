package Array;

import java.util.Scanner;

public class segerate0and1 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        int numOfzeros = 0;
//        int numOfones = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                numOfzeros++;
//            }
//            else if(arr[i]==1){
//                numOfones++;
//            }
//        }
//
//        for(int i=0;i<numOfzeros;i++){
//            arr[i]=0;
//        }
//        for(int i=numOfzeros;i<n;i++){
//            arr[i]=1;
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        int i = 0;
        int j = arr.length-1;
        while (i<j){
           if(arr[i] ==0){
               i++;
           }
           else if(arr[j] ==1){
               j--;
           }
           else if (arr[i] ==1 && arr[j] ==0){
               int temp =arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;

           }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
}
