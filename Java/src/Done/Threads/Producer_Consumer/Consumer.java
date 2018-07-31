package Done.Threads.Producer_Consumer;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Consumer implements Runnable {
    private Monitor monitor;
    private static final int TIMEOUT = 10000;

    public Consumer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (monitor) {
                while (monitor.isEmpty()) { //Bedingung, wann Consumer warten muss
                    try {
                        monitor.wait(TIMEOUT); //Thread legt sich schlafen, gibt monitor ab und wartet auf notify.
                                        //Wenn notify ausgeführt wird, wartet wait so lange bis dieser Thread
                                        //monitor wieder für sich beanspruchen kann
                    } catch (InterruptedException e) {
                        System.err.println(Thread.currentThread().getName() + " interrupted!");
                    }
                }
                System.out.println("<Consumer> Zahl ausgelesen: " + monitor.entfernen());
                monitor.notifyAll();
            }

            //Schlafen um die Lesbarkeit zu steigern
            try
            {

                sleep(new Random().nextInt(5000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
