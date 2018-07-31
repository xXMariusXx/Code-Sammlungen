package Done.Threads;

public class Counter {
    private int i = 0;
    private int z = 0;

    synchronized int incZaehlen()
    {
        return i++;
    }

    void incPing()
    {
        z++;
    }

    boolean isGerade()
    {
        if (z%2==0)
        {
            return true;
        }
        return false;
    }
}
