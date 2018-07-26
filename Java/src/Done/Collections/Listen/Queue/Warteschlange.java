package Done.Collections.Listen.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Warteschlange<T> {

    private Queue<T> queue =  new PriorityQueue<T>(); //Durch Compareable der Objekte sortiert
    private Deque<T> deque = new LinkedList<T>();

    public void anhaengen(T object)
    {
        queue.add(object);
        deque.addFirst(object);
    }

    public T auslesen() //vorderstes Element zurückgeben
    {
        return queue.element();
        //return deque.getLast();
    }

    public T auslesen_loeschen() //vorderstes/kleinstes Element zurückgeben und aus Schlange löschen
    {
        return queue.remove();
        //return deque.remove();
    }
}
