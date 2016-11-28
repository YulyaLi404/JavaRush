package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[20];
        int[] m1  = new int[10];
        int[] m2  = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++){
            m1[i] = mas[i];
            m2[i] = mas[i+10];
            System.out.println (m2[i]);
        }
    }
}

/* Output:

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20


11
12
13
14
15
16
17
18
19
20

*/
