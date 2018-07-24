package Collections.Listen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrListen<T>{

    List<T> list = new ArrayList<T>();

    public void listeSortieren(){
        //Collections.sort(list, new XVergleicher());
        this.listeDurchlaufenFor();
    }

    public void listeDurchlaufenIT(){
        Iterator<T> iterator = list.iterator();

        while (iterator.hasNext())
        {
            iterator.next();
        }
    }

    public void listeDurchlaufenFor()
    {
        for (T t : list)
        {
            //machwas
        }
    }
}
