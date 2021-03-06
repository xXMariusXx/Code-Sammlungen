package Done.Collections.Listen.verkettet;

import java.util.*;
import java.util.stream.Collectors;

import Done.Collections.Vergleicher;
import Done.Collections.Testinterface;
import Done.Threads.Producer_Consumer.Consumer;

public class VerketteteListe<T extends Comparable & Testinterface> { //Schränkt den Typparameter ein, auf Objekte die
                                                                    //die Interfaces A & B implementieren

    List<T> list = new ArrayList<T>(); //ArryList kann durch LinkedList<T>() ausgetauscht werden,
                                        // da beide das Interface List implementieren

    public void hinzufuegen(T object)
    {
        list.add(object);
    }

    public void entfernen(T object)
    {
        list.remove(object);
    }

    public T gibAnIndex(int index)
    {
        return list.get(index);
    }

    public void listeSortierenComparator1(){
        Collections.sort(list, new Vergleicher());
    }

    public void listeSortierenComparator2(){
        Collections.sort(list, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void listeSortierenComparator3(){
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
    }


    public void listeSortierenComparator4(){
        Collections.sort(list, Comparable::compareTo);
    }


    public void listeSortierenComparable(){
        Collections.sort(list);
    }

    public void listeDurchlaufen(){
        if (new Random().nextInt(50) % 2 == 0)
        {
            //Iterator
            Iterator<T> iterator = list.iterator();

            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
            System.out.println("----------------------------------- Iteriert durch Iterator!");

        }
        else
        {
            //erweiterte For-Schleife
            for (T object : list)
            {
                System.out.println(object);
            }
            System.out.println("----------------------------------- Iteriert durch For-Schleife!");
        }

        //oder:
        list.forEach(System.out::println);

    }
}
