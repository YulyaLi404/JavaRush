package com.javarush.test.level03.lesson05.task02;

/* Реализация метода
Реализуйте метод public static void writeToConsole(String s), который добавляет к началу строки выражение "printing: "
и выводит измененную строку на экран, каждый раз с новой строки.
Пример вывода для "Hello world!":
printing: Hello world!
*/

public class Solution
{
    public static void main(String[] args)
    {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s)
    {
        System.out.println("printing: " + s);
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

printing: Hello world!
*/
