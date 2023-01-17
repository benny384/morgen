package Arrays;
import java.util.Arrays;

public class UebungH {

	    public static void main(String[] args) {
	        int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int index = 4; 

	        for (int i = index; i < zahlen.length - 1; i++) {
	            zahlen[i] = zahlen[i + 1];
	        }
	        zahlen = Arrays.copyOf(zahlen, zahlen.length-1);

	        System.out.println("Neues Array: " + Arrays.toString(zahlen));
	    }
	}
