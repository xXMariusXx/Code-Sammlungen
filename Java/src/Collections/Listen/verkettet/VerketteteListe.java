package Collections.Listen.verkettet;

import java.util.*;

import Collections.Vergleicher;

public class VerketteteListe<T extends Comparable> {

    List<T> list = new ArrayList<T>(); //Alternative: new LinkedList<T>();

    public void hinzufuegen(T object)
    {
        list.add(object);
    }

    public void entfernen(T object)
    {
        list.remove(object);
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

    }
}
