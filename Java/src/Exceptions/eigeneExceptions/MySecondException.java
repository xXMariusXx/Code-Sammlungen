package Exceptions.eigeneExceptions;

public class MySecondException extends Exception { // Anwender Schuld, Problem kann durch Anwender gelöst werden
    // Alternativ spezifischer, z.B. extends IOException

    public MySecondException()
    {
        super();
    }

    public MySecondException(String msg)
    {
        super("<MySecondException> " + msg);
    }

}
