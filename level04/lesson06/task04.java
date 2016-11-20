package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        length(name1,name2);
    }

    public static void length(String n1, String n2) {

        if (n1.equals(n2)) {
            System.out.println("Имена идентичны");
        } else 
        if ((!(n1.equals(n2))) && (n1.length() == n2.length())){
            System.out.println("Длины имен равны");
        }
    }
}

/* Output:

name
nams
Длины имен равны

*/
