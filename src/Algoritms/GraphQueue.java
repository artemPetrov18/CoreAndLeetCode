package Algoritms;

import java.util.*;

public class GraphQueue {
    // Поиск в ширину сначала посящаються все узлы порвого круга и ставяться в очередь потом второй круг
    /* а потом уже проверяеться на условие
    *
    *
    *
    * */


    public static void main(String[] args) {
        HashMap<String, HashMap<String,Boolean>> hs=new HashMap<>();
        hs.put("Artem",new HashMap<>(){{
            put("Ivan",false);
            put("Jenya",false);
            put("Artem",false);
        }});
        hs.put("Ivan",new HashMap<>(){{
            put("Ivan",false);
            put("Jora",false);
            put("Senya",false);
        }});
        hs.put("Jenya",new HashMap<>(){{
            put("Jenya",false);
            put("Putya",false);
            put("Lemda",true);
        }});

        System.out.println(hs.get("Artem").entrySet());
        Btc(hs,"Artem");


    }

    public static void Btc(HashMap<String, HashMap<String,Boolean>> hs,String name){
        Queue<Map.Entry<String, Boolean>> queue = new ArrayDeque<>();
        ArrayList<String> arrayList=new ArrayList<>();
        for(Map.Entry<String, Boolean> el: hs.get(name).entrySet()){




        }


    }
}
