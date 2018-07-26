package Done.Exceptions;

import Done.Exceptions.eigeneExceptions.MyFirstException;
import Done.Exceptions.eigeneExceptions.MyFirstSpecificException;
import Done.Exceptions.eigeneExceptions.MySecondException;

public class start {

    final static int i = 0; //0=0, -1=negativ, 1=positiv

    public static void main(String[] args) {
        //**************************************************************************************************************
        //bisKorrekterWert
        //bisKorrekterWert.bisOk();
        //**************************************************************************************************************


        ExceptionTest exceptionTest = new ExceptionTest();
        boolean doWeiterleiten = false;
        boolean doNoway = false;
        boolean doNormal = false;
        boolean doRuntime = false;

        //**************************************************************************************************************
        // weiterleiten von Done.Exceptions:
        // leiteWeiter behandelt die Exception nicht, sondern wirft sie zu main hoch.
        // Main muss behandeln
        if (doWeiterleiten)
        {
            try
            {
                leiteWeiter(exceptionTest);
            }
            catch (MyFirstException | MySecondException e )
            {
                System.err.println("<Main weitergeleitet>: " + e.getMessage());
            }
        }
        //**************************************************************************************************************



        //**************************************************************************************************************
        // erneutes werfen von Done.Exceptions
        // Exception wird in Methode noway zwar behandelt, Problem lässt sich aber nicht lösen
        // Daher wird die Methode noway die Exception erneut nach oben, da eventuell main
        // dieses Problem lösen kann
        if (doNoway)
        {
            try
            {
                testNoway(exceptionTest);
            }
            catch (MyFirstException | MySecondException e)
            {
                System.err.println("<Main noway>: Exception nicht lösbar");
            }
        }
        //**************************************************************************************************************


        //**************************************************************************************************************
        //standard Exception, standard Exception(inner class)
        if (doNormal)
        {
            testeNormaleException(exceptionTest);
        }
        //**************************************************************************************************************


        //**************************************************************************************************************
        // RuntimeException
        if (doRuntime)
        {
            testeRuntimeException(exceptionTest);
        }
        //**************************************************************************************************************

    }


    public static void testeRuntimeException(ExceptionTest exceptionTest)
    {
        //runtimeException:
        //Kann mit try catch abgefangen werden, muss aber nicht
        exceptionTest.zahlPositivRun(i);
        // -> Sout wird nicht ausgeführt, da Programm abbricht wenn Excpetion nicht behandelt wird, was korrekt ist!
        System.out.println("<RuntimeException>: Programm beendet");
    }


    public static void testeNormaleException(ExceptionTest exceptionTest)
    {
        //**************************************************************************************************************
        //normale Exception:
        // zuerst spezifische, dann unspezifische bzw generelle Done.Exceptions fangen!
        // MyFirstException fängt automatisch MyFirstSpecificException, da MSE von ME erbt
        // genau so würde Exception automatisch MyFirstException fangen
        try
        {
            exceptionTest.zahlPositiv(i);
        }
        catch (MyFirstSpecificException e)
        {
            System.err.println(e.getMessage());
        }
        catch (MyFirstException e)
        {
            System.err.println(e.getMessage());
        }
        catch (MySecondException e)
        {
            System.err.println(e.getMessage());
        }
        finally {
            // Wird in jedem Fall ausgeführt, auch wenn Exception vorkommt
            System.out.println("<normale Exception>: Programm beendet");
        }
        //**************************************************************************************************************



       /* //**************************************************************************************************************
        //normale Exception mit innerer Klasse
        try {
            exceptionTest.zahlPositivInner(i);
        }
        catch (ExceptionTest.MyInnerException e)
        {
            System.err.println(e.getMessage());
        }
        //***************************************************************************************************************/

    }

    public static void leiteWeiter(ExceptionTest exceptionTest) throws MyFirstException, MySecondException
    {
        exceptionTest.zahlPositiv(i);
    }


    public static void testNoway(ExceptionTest exceptionTest) throws MyFirstException, MySecondException
    {
        //normale Exception:
        try
        {
            exceptionTest.zahlPositiv(i);
        }
        catch (MyFirstSpecificException e)
        {
            System.err.println(e.getMessage());
        }
        catch (MyFirstException | MySecondException e)
        {
            System.err.println("<normale Exception>: Fehler, Exception wird versucht zu beheben!");
            if (true) throw e;
        }
    }
}
