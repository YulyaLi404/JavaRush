package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите имя 1: ");
        String name1 = reader.readLine();

        //System.out.print("Введите имя 2: ");
        String name2 = reader.readLine();

        //System.out.print("Введите имя 2: ");
        String name3 = reader.readLine();

        String a = " + ";

        System.out.println(name1 + a + name2 + a + name3 + " = Чистая любовь, да-да!");
    }
}

/* Output:

/*Введите имя 1: */ nemo
/*Введите имя 2: */ she
/*Введите имя 2: */ he
nemo + she + he = Чистая любовь, да-да!
*/
