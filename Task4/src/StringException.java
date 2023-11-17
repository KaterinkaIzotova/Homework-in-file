public class StringException extends Exception{
    private int number;
    public int getNumber(){return number;}
    public StringException(String message){
        super(message);
    }
}

