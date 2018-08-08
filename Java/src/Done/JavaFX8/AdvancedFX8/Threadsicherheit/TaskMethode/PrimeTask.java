package Done.JavaFX8.AdvancedFX8.Threadsicherheit.TaskMethode;

import javafx.concurrent.Task;


public class PrimeTask extends Task<Integer> {
    private int n;

    public PrimeTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer call() throws Exception {
        int p = 1;
        int i = 0;
        while (i < n) {

            updateProgress((double) i / n, 1.0);
            p++;
            if (isPrime(p)) {
                i++;
            }
        }

        updateProgress((double) i / n, 1.0);

        return p;
    }

    public boolean isPrime(int num)
    {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}