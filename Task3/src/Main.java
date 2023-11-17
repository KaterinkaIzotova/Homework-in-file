import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Создайте программу, которая пытается прочитать содержимое файла,
указанного пользователем. Обработайте исключения, которые могут возникнуть,
например, если файл не существует.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Scanner scan = new Scanner(new FileInputStream("TestTask9.txt"));
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}