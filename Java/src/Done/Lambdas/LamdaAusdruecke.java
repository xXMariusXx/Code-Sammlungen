package Done.Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaAusdruecke {

    public static void main(String[] args) {
        /*
        Lambda:
        FunktionalesInterface i = (Parameter) -> {Code;}
                                              -> {return x} erlaubt
                                              -> (return x) nicht erlaubt
                                              -> (x) erlaubt: return kann weg gelassen werden
                                              -> x erlaubt: () kann weg gelassen werden
        -Implementiert die Methode eines funktionalen Interfaces (I mit genau einer zu implementierenden Methode)
        -Kann in Objekt des Interfaces gespeichert werden, oder direkt implementiert verwendet werden
        -Lambda Ausdruck kann auf alle Objekte/Attribute/Varibalen der Klasse zugreifen. Mit this wird auf aktuelles Objekt der Klasse zugegriffen
        (Wird NICHT wie interne/anonyme Klasse behandelt!), Zugriff nur auf final oder effektiv final Variablen erlaubt
        -Wenn Typ der Parameter eindeutig erkennbar: Typ kann weg gelassen werden
        -Parameter müssen immer mit zu implementierender Methode übereinstimmen
        -Wenn Code einzelner Ausdruck: keine Klammern notwendig
        -Wenn Code Block: {} notwendig                                  (siehe Function<T,R> Beispiel)
        -Wenn Parameterliste nur ein name: keine Klammern notwendig

         */

        //Beispiel Supplier<T>: T get();
        Supplier<String> stringSupplier = () -> {
            return "text";
        };
        Supplier<String> stringSupplier2 = () -> ("text");
        System.out.println(stringSupplier.get());

        //******************************************************************************************************************************
        //Beispiel Function<T,R>: R apply(T t);
        Function<String, Integer> stringFunction = (String s) -> {
            return s.length();
        };
        Function<String, Integer> stringFunction2 = (s) -> (s.length());
        Function<String, Integer> stringFunction3 = s -> s.length();
        System.out.println(stringFunction.apply("text"));

        //******************************************************************************************************************************
        //Beispiel Predicate<T>: boolean test(T t);
        Predicate<String> stringPredicate = (String s) -> {
            return s.equalsIgnoreCase("");
        };
        Predicate<String> stringPredicate2 = (s) -> s.equalsIgnoreCase("");

        //******************************************************************************************************************************
        //Beispiel Comparator
        Comparator<String> comparator = (String s1, String s2) -> {
            return s1.compareTo(s2);
        };
        Comparator<String> comparator1 = (s1, s2) -> s1.compareTo(s2);
        Comparator<String> comparator2 = String::compareTo;
        Comparator<String> comparator3 = Comparator.naturalOrder();
        String[] strings = {"A", "Z", "B"};
        Arrays.sort(strings, comparator2);
        Arrays.sort(strings, comparator3);
        Arrays.sort(strings, (s1, s2) -> s1.compareTo(s2));
        Arrays.sort(strings, String::compareTo);
        Arrays.sort(strings, Comparator.naturalOrder());

        //******************************************************************************************************************************
        //Beispiel Comparator2
        Testobjekt[] testobjekts = {new Testobjekt("2"), new Testobjekt("1")};
        Comparator<Testobjekt> testobjektComparator = (Testobjekt a, Testobjekt b) -> {
            return a.getName().compareTo(b.getName());
        };
        Comparator<Testobjekt> testobjektComparator1 = (a, b) -> (a.getName().compareTo(b.getName()));
        Comparator<Testobjekt> testobjektComparator2 = Comparator.comparing(Testobjekt::getName);

        //******************************************************************************************************************************
        //Beispiel Runnable: void run();
        Runnable runnable = () -> System.out.println("test");
        Runnable runnable1 = () ->
        {
            for (String s : strings) {
                System.out.println(s);
            }
        };
        Thread thread = new Thread(runnable1);


        //******************************************************************************************************************************
        //Beispiel Runnable2
        countUp(3);
    }




    public static void countUp(int i) {
        Runnable runnable = () -> {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }
        };

        new Thread(runnable).start();
    }


    //******************************************************************************************************************************
    //Beispiel Rekursion Fakultät
    public static IntFunction<Integer> rekursion = n -> (n == 0) ? 1 : n * LamdaAusdruecke.rekursion.apply(n - 1);

}
