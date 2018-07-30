package Done.JavaIO.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiles{
    public static void main(String[] args) {
        //copy(new File("/Users/Marius/Desktop/test.txt"), new File("/Users/Marius/Desktop/neu.txt"));

        //cat(new File("/Users/Marius/Desktop/test.txt"));

        write("Hallo Welt! \nDies ist aber spannend! \nWOW", new File("/Users/Marius/Desktop/test.txt"));


        //Üben: Generell laden und abspeichern
    }

    public static void erzeugen()
    {
        // RandomAccesFiles erzeugen:
        // erzeugt und reserviert Datei in Betriebssystem (blockt sie für andere Programme)
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("/Users/Marius/Desktop/test.txt", "rw");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            try{randomAccessFile.close();}catch (IOException e){e.printStackTrace();}
        }

        //Alternative
        //try with resources schließt (.close) die Datei automatisch
        //Wenn nur read Rechte("r"): Datei muss bereits vorhanden sein!
        try(RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File("/Users/Marius/Desktop/test2.txt"),"rw"))
        {
            randomAccessFile2.write(5);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void copy(File from, File to)
    {
        try(RandomAccessFile randomAccessFilefrom = new RandomAccessFile(from,"r");
            RandomAccessFile randomAccessFileto = new RandomAccessFile(to,"rw"))
        {
            int b;
            while ((b = randomAccessFilefrom.read()) != -1)
            {
                randomAccessFileto.write(b);
            }

        }
        catch (FileNotFoundException e)
        {
            System.err.println("Datei wurde nicht gefunden!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void cat(File quelle)
    {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(quelle,"r"))
        {
            String c;
            while ((c = randomAccessFile.readLine()) != null)
            {
                System.out.println(c);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void write(String text, File quelle)
    {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(quelle,"rw"))
        {
            randomAccessFile.writeChars(text);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
