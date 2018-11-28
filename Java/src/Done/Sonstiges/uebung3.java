package Done.Sonstiges;

import Done.JavaIO.Testobjekt;

import java.io.*;
import java.util.List;

public class uebung3 {
    public void speichern(List<Testobjekt> list, File f)
    {
        try(FileOutputStream fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(list);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public List<Testobjekt> laden(File f) throws Exception
    {

        List<Testobjekt> liste;
        try(FileInputStream fileInputStream = new FileInputStream(f);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            liste = (List<Testobjekt>) objectInputStream.readObject();
        }
        catch (Exception e)
        {
            throw new Exception();
        }
        return liste;
    }
}
