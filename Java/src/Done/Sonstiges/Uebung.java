package Done.Sonstiges;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Uebung {
    public static void main(String[] args) {
        Collection<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


        try{
            list = new Uebung().filterPrimes(list);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //list.forEach(System.out::println);

    }

    public Collection<Integer> filterPrimes(Collection<Integer> zahlen) throws InterruptedException
    {
        Collection<Integer> primes = zahlen;

        PrimeWorker primeWorker = new PrimeWorker(0,primes);

        Thread thread = new Thread(primeWorker);
        thread.start();
        thread.join();


        System.out.println("Join fertig");

        //primes = primeWorker.getPrimes();

        System.out.println("Ausgabe Liste gefiltert:");
        primes.forEach(System.out::println);


        return primes;
    }
}


