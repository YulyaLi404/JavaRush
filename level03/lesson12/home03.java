package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите какое кол-во денег вы будете зарабатывать: ");
        int money = Integer.parseInt(reader.readLine());

        System.out.println("Я буду зарабатывать $" + money + " в час");
    }
}

/* Output:

/*Введите какое кол-во денег вы будете зарабатывать: */ 20000000
Я буду зарабатывать $20000000 в час
*/