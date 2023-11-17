/*
Создайте пользоватский класс исключения (например, CustomException) с
 несколькими подклассами, которые представляют разные ситуации (например,
 InvalidInputException, PermissionDeniedException). Затем напишите программу,
 которая может генерировать и обрабатывать эти пользовательские исключения.
 */
public class Main {
    public static void main (String[] args) {

        try {
            Algorithm.getString();
        }
        catch (StringException e) {
            System.out.println(e.getMessage());
        }
    }
}
