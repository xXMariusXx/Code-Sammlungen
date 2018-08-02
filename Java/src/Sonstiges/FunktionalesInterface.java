package Sonstiges;

interface FunktionalesInterface<T> {

    //Muss implementiert werden:
    T machwas(T t);

    //default Methoden: automatisch verwendbar, können überschrieben werden (wenn mehrdeutig: superclass gewinnt)
     default void machwasanderes()
     {
         System.out.println("irgendwas lustiges");
     }
}
