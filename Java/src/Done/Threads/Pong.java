package Done.Threads;

import static java.lang.Thread.sleep;

public class Pong implements Runnable {
    private int delay;
    private Counter counter;

    public Pong(int delay,Counter counter) {
        this.delay = delay;
        this.counter = counter;
    }


    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted())
        {
            synchronized (counter)
            {
                if (!counter.isGerade())
                {
                    System.out.println("Pong");
                    counter.incPing();
                    counter.notify();
                }
                else
                {
                    try{counter.wait();}
                    catch (InterruptedException e){e.printStackTrace();}
                }
            }

            try{
                sleep(delay);
            }
            catch (InterruptedException e)
            {
                System.err.println("Thread Pong interrupted");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread beendet!");
    }
}
