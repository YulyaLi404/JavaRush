package com.javarush.test.level01.lesson06.task01;

/* Контракт
Вывести на экран текст нового контракта:
Меня зовут Амиго.

Я согласен на зарплату $800/месяц в первый год.
Я согласен на зарплату $1500/месяц во второй год.
Я согласен на зарплату $2200/месяц в третий год.
Я согласен на зарплату $2700/месяц в четвертый год.
Я согласен на зарплату $3200/месяц в пятый год.

Поцелуй мой блестящий металлический зад!
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я согласен на зарплату ";
        String a = "/месяц ";
        
        int num1 = 800;
        int num2 = 1500;
        int num3 = 2200;
        int num4 = 2700;
        int num5 = 3200;
        
        System.out.println("Меня зовут Амиго.");
        
        System.out.println(s + "$" + num1 + a + "в первый год.");
        System.out.println(s + "$" + num2 + a + "во второй год.");
        System.out.println(s + "$" + num3 + a + "в третий год.");
        System.out.println(s + "$" + num4 + a + "в четвертый год.");
        System.out.println(s + "$" + num5 + a + "в пятый год.");
        
        System.out.println("Поцелуй мой блестящий металлический зад!");
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

Меня зовут Амиго.
Я согласен на зарплату $800/месяц в первый год.
Я согласен на зарплату $1500/месяц во второй год.
Я согласен на зарплату $2200/месяц в третий год.
Я согласен на зарплату $2700/месяц в четвертый год.
Я согласен на зарплату $3200/месяц в пятый год.
Поцелуй мой блестящий металлический зад!
*/
