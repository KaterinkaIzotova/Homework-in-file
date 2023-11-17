import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя целое число
 и затем пытается вычислить его факториал. Используйте цикл для вычисления факториала,
  и обработайте исключение, если введенное число отрицательное.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            int x = scan.nextInt();
            if(x < 0) throw new Exception("Отрицательное");

            System.out.println("Факториал: " + findFactorial(x));

        }
        catch (Exception e) {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static int findFactorial (Integer d) {
        int r = 1;
        System.out.println("Вы ввели: " + d);
        for (int i = 1; i <= d; i++) {
            r = r*i;
        }
        return r;
    }
}