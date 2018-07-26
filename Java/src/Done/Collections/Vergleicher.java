package Done.Collections;

import java.util.Comparator;

public class Vergleicher implements Comparator {

    //Comparatoren werden verwendet, wenn:
    // 1. natürliche Ordnung ersetzt werden soll
    // 2. Objekte sortiert werden sollen, die Compareable nicht implementieren


    @Override
    public int compare(Object t1, Object t2)
    {
        return Integer.compare(((Testobjekt) t1).getGroeße(),((Testobjekt) t2).getGroeße());
    }

}
