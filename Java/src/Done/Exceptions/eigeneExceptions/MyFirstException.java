package Done.Exceptions.eigeneExceptions;

public class MyFirstException extends Exception { // Anwender Schuld, Problem kann durch Anwender gelöst werden
                                                  // Alternativ spezifischer, z.B. extends IOException
                                                  // Problem muss bearbeitet werden!

    public MyFirstException()
    {
        super();
    }

    public MyFirstException(String msg)
    {
        super("<MyFirstException> " + msg);
    }

}
