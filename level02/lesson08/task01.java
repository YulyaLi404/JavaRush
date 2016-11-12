package com.javarush.test.level02.lesson08.task01;

import java.lang.System;

/* Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/
public class Solution
{
    public static int min(int a, int b)
    {
        int c;
        
        if (a < b){
            c = a;
        } else {
            c = b;
        }
        
        return c;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
    }

}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

12
-20
-20
*/
