import java.util.Scanner;

class Algorithm{

    public static String getString() throws StringException{

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение: ");
        String str = scan.nextLine();

        if(str.equals("")) throw new StringException("Пустая строка");
        if(str.length() < 5) throw new StringException("В строке меньше 5 символов");
        if(str.length() > 10) throw new StringException("В строке больше 10 символов");


        return str;
    }
}