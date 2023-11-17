import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
/*
Создайте карту, где ключи - это имена, а значения - возраст.
 Используйте стримы для выполнения следующих задач:
   - Отфильтруйте записи, где возраст больше 21 года.
   - Преобразуйте оставшиеся записи, увеличив возраст на 5 лет.
   - Соберите результат в новую карту.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Nill", 25);
        map.put("Tom", 18);
        map.put("Kim", 30);
        map.put("Lok", 22);

        Map<String, Integer> myMap = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 21)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, Integer> newMap = myMap.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() + 5
                ));

        System.out.println(newMap);
    }
}