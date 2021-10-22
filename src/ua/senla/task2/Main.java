package ua.senla.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int number  = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println ("Press your number ");
            try {
                number = scanner.nextInt();
                if (number % 1 == 0)
                    System.out.println("Prime factors of :" + number);
                    finder(number);
                } catch (Exception e) {
                System.out.println("Number in't integer");
            }}





        private static void finder(int i) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int n = 2; n <= i; n++) {
                if (i % n == 0) {
                    list.add(n);
                    i /= n;

                }
            }
            for (int n : list) {
                System.out.println(n);
            }

        }
    }

