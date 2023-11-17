/*
Защита от `null` с помощью условных операторов:
Напишите код, который проверяет, является ли объект `null` перед его использованием,
и выполняет соответствующие действия в зависимости от результата проверки.
 */
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = null;

        if (str!=null) {
            System.out.println(str);
        }
        else {
            System.out.println("У вас null");
        };

        if (str2!=null) {
            System.out.println(str2);
        }
        else {
            System.out.println("У вас null");
        }
    }
}