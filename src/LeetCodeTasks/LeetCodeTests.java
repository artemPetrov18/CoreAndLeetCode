package LeetCodeTasks;

import java.util.Arrays;
import java.util.List;

public class LeetCodeTests {
    public static void main(String[] args) {
        int[] profits={2,8,6,1};
        int[] capital={0,2,1,1};
        int w =0,k=3;
        System.out.println(findMaximizedCapital(k,w,profits,capital));

    }
    public static int maxProfit(int w, int[] profits, int[] capital,int iterator){

        int maxProfit=0;
        int index=-1;
        System.out.println(Arrays.toString(capital));
        for(int i=0;i<capital.length-iterator;i++){
            if(w>=capital[i] && (profits[i])>maxProfit){
                maxProfit=profits[i];
                index=i;
            }

        }
        System.out.println(index);
        return index;

    }






    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int iterator=0;

        while(iterator<k){
            int funktion=maxProfit(w,profits,capital,iterator);
            if(funktion>=0){
                w+=profits[funktion];
                int temp;
                temp=capital[funktion];
                capital[funktion]=capital[capital.length-1-iterator];
                capital[capital.length-1-iterator]=temp;

                temp=profits[funktion];
                profits[funktion]=profits[profits.length-1-iterator];
                profits[profits.length-1-iterator]=temp;

            }

            iterator++;
        }


        return w;

    }
}
