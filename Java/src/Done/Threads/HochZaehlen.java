package Done.Threads;

import static java.lang.Thread.sleep;

public class HochZaehlen implements Runnable {

    private Counter counter;

    public HochZaehlen(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted())
        {
            System.out.println(counter.incZaehlen()); //incZaehlen ist synchronised
            try{
                sleep(500);
            }
            catch (InterruptedException e)
            {
                System.err.println("Thread interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }
}
