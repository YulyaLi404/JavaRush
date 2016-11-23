package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {
    
        double dx = x1 - x2;
        double dy = y1 - y2;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public static void main(String[] args) {
    
        System.out.println(getDistance(5,6,7,8));
    }

}

/* Output:

Код прошел тестирование.

2.8284271247461903

*/
