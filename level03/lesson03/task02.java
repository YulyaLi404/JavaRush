package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
    
        System.out.println(convertEurToUsd(5,6.43));
        System.out.println(convertEurToUsd(6,2.11));
    }

    public static double convertEurToUsd(int eur, double course){
        
        double dol;
        
        dol = eur * course;
        
        return dol;
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

32.15
12.66
*/
