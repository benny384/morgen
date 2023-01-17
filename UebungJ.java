package Arrays;
import java.util.Arrays;

public class UebungJ {
    public static void main(String[] args) {
        int[] zahlen = {5, 3, 8, 1, 4};
        int min = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }

        System.out.println("Der minimale Wert im Array ist: " + min);
    }
}
