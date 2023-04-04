package LeetCodeTasks;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
       char[]a={'a','b','b','c','c','k','k'};
        System.out.println(compress(a));
        System.out.println(a);

    }
    public static int compress(char[] chars) {
        if(chars.length==1)
            return 1;
        char temp=chars[0];
        int counter=1,iterator=0;

        for(int i=1;i<chars.length;i++){
            System.out.println(chars[i]);
            if(temp==chars[i]){
                System.out.println("1 "+chars[i]);
                counter++;
            }
            else if(temp!=chars[i] && counter==1){
                System.out.println("2 "+chars[i]);
                chars[iterator]=temp;
                temp=chars[i];
                iterator++;
            }
            else if(temp!=chars[i]||i==chars.length-1){
                System.out.println("3 "+chars[i]);
                chars[iterator]=temp;
                iterator++;
                chars[iterator]=String.valueOf(counter).charAt(0);
                iterator++;
                temp=chars[i];
                counter=1;
            }

        }
        chars[iterator]=temp;
        iterator++;
        chars[iterator]=String.valueOf(counter).charAt(0);
        return iterator+1;
    }
}
