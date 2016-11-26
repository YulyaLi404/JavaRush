package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        reverse(mas);

        for(int i = 0; i < 10; i++){
            System.out.println(mas[i]);
        }
    }

    private static int[] reverse(int[] num) {

        for (int i = 0; num.length/2 > i; i++) {
            int tmp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = tmp;
        }
        return num;
    }
}

/* Output:

1
2
3
44
3
3
22
3
3
4

4
3
3
22
3
3
44
3
2
1

*/
