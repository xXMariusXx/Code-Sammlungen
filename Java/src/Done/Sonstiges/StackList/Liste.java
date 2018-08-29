package Done.Sonstiges.StackList;

public class Liste {
    Link ende;

    public void push(int datum) {
        if (ende == null) {
            ende = new Link(datum, null);
            ende.naechster = ende;
        } else {
            ende.naechster = new Link(datum, ende.naechster);
            ende = ende.naechster;
        }
    }

    public int top() {
        if (ende != null) return ende.datum;
        return -1;
    }

    public int pop() {
        //Wenn Stack leer
        if (ende == null) return -1;

        //Rückgabewert speichern
        int ergebnis = ende.datum;

        //Anfang und Ende zwischenspeichern
        Link anfang = ende.naechster;
        Link neuesEnde = ende;

        //neues Ende auf einen vor Ende setzen
        while (!neuesEnde.naechster.equals(ende)) {
            neuesEnde = neuesEnde.naechster;
        }

        //Wenn gerade das letzte Element behandelt wird, Stack leer. Ansonsten ende neu setzen
        if (neuesEnde.equals(ende)) {
            ende = null;
        } else {
            ende = neuesEnde;
        }

        //Referenz auf Anfang wiederherstellen
        if (ende != null) ende.naechster = anfang;

        return ergebnis;

    }
}
