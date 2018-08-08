package Done.JavaFX8.AdvancedFX8.Threadsicherheit.runLaterMethode;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Prime {

    private DoubleProperty progress;

    public final DoubleProperty progressProperty(){
        return progress;
    }


    public Prime(){
        progress = new SimpleDoubleProperty();
    }

    public static boolean isPrime(int p){
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

    public int calcPrimeNr(int pos){
        int p = 1;
        int i = 0;
        while(i < pos){


            p++;
            if (isPrime(p)){
                i++;
                progress.setValue((double)i/pos);
            }
        }
        return p;
    }

}
