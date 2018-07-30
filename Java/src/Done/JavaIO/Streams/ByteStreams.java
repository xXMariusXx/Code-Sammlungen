package Done.JavaIO.Streams;

import java.io.*;
import java.util.Enumeration;

public class ByteStreams { //eignen sich nicht für Strings/Chars, sondern für Objekte etc

    //Umändern zu Objekt!!!!!!!!!!!!!!!!!!!!

    public static void main(String[] args) {
        //dateiEinlesen(new File("/Users/Marius/Desktop/test.txt"));
        //copy(new File("/Users/Marius/Desktop/test.txt"), new File("/Users/Marius/Desktop/neu.txt"));
        inDateiSpeichern(new File("/Users/Marius/Desktop/test.txt"), "WOW!");
    }

    public static void dateiEinlesen(File from)
    {
        try (InputStream fileInputStream = new FileInputStream(from);
             InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             OutputStream bufferedOutputStream = new BufferedOutputStream(System.out))
                // so korrekt?
        {
            int i;
            while ((i = bufferedInputStream.read()) != -1)
            {
                bufferedOutputStream.write(i);
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Datei nicht gefunden!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void copy(File from, File to)
    {
        try (InputStream inputStream = new FileInputStream(from); OutputStream outputStream = new FileOutputStream(to))
        {
            int i;
            while ((i = inputStream.read()) != -1)
            {
                outputStream.write(i);
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Datei nicht gefunden!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void inDateiSpeichern(File to, String s)
    {
        try(OutputStream fileOutputStream = new FileOutputStream(to))
        {
            fileOutputStream.write(s.getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void ausMehrerenEinlesen(InputStream inputStream1, InputStream inputStream2)
    {
        try(SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream1,inputStream2))
        {

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void ausMehrerenEinlesenEnum(Enumeration<InputStream> enumeration)
    {
        try(SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration))
        {

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
