package ua.senla.task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println(" Press your word Russian language");
            String box = input.nextLine();
            int charCount = 0;
            String vowels = "уеэоаяи";
            int counVow = 0;
            for (char charBox : box.toLowerCase().toCharArray()) {
                if (Character.isLetter(charBox)) {
                    charCount++;
                    if (vowels.indexOf(charBox) != -1)
                        counVow++;
                }
            }
            System.out.printf("Гласных = %d;%nСогласных = %d", counVow, charCount - counVow);
        }
    }
