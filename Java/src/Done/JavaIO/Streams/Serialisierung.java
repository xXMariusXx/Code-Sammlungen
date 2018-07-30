package Done.JavaIO.Streams;

import Done.JavaIO.Testobjekt;

import java.io.*;

public class Serialisierung {
    public static void main(String[] args) {
        //serialisieren(new Testobjekt("O1"), new File("/Users/Marius/Desktop/obj.ser"));
        System.out.println(deserialisieren(new File("/Users/Marius/Desktop/obj.ser")).toString());
    }

    public static void serialisieren(Testobjekt o, File to)
    {
        try(FileOutputStream fileOutputStream = new FileOutputStream(to);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(o);
            //objectOutputStream.reset(); setzt interne Hashtabelle zurück, welche speichert welche Objecte schon serialisiert sind
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Testobjekt deserialisieren(File from)
    {
        Testobjekt o = null;
        try(FileInputStream fileInputStream = new FileInputStream(from);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            o = (Testobjekt) objectInputStream.readObject();
        }
        catch (ClassNotFoundException c)
        {
            c.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return o;
    }
}
