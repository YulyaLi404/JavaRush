package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> dev3 = new ArrayList<>();
        ArrayList<Integer> dev2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            if (x % 3 == 0) dev3.add(x);
            if (x % 2 == 0) dev2.add(x);
            if ((x % 3 != 0) && (x % 2 != 0)) other.add(x);
        }

        printList(dev3);
        printList(dev2);
        printList(other);
    }

    private static void printList(List<Integer> list) {
        for (Integer x : list) System.out.println(x);
    }
}

/* Output:

12
12
12
34
23
45
6
5
4
3
2
3
4
5
6
5
45
34
34
34

12
12
12
45
6
3
3
6
45
12
12
12
34
6
4
2
4
6
34
34
34
23
5
5
5
*/
