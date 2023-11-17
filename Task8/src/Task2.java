public class Task2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Создаем два потока, передавая им общий счетчик
        Thread thread1 = new Thread(new CounterIncrementer(counter));
        Thread thread2 = new Thread(new CounterIncrementer(counter));

        // Запускаем потоки
        thread1.start();
        thread2.start();

        try {
            // Ждем, пока оба потока завершат выполнение
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим итоговое значение счетчика
        System.out.println("Итоговое значение счетчика: " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    // Метод для увеличения счетчика с синхронизацией
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterIncrementer implements Runnable {
    private Counter counter;

    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
