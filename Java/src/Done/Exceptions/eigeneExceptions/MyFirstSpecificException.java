package Done.Exceptions.eigeneExceptions;

public class MyFirstSpecificException extends MyFirstException {
    public MyFirstSpecificException(String msg) {
        super("<MyFirstSpecificException> " + msg);
    }
}
