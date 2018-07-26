package Done.Collections.Set;

import java.util.*;

public class Menge<T> {

    Set<T> set = new HashSet<>();
    //Alternativen:
    //Set<T> set = new LinkedHashSet<>();
    //Set<T> set = new TreeSet<>();

    public void hinzufuegen(T object)
    {
        set.add(object);
    }

    public void loeschen(T object)
    {
        set.remove(object);
    }


}
