package ua.senla.task4;

public class Main {
    public static void main(String[] args) {
        int reverse = 0;
        int i = 123;
        reverse = i%10;

            while (i != 0) {
            int end = (i % 10);
            i = i / 10;
            System.out.println();


            if (end == 0) {
                System.out.println("***");
                System.out.println("* *");
                System.out.println("***");
            }

            if (end == 1) {
                System.out.println(" *");
                System.out.println("**");
                System.out.println("***");
            }

            if (end == 2) {
                System.out.println("** ");
                System.out.println(" * ");
                System.out.println(" **");
            }

            if (end == 3) {
                System.out.println("***");
                System.out.println(" **");
                System.out.println("***");
            }

            if (end == 4) {
                System.out.println("* *");
                System.out.println("***");
                System.out.println("  *");
            }

            if (end == 5) {
                System.out.println(" **");
                System.out.println(" * ");
                System.out.println("** ");
            }

            if (end == 6) {
                System.out.println("** ");
                System.out.println("***");
                System.out.println("***");
            }

            if (end == 7) {
                System.out.println("***");
                System.out.println(" * ");
                System.out.println("*  ");
            }

            if (end == 8) {
                System.out.println("***");
                System.out.println("***");
                System.out.println("***");
            }

            if (end == 9) {
                System.out.println("***");
                System.out.println("***");
                System.out.println("  *");
            }


        }
    }
}

