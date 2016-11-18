package com.javarush.test.level04.lesson01.task01;

/* Shadowing variables
Подумайте, что делает программа.
Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
Подсказка: тщательно просмотрите метод adjustAge
*/
public class Solution
{
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + age);
        }
    }
}



/* Output:

Age is: 20
The Age in adjustAge() is 20
Adjusted Age is: 40

Программа успешно прошла тестирование.
Вы решили задачу лучше, чем 80% учеников.
Вам удалось решить ее с 2 попытки.
Среднее к-во попыток для этой задачи - 6.4979.

*/
