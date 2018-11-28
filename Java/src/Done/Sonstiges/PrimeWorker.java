package Done.Sonstiges;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PrimeWorker implements Runnable {
    int i;
    Collection<Integer> primes;

    public PrimeWorker(int i, Collection<Integer> primes) {
        this.i = i;
        this.primes = primes;
    }

    @Override
    public void run() {
        Stream<Integer> s = primes.stream().filter(a -> isPrime(a));
        Collection<Integer> col = s.collect(Collectors.toList());
        primes.clear();
        col.forEach(b -> primes.add(b));
    }

    public boolean isPrime(int p){
        if(p < 2) return false;
        int q = 2;
        while(q < p-1){
            if ((p % q)==0){
                return false;
            }
            q++;
        }
        return true;
    }

    public Collection<Integer> getPrimes()
    {
        return primes;
    }
}
