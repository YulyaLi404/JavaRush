package com.javarush.test.level06.lesson11.home04;

/* Минимальное количество static-ов
Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась
*/

public class Solution {

    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }


    public static void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public  void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1) return;
        main(null);
    }
}

/* Output:

java.lang.Thread.getStackTrace(Thread.java:1589)
com.javarush.test.level06.lesson11.home04.Solution.method4(Solution.java:30)
com.javarush.test.level06.lesson11.home04.Solution.method3(Solution.java:25)
com.javarush.test.level06.lesson11.home04.Solution.method2(Solution.java:21)
com.javarush.test.level06.lesson11.home04.Solution.method1(Solution.java:16)
com.javarush.test.level06.lesson11.home04.Solution.main(Solution.java:12)
sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
java.lang.reflect.Method.invoke(Method.java:606)
com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
java.lang.Thread.getStackTrace(Thread.java:1589)
com.javarush.test.level06.lesson11.home04.Solution.method4(Solution.java:30)
com.javarush.test.level06.lesson11.home04.Solution.method3(Solution.java:25)
com.javarush.test.level06.lesson11.home04.Solution.method2(Solution.java:21)
com.javarush.test.level06.lesson11.home04.Solution.method1(Solution.java:16)
com.javarush.test.level06.lesson11.home04.Solution.main(Solution.java:12)
com.javarush.test.level06.lesson11.home04.Solution.method4(Solution.java:33)
com.javarush.test.level06.lesson11.home04.Solution.method3(Solution.java:25)
com.javarush.test.level06.lesson11.home04.Solution.method2(Solution.java:21)
com.javarush.test.level06.lesson11.home04.Solution.method1(Solution.java:16)
com.javarush.test.level06.lesson11.home04.Solution.main(Solution.java:12)
sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
java.lang.reflect.Method.invoke(Method.java:606)
com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

*/
