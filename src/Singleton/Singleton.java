package Singleton;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Notes about singleton:
/*
 * When i add a delay or a multi-Threading it will cause an odd behaviour in Singleton
 * If you want to fix it, just add the 'synchronized' keyword in getInstance methode
 * It would also helps if you put the 'volatile' keyword when you instantiate the shareInstance
 * This will hurts your performance, but hey, it helps.
 */

public class Singleton {

    private String[] letters = {"a", "b", "c", "d"};

    private List<String> data = Arrays.asList(letters);

    private static volatile Singleton sharedInstance = new Singleton();

    public static synchronized Singleton getInstance() {
       return sharedInstance;
    }

    private Singleton(){
        Collections.shuffle(data);
    }

    public void printData(){
        for(String item: data){
            System.out.printf("%s ", item);
        }
        System.out.println();
    }

}
