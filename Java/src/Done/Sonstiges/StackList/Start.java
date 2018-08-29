package Done.Sonstiges.StackList;

public class Start {

    public static void main(String[] args) {
        Liste l = new Liste();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);

        //System.out.println(l.ende.naechster.datum);
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());

    }
}
