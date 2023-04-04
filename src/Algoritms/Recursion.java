package Algoritms;

public class Recursion {
// Основан на рекурсии ,разделяй и властвуй , относиться к бинароному поиску тоже
// В основе рекурсии лежыт базовий и рекурсивний случай
    /*базовий в масиве это чаще всего 1 два елементи
    в факториале это  if(k==1)return 1;*/

    public static void main(String[] args) {
        System.out.println(fack(6));

    }

    public static int fack(int k){
        if(k==1)return 1;

        return k*fack(k-1);

    }
}
