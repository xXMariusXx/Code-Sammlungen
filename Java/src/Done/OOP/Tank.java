package Done.OOP;

public class Tank {
    private int menge;

    public Tank(int menge) {
        this.menge = menge;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public boolean equals(Object obj) {
        return this.menge == ((Tank) obj).menge;
    }
}

