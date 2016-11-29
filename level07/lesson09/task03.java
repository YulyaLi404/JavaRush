package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "мама", "мыла", "раму");

        past(list);

        for (String aList : list) {
            System.out.println(aList);
        }
    }

    private static void past(ArrayList<String> list) {
        for (int i = 1; i < list.get(1).length(); i+=2) {
            list.add(i,"именно");
        }
    }
}

/* Output:

мама
именно
мыла
именно
раму
именно

*/
