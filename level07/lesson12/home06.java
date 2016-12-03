package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {

    public static void main(String[] args) {

        Human grandFather1 = new Human("Saha", true, 56, null, null);
        Human grandFather2 = new Human("Tom", true, 60, null, null);

        Human grandMother1 = new Human("Kate", false, 55, null, null);
        Human grandMother2 = new Human("Rei", false, 58, null, null);

        Human father = new Human("Nick", true, 30, grandFather1, grandMother1);
        Human mother = new Human("Sara", false, 30, grandFather2, grandMother2);

        Human child1 = new Human("Dick", true, 20, father, mother);
        Human child2 = new Human("Kevin", true, 15, father, mother);
        Human child3 = new Human("Julia", false, 13, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        private Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}

/* Output:

Имя: Saha, пол: мужской, возраст: 56
Имя: Tom, пол: мужской, возраст: 60
Имя: Kate, пол: женский, возраст: 55
Имя: Rei, пол: женский, возраст: 58
Имя: Nick, пол: мужской, возраст: 30, отец: Saha, мать: Kate
Имя: Sara, пол: женский, возраст: 30, отец: Tom, мать: Rei
Имя: Dick, пол: мужской, возраст: 20, отец: Nick, мать: Sara
Имя: Kevin, пол: мужской, возраст: 15, отец: Nick, мать: Sara
Имя: Julia, пол: женский, возраст: 13, отец: Nick, мать: Sara
*/
