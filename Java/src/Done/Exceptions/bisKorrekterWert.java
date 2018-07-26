package Done.Exceptions;

import Done.Exceptions.eigeneExceptions.MyFirstException;

import javax.swing.*;

public class bisKorrekterWert {

    public static void bisOk()
    {
        while(true)
        {
            try
            {
                methode();
                //Wenn Methode erfolgreich durchläuft und keine Exception wirft, springt break aus while(true)
                break;
            }
            catch (Exception e)
            {

            }
        }

    }

    public static void methode() throws MyFirstException
    {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Positive Zahl eingeben: ")) ;
        if (i < 0)
        {
            JOptionPane.showMessageDialog(null, i + " ist KEINE korrekte Zahl, neuer Versuch!");
            throw new MyFirstException();
        }
        else
        {
            JOptionPane.showMessageDialog(null, i + " ist EINE korrekte Zahl, beendet!");
        }

    }
}
