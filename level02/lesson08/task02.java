package com.javarush.test.level02.lesson08.task02;

/* Максимум двух чисел
Написать функцию, которая вычисляет максимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции max и исправить возвращаемое значение.
*/
public class Solution
{
    public static int max(int a, int b)
    {
        int c;
        
        if (a > b){
            c = a;
        } else {
            c = b;
        }
        
        return c;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( max(10,20) );
        System.out.println( max(-10,-20) );
        System.out.println( max(-100,0) );
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

20
-10
0
*/
