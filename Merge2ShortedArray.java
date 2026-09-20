package Array;

import java.util.Arrays;

public class Merge2ShortedArray {
    static void main(String[] args) {
// Using 3 pointer tecniques
        int [] a = {2, 5 ,6, 9, 20};
        int [] b = {1, 3, 4, 5, 7, 8};

        int [] c = new int[a.length + b.length];
        for( int ele : c) System.out.print(ele+" ");
        System.out.println();
        merge(a,b,c);
        for( int ele : c) System.out.print(ele+" ");
        System.out.println();


    }
    private static void merge(int [] a, int [] b, int [] c) {
        int i=0, j =0, k=0;
//        int max=  Math.max(a.length,b.length);

        while(i<a.length && j<b.length){// if we use use || then compairing after 1 arr end not possible
            if(a[i]<=b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
             else{
                    c[k]=b[j];
                    j++;
                    k++;

            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
