package com.javarush.test.level02.lesson02.task01;

/* Класс Person
В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Person person = new Person();
    }

    public static class Person
    {
        String name;
        int age, weight, money;
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:
*/
