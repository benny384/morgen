package Arrays;
import java.util.Arrays;

public class Uebungi {
    public static void main(String[] args) {
        int[] zahlen = {5, 3, 8, 1, 4};
        int max = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }

        System.out.println("Der maximale Wert im Array ist: " + max);
    }
}
