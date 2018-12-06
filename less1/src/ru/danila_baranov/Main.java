package ru.danila_baranov;

public class Main {

    public static void main(String[] args) {

        byte b = 127;
        short s = -32767;
        int i = 2147483647;
        long l = -9223372036854775808L;
        float f = 3.4e+38f;
        double d = -4.9e-324;
        boolean bo = true;
        char c = 65535;

        System.out.println(calculate(1,2,4,1));
        System.out.println(task10and20(10,9));
        isPositiveOrNegative(26);
        System.out.println(isNegative(-15));
        greetings("Вася");

        isIntercalaryYear(400);
    }

    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        return ((x1+x2)>10 && (x1+x2)<=20) ? true : false;
    }

    public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
       return x<0 ? true : false;
    }

    public static void greetings(String name) {
        System.out.println("Привет," + name + "!");
    }

    public static void isIntercalaryYear(int y) {
        if (y%4==0 && (y%100>0 || y%400==0)) {
            System.out.println("Год " + y + " високосный.");
        }
        else {
            System.out.println("Год " + y + " не високосный.");
        }
}

}
