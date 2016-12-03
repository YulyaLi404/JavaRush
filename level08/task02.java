package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {

 /*   public static void main(String[] args) throws Exception {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }*/

    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }
}

/* Output:

[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
*/
