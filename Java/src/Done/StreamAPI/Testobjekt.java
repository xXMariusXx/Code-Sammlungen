package Done.StreamAPI;

public class Testobjekt {
    private final int id;
    private static int anzahl;
    private String name;
    private int alter;

    public Testobjekt(int alter, String name) {
        this.alter = alter;
        this.name = name;
        id = anzahl;
        anzahl++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
