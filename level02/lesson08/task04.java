package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
         int r;
        
        if (a < b && a < c && a < d){
            r = a;
        } else 
        if (b < a && b < c && b < d){
            r = b;
        } else 
        if (c < a && c < b && c < d){
            r = c;
        } else {
            r = d;
        }
        
        return r;
    }

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
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}

/* Output:

✓ Программа скомпилировалась без ошибок.
✓ Программа прошла все тесты. Вы выполнили задание! 
  Вот что программа вывела на экран за время работы:

-20
-40
-30
*/
