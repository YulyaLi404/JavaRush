package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {

   public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        arrayList(list);
    }

    private static void arrayList(ArrayList<String> list) throws IOException {

        for (int i = 0; i < 5; i++) list.add(reader.readLine());

        int masL = list.get(0).length();

        for (String aList : list) {
            if (aList.length() > masL) {
                masL = aList.length();
            }
        }

        for (String aList : list) {
            if (masL == aList.length()) {
                System.out.println(aList);
            }
        }
    }
}

/* Output:

fgfg
fgfg
fg
fg
fg

fgfg
fgfg
*/
