package Exceptions;

import Exceptions.eigeneExceptions.MyFirstException;
import Exceptions.eigeneExceptions.MyFirstSpecificException;
import Exceptions.eigeneExceptions.MyRuntimeException;
import Exceptions.eigeneExceptions.MySecondException;

public class ExceptionTest {

    //**************************************************************************************************************
    //normale Exception
    public void zahlGroeßer5(int i) throws MyFirstSpecificException, MyFirstException, MySecondException
    {
        if (i > 4)
        {
            System.out.println("<normale Exception>: Zahl korrekt: " + i);
        }
        else if(i<0)
        {
            throw new MyFirstSpecificException("Zahl negativ");
        }
        else if (i == 0)
        {
            throw new MySecondException("Zahl = 0");
        }
        else
        {
            throw new MyFirstException("Zahl nicht erlaubt");
        }
    }
    //**************************************************************************************************************



    //**************************************************************************************************************
    //RuntimeException
    public void zahlGroeßer5Run(int i) // throws MyRuntimeException ist nicht notwendig, da Runtimeexception
    {
        if (i > 9)
        {
            System.out.println("<RuntimeException>: Zahl korrekt: " + i);
        }
        else
        {
            throw new MyRuntimeException("Zahl nicht erlaubt");
        }
    }
    //**************************************************************************************************************


    //**************************************************************************************************************
    //InnerException
    class MyInnerException extends Exception{
        public MyInnerException(String message) {
            super("<(inner)normale Exception>: "  + message);
        }
    }

    public void zahlGroeßer5Inner(int i) throws MyInnerException //
    {
        if (i > 5)
        {
            System.out.println("<(inner)normale Exception>: Zahl korrekt: " + i);
        }
        else
        {
            throw new MyInnerException("Zahl nicht erlaubt");
        }
    }
    //**************************************************************************************************************

}
