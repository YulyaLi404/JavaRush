package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите имя: ");
        String name = reader.readLine();

        //System.out.print("Введите сколько получает (name)");
        int money = Integer.parseInt(reader.readLine());

        //System.out.print("Введите через сколько лет получает (name)");
        int years = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + money + " через " + years + " лет.");
    }
}

/* Output:

/*Введите имя: */ nemo
/* Введите сколько получает (name): */ 200000
/*Введите через сколько лет получает (name): */ 5
nemo получает 200000 через 5 лет.
*/
