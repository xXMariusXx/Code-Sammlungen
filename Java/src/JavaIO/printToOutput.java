package JavaIO;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class printToOutput {

    public static void print()
    {
        OutputStream outputStream = System.out;

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        PrintWriter printWriter = new PrintWriter(bufferedOutputStream);

        printWriter.printf("Test Ausgabe auf Konsole");
        printWriter.flush();
    }
}
