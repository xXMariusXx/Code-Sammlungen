package Done.Threads.Producer_Consumer;

import java.util.LinkedList;
import java.util.List;

public class Monitor { //Dient als Lager bzw Warteschlange
    private List<Integer> list = new LinkedList<>();
    private static final int LISTLIMIT = 5;

    public void anfuegen(int i)
    {
        list.add(i);
    }

    public int entfernen()
    {
        return list.remove(0);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public boolean isFull()
    {
        if (LISTLIMIT > list.size()) //max bis size-1 Elemente. Da danach hinzugefügt wird, mindestens 1 Platz notwendig
        {
            return false;
        }
        return true;
    }

    public int elementeInListe()
    {
        return list.size();
    }
}
