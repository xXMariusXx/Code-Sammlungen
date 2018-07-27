package Done.Properties_Bindings.JavaBeans.Support;

import java.util.LinkedList;
import java.util.List;

public class Verwaltung<T> {

    List<T> list = new LinkedList<T>();

    public void add(T o)
    {
        list.add(o);
    }


}
