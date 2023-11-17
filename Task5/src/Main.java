import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Задание: Копирование файла**
**Описание:**
Ваша цель - создать программу, которая копирует содержимое одного файла в другой,
используя `FileInputStream`, `FileOutputStream` и буферизацию данных.
Вы должны создать два файла: исходный файл и целевой файл, и скопировать содержимое исходного
файла в целевой файл.
**Шаги:**
1. Создайте два файла: `source.txt` и `target.txt`. `source.txt` должен содержать
 некоторый текстовый контент.
2. Напишите программу, которая открывает `FileInputStream` для `source.txt` и
 `FileOutputStream` для `target.txt`.
3. Считайте данные из `FileInputStream` в буфер и записывайте их в `FileOutputStream`. Для буферизации данных вы можете использовать массив байтов размером, например, 1024 байта.
4. Закройте как `FileInputStream`, так и `FileOutputStream` после завершения копирования.
5. Проверьте, что содержимое `target.txt` соответствует содержимому `source.txt`.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Test\\source.txt", false);

        String greetings = "Самба белого мотылька\n" +
                "У открытого огонька\n" +
                "Как бы тонкие крылышки не опалить\n" +
                "Лучше мало да без тоски\n" +
                "Жить как белые мотыльки\n" +
                "И летать себе недалеко от земли\n" +
                "Жить нужно непременно хорошо\r\n";

        fileOutputStream.write(greetings.getBytes());
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Test\\source.txt");
        fileOutputStream = new FileOutputStream("C:\\Test\\target.txt", true);

        BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream, 200);
        int i;
        while ((i = bufferedInputStream.read()) != -1) {
            fileOutputStream.write((char)i);
        }
        fileOutputStream.close();
    }
}