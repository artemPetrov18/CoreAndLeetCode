package Algoritms;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class BinarySearch {


    /*
    * Один из самих быстрих способов поиска с скооростью O(logN)
    * Работает только на отсортированих даних
    *
    *
    * */

    public static void main(String[] args) {

        int[]arr=new int[100];

        Arrays.copyOf(arr,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        int startElem=0,
            lastElem=arr.length-1,
            targetElem=30;

        while(startElem<=lastElem){
            int midElem=(startElem+lastElem)/2;

            if(arr[midElem]==targetElem){
                System.out.println("InsideLoop"+arr[midElem]);  //return arr[midElem]
            }
            if(arr[midElem]<targetElem)
                startElem=midElem+1;
            else
                lastElem=midElem-1;

        }
        System.out.println("afterLoop "+startElem);

    }

}
