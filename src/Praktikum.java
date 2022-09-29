import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " Високосный, празднуем 13 сентября!");// здесь нужно вывести результат
        } else {
            System.out.println("Увы год не високосный,но всё равно празднуем, только 12 сентября!");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
} 