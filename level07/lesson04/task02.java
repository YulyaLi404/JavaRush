package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] mas = new String[10];

        for (int i = 0; i < 8; i++) {
            mas[i] = reader.readLine();
        }

        for (int i = mas.length - 1; i >= 0; i--)
            System.out.println(mas[i]);
    }
}

/* Output:

1
2
3
4
5
6
7
8
null
null
8
7
6
5
4
3
2
1

*/
