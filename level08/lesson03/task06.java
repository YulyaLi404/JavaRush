package com.javarush.test.level08.lesson03.task06;

import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);

        for (Map.Entry<String,Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}

/* Output:

Sim - 5
Baby - null
Cat - Cat
Gevey - 6
Eat - 56
Food - 3
Tom - 5.5
Hugs - 111111111111
Arbus - false
Comp - 123.0
*/
