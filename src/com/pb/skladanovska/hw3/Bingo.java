package com.pb.skladanovska.hw3;
import java.util.Scanner;
import java.util.Random;
public class Bingo {
    public static void main (String[] args) {
        System.out.println("Я загадал число от 0 до 100. Угадайте это число.");
        System.out.println("Для прекращения игры введите число 404");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int hidden_number = random.nextInt(101);
        int user_number;
        int counter_try = 0;
        do{
            counter_try++;
            System.out.println("Введите число:");
            user_number = input.nextInt();
            if (user_number == 404) {
            break;
        }   if (user_number > hidden_number) {
            System.out.println("Не угадали, число должно быть меньше.");
            continue;
        }   if (user_number < hidden_number) {
            System.out.println("Не угадали, число должно быть больше.");
            continue;
        }
        System.out.println("Вы угадали число с " + counter_try + " попытки.");
        break;
    } while (user_number != hidden_number);

        System.out.println("Игра окончена.");

    }
}
