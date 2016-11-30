package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        for (int x : array) System.out.println(x);
    }

    public static void sort(int[] array) {
        for (int k = 0; k < array.length - 1; k++) {

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
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
9
10
11
12
13
14
15
16
17
18
19
20

20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
*/
