package Collections;

import java.util.Comparator;

public class Vergleicher implements Comparator {


    @Override
    public int compare(Object t1, Object t2)
    {
        return Integer.compare(((Testobjekt) t1).getGroeße(),((Testobjekt) t2).getGroeße());
    }

}
