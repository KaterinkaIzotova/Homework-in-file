/*
Создайте два потока и запустите их параллельно.
Пусть каждый поток выводит числа от 1 до 10 на консоль.
Обратите внимание на порядок вывода чисел.
 */
public class Task1 implements Runnable{
    private String name;

    public Task1(String name) {
        this.name = name;
    }

    public static void main (String arg[]){
        Task1 potok1 = new Task1("Поток 1");
        Task1 potok2 = new Task1("Поток 2");

        new Thread(potok1).start();
        new Thread(potok2).start();

    }
    public void run () {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " " + "значение" + " " + i);
        }
    }
}
