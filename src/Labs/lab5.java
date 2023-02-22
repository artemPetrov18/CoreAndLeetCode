package Labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lab5 {
    public static void main(String[] args) {

int n=10;
        List<String> list =new ArrayList<>();

        for(int  i=1;i<n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);

}}
