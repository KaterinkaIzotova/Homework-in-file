/*
создать программу, которая читает текстовый файл, фильтрует его содержимое,
и записывает отфильтрованные данные в новый файл.
Вы должны создать фильтр, который удалит или изменит определенные строки в исходном файле
 перед записью в новый файл.
**Шаги:**
1. Создайте файл `source.txt` и напишите в нем несколько строк текста,
включая строки, которые вы хотите удалить или изменить.
2. Напишите программу, которая открывает `FileInputStream` для `source.txt` и
`FileOutputStream` для `filtered.txt`.
3. Прочитайте содержимое `source.txt` построчно, и для каждой строки примените фильтр.
Например, вы можете удалить строки, содержащие определенные ключевые слова, или
заменить определенные символы или слова в строках.
4. Запишите отфильтрованные строки в `filtered.txt` с использованием `FileOutputStream`.
5. Закройте как `FileInputStream`, так и `FileOutputStream` после завершения фильтрации.
6. Проверьте, что `filtered.txt` содержит отфильтрованные данные.
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

        BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream);
        String str = bufferedInputStream.toString();
        String str2 = str.replaceAll("Лучше","");

        //   System.out.println(str2);
        int i;
        while (str2.isEmpty()) {

            fileOutputStream.write((char)i);

        }
        fileOutputStream.close();
    }
}