package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[20];

        for (int i = 0; i < mas.length; i++) mas[i] = Integer.parseInt(reader.readLine());
        int  maximum = max(mas);
        int  minimum = min(mas);

        System.out.println(maximum + " " + minimum);
    }

    public static int min(int[] min) {
        int m = min[0];

        for (int aMin : min) {
            if (m > aMin) {
                m = aMin;
            }
        }
        return m;
    }

    public static int max(int[] max) {
        int m = max[0];

        for (int aMax : max) {
            if (m < aMax) {
                m = aMax;
            }
        }
        return m;
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
88
77
66
55
44
33
22
333
44
44
55555

55555 1
*/
