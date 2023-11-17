import java.util.Scanner;

/*
Напишите программу, которая запрашивает два числа от пользователя и
выполняет деление первого числа на второе. Обработайте исключение,
которое возникает при попытке деления на ноль.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число А:");
        int x = scan.nextInt();

        System.out.print("Введите число В:");
        int y = scan.nextInt();

        try {
            System.out.println("Поделим: " + (x/y));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Не поделилось :(");
        }


    }
}