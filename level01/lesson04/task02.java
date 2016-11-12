package com.javarush.test.level01.lesson04.task02;

import java.lang.String;

/* JavaRush. Learn once - use anywhere
Напиши программу, которая выводит на экран надпись: «JavaRush. Learn once - use anywhere» 10 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "JavaRush. Learn once - use anywhere";
        
        print5Times(s);
        print5Times(s);
    }


    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
JavaRush. Learn once - use anywhere
*/
