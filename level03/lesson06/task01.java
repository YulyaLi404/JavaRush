package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        args = new String[]{"Мама","Мыла","Раму"};

        System.out.println(args[0] + args[1] + args[2]);
        System.out.println(args[0] + args[2] + args[1]);
        System.out.println(args[1] + args[0] + args[2]);
        System.out.println(args[1] + args[2] + args[0]);
        System.out.println(args[2] + args[0] + args[1]);
        System.out.println(args[2] + args[1] + args[0]);
    }
}

/* Output:

МамаМылаРаму
МамаРамуМыла
МылаМамаРаму
МылаРамуМама
РамуМамаМыла
РамуМылаМама

*/
