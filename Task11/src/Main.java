import java.util.Optional;

/*
Использование `Optional`:
Используйте класс `Optional` для обработки возможных `null` значений.
Создайте метод, который возвращает `Optional`,
 и попробуйте извлечь значение из него.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Test string";
        String str2 = null;

        System.out.println(updateString(str1));
        System.out.println(updateString(str2));

    }
    public static String updateString (String str) {
        Optional<String> optionalStr = Optional.ofNullable(str);
        if (optionalStr.isPresent()) {
            //  System.out.println("Дебаг1:"+str);
            String newStr = optionalStr.get();
            //  System.out.println("Дебаг2:"+newStr);
            return "Строка: " + newStr;
        }
        else {
            return "у нас null";
        }
    }
}