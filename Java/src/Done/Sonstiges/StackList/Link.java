package Done.Sonstiges.StackList;

public class Link {
    public int datum;
    public Link naechster;

    public Link(int datum, Link naechster) {
        this.datum = datum;
        this.naechster = naechster;
    }
}
