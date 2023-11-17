import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
Создайте два потока: один для добавления элементов в общую очередь,
а другой для удаления элементов из очереди. Используйте `BlockingQueue`
для безопасной синхронизации и координации работы этих потоков.
 */
public class Main {
    public static void main(String[] args) {

        BlockingQueue<String> qeque = new PriorityBlockingQueue<>();

        MyThread myThread1 = new MyThread() {
            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    qeque.add("Строка №" + i);
                    System.out.println(getName() + " добавил " + qeque.element());
                }
            }
        };

        MyThread myThread2 = new MyThread() {
            @Override
            public void run() {

                for (int i = 1; i < 11; i++) {
                    try {
                        System.out.println(getName() + " удалил " + qeque.take());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        };
        myThread2.start();
        myThread1.start();


    }
}