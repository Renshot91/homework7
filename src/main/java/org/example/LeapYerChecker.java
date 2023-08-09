package org.example;

import java.util.Scanner;
//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.
public class LeapYerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
