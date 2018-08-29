package Done.Sonstiges;

public class RekToIt {

    public static void main(String[] args) {
        System.out.println(rek(5));
        System.out.println(it(5));
    }




    public static int rek(int h)
    {
        assert (h>=0);
        if (h == 0) return 0;

        return 1+2*rek(h-1);
    }




    public static int it(int h)
    {
        assert (h>=0);

        if (h == 0) return 0;

        int ergebnis = 0;
        int hoehe = h;

        while(hoehe>0)
        {
            ergebnis = 1+2*ergebnis;
            hoehe--;
        }
        return ergebnis;
    }
}
