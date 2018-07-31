package Done.Threads;

import static java.lang.Thread.sleep;

public class start {
    public static void main(String[] args) {
        Counter counter = new Counter();

        //Ping-Pong
        Thread thread1 = new Thread(new Ping(50,counter));
        Thread thread2 = new Thread(new Pong(50,counter));

        thread1.start();
        thread2.start();

        try
        {
            thread1.join(); //Es wird auf das Terminieren der Threads gewartet
            thread2.join(); //Sie werden somit wieder zu einem Thread zusammengefasst
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //Zähler
        /*Thread zaehler1 = new Thread(new HochZaehlen(counter));
        Thread zaehler2 = new Thread(new HochZaehlen(counter));
        zaehler1.start();
        zaehler2.start();*/

        //Producer-Consumer
       /* Monitor monitor = new Monitor();
        Thread producer = new Thread(new Producer(monitor));
        Thread consumer = new Thread(new Consumer(monitor));

        producer.setDaemon(true);
        consumer.setDaemon(true);

        producer.start();
        consumer.start();

        try{
            sleep(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        producer.interrupt();
        consumer.interrupt();

        System.out.println("Programm beendet!");*/
    }
}
