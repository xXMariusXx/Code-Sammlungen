package Done.JavaIO.Streams;

import java.io.*;
import Done.JavaIO.Testobjekt;

public class CharStreams {

    public static void main(String[] args) {
        System.out.println(stringAusDateiEinlesen(new File("/Users/Marius/Desktop/test.txt")));
        stringInDateiAbspeichern(new File("/Users/Marius/Desktop/neu.txt"),"WOW2!");
        System.out.println(stringAusDateiEinlesen(new File("/Users/Marius/Desktop/neu.txt")));


        //StringToStream
        try
        {
            stringToStream(new FileOutputStream(new File("/Users/Marius/Desktop/neu.txt")),"WOW3!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        //StreamToString
        try
        {
            System.out.println(streamToString(new FileInputStream(new File("/Users/Marius/Desktop/neu.txt"))));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        objectToFile(, new File("/Users/Marius/Desktop/object.txt"));


        try
        {
            filtern(new FileReader(new File("/Users/Marius/Desktop/object.txt")),new PrintWriter(System.out));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static String stringAusDateiEinlesen(File from)
    {
        // FileReader/Writer benötigt immer Datei(File) im Konstruktor
        // PrintWriter benötigt immer: Writer oder Outputstream oder File
        String result = "";

        try(FileReader fileReader = new FileReader(from); //liest Zeichen aus Datei
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter)) //Schreibt Zeichen in String
        {
            int i; //repräsentiert Char
            while((i = fileReader.read()) != -1)
            {
                printWriter.write(i);
            }
            printWriter.flush(); // wann notwendig?
            result = stringWriter.toString();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return result;

    }

    public static void stringInDateiAbspeichern(File to, String string)
    {
        try(Writer fileWriter = new FileWriter(to); //Schreibt Zeichen in Datei
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter)) //Schreibt Zeichen in Stream/Writer
        {
            printWriter.write(string);
            printWriter.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void stringToStream(OutputStream outputStream, String string)
    {
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
             //Kann gespart werden, da PrintWriter in OutputStream schreiben kann

            PrintWriter printWriter = new PrintWriter(outputStreamWriter))
        {
            printWriter.write(string);
            printWriter.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String streamToString(InputStream inputStream)
    {
        String result = "";

        try(InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter))
        {
            int c;
            while ((c = inputStreamReader.read()) != -1)
            {
                printWriter.write(c);
            }
            result = stringWriter.toString();
        }
        catch (IOException e)
        {

        }
        return result;
    }

    public static void objectToFile(Testobjekt testobjekt, File to)
    {
        try(PrintWriter printWriter = new PrintWriter(to))
        {
            printWriter.write(testobjekt.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void filtern(Reader reader, Writer writer)
    {
        try(FilterWriter myFilterWriter = new MyFilterWriter(writer))
        {
            int i ;
            while ((i = reader.read()) != -1)
            {
                myFilterWriter.write(i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
