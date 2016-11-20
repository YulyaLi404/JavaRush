package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        max(a,b,c,d);
    }

    public static void max(int a, int b, int c, int d) {

        if ((a > b) && (a > c) && (a > d)) {
            System.out.println(a);
        } else
        if ((b > c) && (b > d)) {
            System.out.println(b);
        } else
        if ((c > d)) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}

/* Output:

4
5
67
8
67

*/
