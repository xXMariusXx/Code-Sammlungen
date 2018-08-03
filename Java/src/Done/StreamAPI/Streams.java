package Done.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //Stream lässt sich erzeugen aus: Collection, Array, IO-Ressource z.B. Datei
        //Stream stellt eine Kopie dar, verändert die eigentliche Quelle nicht
        //löschen/hinzufügen nicht möglich
        //Stream wird nur ausgeführt, wenn am Ende Terminaloperation


        //Streams erzeugen:
            //List
        List<Testobjekt> list = Arrays.asList(new Testobjekt(15, "A"), new Testobjekt(25, "X"),
                                              new Testobjekt(1, "M"), new Testobjekt(1, "N"));
        Stream<Testobjekt> listStream = list.stream(); //liefert Stream

            //Array
        Testobjekt[] array = new Testobjekt[list.size()];
        list.toArray(array);
        Stream.of(array); //liefert Stream
        Arrays.stream(array); //liefert Stream

            //Stream direkt
        Stream<String> sameText = Stream.generate(()->"Same text").limit(20);
        Stream<Integer> zufallszahlen = Stream.generate(() -> new Random().nextInt(500)).limit(20);


        //Filtern
        listStream.filter((o -> o.getAlter() > 5));
        listStream.filter(o -> o.getName().contains("a"));
        listStream.filter(o -> o.getName().length() > 1);

        //Transformieren
        listStream.map(s -> s.getName().toLowerCase());
        listStream.map(Testobjekt::getId);
        listStream.mapToDouble(Testobjekt::getAlter);
        listStream.map(Testobjekt::getAlter).mapToDouble(Integer::doubleValue);

        //Reduce
        listStream.map(Testobjekt::getAlter).reduce(0, (a,b) -> a+b); //Summiert alle Objekte miteinander auf
        listStream.map(Testobjekt::getAlter).reduce(0, Integer::sum); //Identität: Ergebnis für leeren Stream

        //Sortieren
        listStream.sorted(); //Objekte müssen Compareable sein
        listStream.sorted(Comparator.comparingInt(Testobjekt::getAlter));
        listStream.map(Testobjekt::getName).sorted(String::compareToIgnoreCase);

        //Substreams
        listStream.limit(3);
        listStream.skip(3);

        //Terminaloperationen -> liefert Teilweise keinen Stream zurück sondern Optional<T>)
        listStream.count();
        listStream.max(Comparator.comparingInt(Testobjekt::getAlter));
        listStream.min(Comparator.comparingInt(Testobjekt::getAlter));
        listStream.findFirst();
        listStream.anyMatch(s -> s.getAlter() > 50);
        listStream.allMatch(s -> s.getAlter() > 1);
        listStream.forEach(System.out::println);

        //Optional<T> (kann null sein)
        listStream.findFirst().ifPresent(System.out::println);
        listStream.findFirst().orElse(new Testobjekt(0, "leer")); //Liefert T wenn vorhanden, sonst neues T
        listStream.findFirst().get();

        //in Array
        listStream.toArray(Testobjekt[]::new);

        //in Liste
        listStream.collect(Collectors.toList());


        //komplexe Beispiele
        listStream.anyMatch(s -> s.getName().equalsIgnoreCase("A"));
        listStream.filter(s -> s.getName().contains("Hans")).max(Comparator.comparingInt(Testobjekt::getAlter)).get();
        listStream.filter(s -> s.getAlter() == 5).limit(3).forEach(s -> System.out.println(s.getId() + s.getAlter()));
        listStream.map(Testobjekt::getAlter).mapToDouble(Integer::doubleValue).average().getAsDouble();
        listStream.collect(Collectors.averagingInt(Testobjekt::getAlter));
        listStream.mapToDouble(Testobjekt::getAlter).average().getAsDouble();
        listStream.mapToInt(Testobjekt::getAlter).average().getAsDouble();


        Map<Integer,List<Testobjekt>> map = listStream.sorted(Comparator.comparing(Testobjekt::getAlter)).collect(Collectors.groupingBy(Testobjekt::getAlter));
        map.forEach((alter,o) -> System.out.println(alter + "," + o.stream().map(Testobjekt::getName).collect(Collectors.toList())));



    }
}
