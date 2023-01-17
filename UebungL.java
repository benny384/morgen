package Arrays;
import java.util.Arrays;

import java.util.Random;

public class UebungL {
    public static void main(String[] args) {
        int[] zahlen = new int[100];
        Random rand = new Random();
        
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = rand.nextInt(11);
        }
        
        int count5 = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == 5) {
                count5++;
            }
        }
        System.out.println("Die Zahl 5 kommt " + count5 + " mal vor.");
        
        int[] count = new int[11];
        for (int i = 0; i < zahlen.length; i++) {
            count[zahlen[i]]++;
        }
        
        System.out.println("Anzahl der Vorkommen pro Zahl:");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}
