package org.example;
//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.
import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье целое число:");
        int num3 = scanner.nextInt();

        int max = findMax(num1, num2, num3);
        System.out.println("Максимальное число: " + max);
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
