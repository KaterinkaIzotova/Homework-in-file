import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
**Фильтрация и Преобразование**:
   Создайте список чисел и используйте стримы для выполнения следующих задач:

   - Отфильтруйте только четные числа.
   - Увеличьте каждое число в два раза.
   - Найдите сумму всех полученных чисел.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        long count = nums.stream()
                .filter(s -> s%2==0)
                .mapToInt(s -> s*2)
                .sum();

        System.out.println(count);


    }
}