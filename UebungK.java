package Arrays;
import java.util.Arrays;

public class UebungK {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = zahlen[4];
        zahlen[4] = zahlen[9];
        zahlen[9] = temp;
        
        System.out.println("Das neue Array lautet:");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + " ");
        }
    }
}
