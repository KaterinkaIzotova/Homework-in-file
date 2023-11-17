import java.util.ArrayList;
import java.util.List;

/*
Создайте класс `Person` с полями `name` и `age`. Затем создайте список объектов `Person` и
используйте стримы для выполнения следующих задач:

   - Отфильтруйте людей, возраст которых больше 18 лет.
   - Преобразуйте их имена в верхний регистр.
   - Выведите результаты в консоль.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> myPerson = new ArrayList<>();

        myPerson.add(new Person("Tom",30));
        myPerson.add(new Person("Lim",10));
        myPerson.add(new Person("Kim",55));

        List<String> str = myPerson.stream()
                .filter(s -> s.getAge() > 18)
                .map(s -> s.getName().toUpperCase())
                .toList();

        System.out.println(str);
    }
}