package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a, s = 0, z = 0;

        for (int i = 1; i <= 3; i++) {

            a = Integer.parseInt(reader.readLine());

            if (a > 0) s += 1;

            if (a < 0) z += 1;
        }
        System.out.println("количество отрицательных чисел: " + z);
        System.out.println("количество положительных чисел: " + s);
    }
}

/* Output:

5
5
-5
количество отрицательных чисел: 1
количество положительных чисел: 2

*/
