package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

/* Output:

2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100

*/
