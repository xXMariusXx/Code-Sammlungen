package Done.JavaIO;

import java.io.Serializable;

public class TestNebenObjekt implements Serializable { //Notwendig, da Testobjekt Referenz auf dieses Objekt hat
    private String name;

    @Override
    public String toString() {
        return "TestNebenObjekt{" +
                "name='" + name + '\'' +
                '}';
    }

    public TestNebenObjekt(String name) {
        this.name = name;
    }
}
