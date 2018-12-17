package ru.danila_baranov;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameRandom();
    }

    public static void GameRandom(){

        int a = 1;
        while (a==1){
            Random rand = new Random();
            int number = rand.nextInt(10);

            for (int i = 0; i < 3; i++) {
                System.out.println("Угадайте число от 0 до 9. Попытка № " + (i+1));
                Scanner sc = new Scanner(System.in);
                int input_number = sc.nextInt();
                if (input_number == number){
                    System.out.println("Вы угадали число =" + input_number);
                    break;
                } else {
                    System.out.println("Не верно. Осталось " + (2-i) + " попытки");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
        }
    }
}
