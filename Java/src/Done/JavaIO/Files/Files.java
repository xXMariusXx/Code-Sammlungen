package Done.JavaIO.Files;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Files {

    private static String praefix = "";

    public static void main(String[] args) {

        durchlaufeBaum(new File("/Users/Marius/Documents/"));
    }

    public static void ausgaben() {
        // Datei in Java erstellen, jedoch ohne Zugriffe auf Dateisystem.
        // Zugriff findet erst statt, wenn die Datei gelesen/geschrieben wird
        File file1 = new File("Users/Marius/Desktop/testfile.txt");


        System.out.println("Name: " + file1.getName() + "\nPfad: " +
                file1.getPath() + "\nAbsoluter Pfad: " +
                file1.getAbsolutePath());
        try {
            System.out.println("Canoncial Pfad: " + file1.getCanonicalFile());
        } catch (IOException io) {
            io.printStackTrace();
        }

        //interessante Methoden:
        file1.getParentFile(); //liefert Parent file
        file1.isFile();
        file1.isDirectory();
        file1.listFiles(); //listet Files im Verzeichnis auf
    }

    public static void durchlaufeBaum(File file) {
        if (file.isDirectory()) {
            System.out.println(praefix + "<" + file.getName() + ">");
            praefix = praefix + "  ";
            File[] verzeichnisse = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().toLowerCase().endsWith(".pdf") || pathname.isDirectory();
                }
            });
            for (File f : verzeichnisse) {
                durchlaufeBaum(f);

            }
            praefix = praefix.substring(2);
        }
        else if (file.isFile())
        {
            System.out.println(praefix + file.getName());
        }
    }
}
