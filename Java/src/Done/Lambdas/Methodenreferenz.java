package Done.Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Methodenreferenz {
    public static void main(String[] args) {
        /*
        Methodenreferenz
        Verweis auf vorhandene Methode, ohne diese aufzurufen
        Klassenname::methodenname
        -Wenn mehrere gleichnamige Methoden mit unters. Parametern zur Auswahl stehen, kann man nicht eine bestimmte wählen
        -Wird wie Lamba in funktionale Schnittstellen eingesetzt, muss Parameter und Rückgabetyp gleich haben
        -Wie bei Lambda bestimmt Kontext Rückgabetyp und Parameter
        -Im Prinzip vereinfachte Schreibweise von Lamda

        Umformen Lamda in Referenz
        statische Methode:        (args) -> Klasse.statischeMethode(args)          wird zu: Klasse::statischeMethode
        Objektmethode:            (args) -> obj.objektMethode(args)                wird zu: obj::objektMethode
        Objektmethode eines Typs: (obj,args) -> obj.objektMethode(args)            wird zu: KlasseVonObj::objektMethode


        Konstruktorreferenz
        Verweis auf Konstruktor einer Klasse
        Klassenname::new
        - wird automatisch mit passenden Parametern oder ohne Parameter aufgerufen
         */

        //Beispiel Function
        Function<String, Integer> len = String::length;
        Function<String,Testobjekt> testobjektFunction = (string) -> new Testobjekt(string);
        Function<String,Testobjekt> testobjektFunction2 = Testobjekt::new;
        //Testobjekt testobjekt = testobjektFunction2.apply("hans");
        //testobjekt.getName();


        //Beispiel Comparator
        Testobjekt[] testobjekts = {new Testobjekt("2"), new Testobjekt("1")};
        Arrays.sort(testobjekts, Comparator.comparing(Testobjekt::getName));
        String[] feld={"Ein", "kurzer", "Satz"};
        Arrays.sort(feld, String::compareToIgnoreCase);

        //Beispiel Supplier
        Testobjekt testobjekt = new Testobjekt("test");
        Supplier<String> stringSupplier = () -> testobjekt.getName();
        Supplier<String> stringSupplier1 = testobjekt::getName;
        Supplier<String> stringSupplier2 = () -> new String(); //Kein Parameter möglich
        Supplier<String> stringSupplier3 = String::new;

        //Beispiel BiFunction
        BiFunction<String,String,Integer> biFunction = (s1,s2) -> s1.length()+s2.length();

        //Beispiel Liste
        List<String> list = Arrays.asList(feld);
        list.forEach(s -> System.out.println(s + "a"));
        list.forEach(System.out::println);
        //oder
        Arrays.asList(feld).forEach(System.out::println);

    }
}
