package Done.Exceptions.eigeneExceptions;

public class MyRuntimeException extends RuntimeException {  // Runtimeexceptions müssen nicht gefangen werden, da Programmfehler
                                                            // und somit Programmierer Schuld. Problem kann nicht durch Anwender
                                                            // behoben werden!
                                                            // Daher sollte das Programm abbrechen!

    public MyRuntimeException()
    {
        super();
    }

    public MyRuntimeException(String msg)
    {
        super("<MyRuntimeException>" + msg);
    }
}
