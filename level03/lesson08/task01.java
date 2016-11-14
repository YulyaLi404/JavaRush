package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите через сколько лет (name) захватит мир: ");
        int years = Integer.parseInt(reader.readLine());

        //System.out.print("Введите имя: ");
        String name = reader.readLine();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}

/* Output:

/* Введите через сколько лет (name) захватит мир: */ 5
/* Введите имя: */ name
name захватит мир через 5 лет. Му-ха-ха!
