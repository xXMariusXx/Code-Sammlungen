package Done.Sonstiges;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class uebung2 {
    public static void main(String[] args) {


        List<String> list = new LinkedList<>();
        list.add("Hans");
        list.add("Peter");
        list.add("Dieter");
        list.add("Ursula");

        new uebung2().drucke(list, new File("/Users/Marius/Desktop/namen.txt"));
    }

    public void drucke(List<String> namen, File f) throws IllegalArgumentException
    {
        Collections.sort(namen, (a,b) -> a.compareToIgnoreCase(b));
        try(FileWriter fileWriter = new FileWriter(f);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter))
        {
            namen.forEach(s -> printWriter.write(s + "\n"));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
