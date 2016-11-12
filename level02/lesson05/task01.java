package com.javarush.test.level02.lesson05.task01;

/* 19
Закоментарь максимальное количество строк, чтобы на экран вывелось число 19
*/
public class Solution
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;

        y = y + x; 

        x = x * 2;
        y = y + x;

        x = x * 2;
        y = y + x;

       // x = x * 2;
        y = y + x;

        x = x * 2;
        y = y + x;

        System.out.println(y);
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

19
*/
