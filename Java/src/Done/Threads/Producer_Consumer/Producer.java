package Done.Threads.Producer_Consumer;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Producer implements Runnable {
    private Monitor monitor;
    private static final int TIMEOUT = 10000;

    public Producer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (monitor) {
                while (monitor.isFull()) { //Bedingung, wann Producer warten muss
                    try {
                        monitor.wait(TIMEOUT);
                    } catch (InterruptedException e) {
                        System.err.println(Thread.currentThread().getName() + " interrupted!");
                    }
                }
                System.out.println("<Producer> Zahl produziert, Elemente in Liste: " + monitor.elementeInListe());
                monitor.anfuegen(i++);
                monitor.notifyAll();
            }

            //Schlafen um die Lesbarkeit zu steigern
            try
            {
                sleep(new Random().nextInt(1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}
