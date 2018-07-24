package Exceptions;

import java.io.File;

public class bisKorrekt {

    public static void bisOk()
    {
        while(true)
        {
            try
            {
                File file = new File(".");
                break;
            }
            catch (Exception e)
            {
                System.err.println("Kein gültiger Dateipfad!");
            }
        }


    }
}
