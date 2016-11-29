package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);

        for (String aList : result) {
            System.out.println(aList);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int size = list.size() * 2;

        for (int i = 0; i < size; i += 2) {
            String s = list.get(i);
            list.add(i, s);
        }
        return list;
    }
}

/* Output:

2
3
4
5
6
7
8
u
y
t

2
2
3
3
4
4
5
5
6
6
7
7
8
8
u
u
y
y
t
t
*/
