import java.util.Arrays;
import java.util.List;

/*
Создайте список строк и используйте стримы для выполнения следующих задач:

   - Отфильтруйте строки, содержащие более пяти символов.
   - Преобразуйте оставшиеся строки в верхний регистр.
   - Соберите результат в новый список.
 */
public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Леопард", "Слон", "Жираф", "Бегемот", "Ящерица");
        List<String> filterStr  = str.stream()
                .filter(s -> s.length() > 5)
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println(filterStr);
    }
}