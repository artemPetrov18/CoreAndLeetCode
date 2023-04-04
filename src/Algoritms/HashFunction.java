package Algoritms;

import java.util.HashMap;

public class HashFunction {
    /*
    * Хеш таблица(мапа) удобна тем что byajhvfwb.передаваю в функцию хеширования мы сразу же можем узнать где лежит заданый елемент
    * Хеш таблица отличаеться от+ мапы тем что у мапи баекты а у таблицы просто масив и каждый ключ
    * храниться в определенном индексе
    *Поиск в шхеш таблицы On-худшый случай О(1)средний
    * хеш мапы О(логН)
    *
    * */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Artem", 1);
        map.put("Artem", 1);
        map.put("Ivan",3);
        System.out.println(map);
    }
}
