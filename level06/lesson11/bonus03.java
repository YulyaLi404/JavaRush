package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {

            num[i] = Integer.parseInt(reader.readLine());
        }

        sort(num);
    }

    public static void sort(int[] num){

        Arrays.sort(num);

        for(int i = 0; i <  num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }
    
    /* for (int k = 0; k < sort.length - 1; k++) // сортировка "пузырьком", цикл внутри цикла
        {
            for (int i = 0; i < sort.length - 1; i++)
            {
                int tmp = 0;
                if (sort[i] > sort[i + 1])
                {
                    tmp = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = tmp;
                }

            }
        }
            for (int i = 0; i < sort.length; i++) //выводим цикл на печать
            {
                System.out.println(sort[i]);
            }
    */
}

/* Output:

5
4
3
6
5
3  4  5  5  6

*/
