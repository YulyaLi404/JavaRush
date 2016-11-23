package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {

    public Cat() {}

    public static ArrayList<Cat> cats = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
           cats.add(new Cat());
        }

        printCats();
    }

    public static void printCats() {

        for (int i = 0, catsSize = cats.size(); i < catsSize; i++) {
        
            Cat x = cats.get(i);
            System.out.println(x);
        }
        
       /*for(Cat x : cats) {
             System.out.println(x);
         } */
    }
}

/* Output:

com.javarush.test.level06.lesson11.home02.Cat@665ce0fe
com.javarush.test.level06.lesson11.home02.Cat@5bb77832
com.javarush.test.level06.lesson11.home02.Cat@6a3449a8
com.javarush.test.level06.lesson11.home02.Cat@ecfeb11
com.javarush.test.level06.lesson11.home02.Cat@7451b0af
com.javarush.test.level06.lesson11.home02.Cat@1f26ecd2
com.javarush.test.level06.lesson11.home02.Cat@3485def8
com.javarush.test.level06.lesson11.home02.Cat@40f186b8
com.javarush.test.level06.lesson11.home02.Cat@30c3bb57
com.javarush.test.level06.lesson11.home02.Cat@24065c4

*/
