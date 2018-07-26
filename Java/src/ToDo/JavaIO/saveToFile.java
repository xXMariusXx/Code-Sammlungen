package ToDo.JavaIO;

import java.io.*;

public class saveToFile {

    public static void save()
    {
        File file = new File("/home/marius/test.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            PrintWriter printWriter = new PrintWriter(bufferedOutputStream);
            printWriter.printf("Test text in Datei");
            printWriter.flush();
        }
        catch (IOException e)
        {

        }
    }
}
