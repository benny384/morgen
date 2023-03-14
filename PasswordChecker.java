package Arrays;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	    // Aufgabe 3: Großbuchstaben zählen
		
		
	    System.out.print("Bitte geben Sie einen Satz ein: ");
	    String satz = scanner.nextLine();
	    int anzahlGrossbuchstaben = 0;
	    for (int i = 0; i < satz.length(); i++) {
	        char c = satz.charAt(i);
	        if (Character.isUpperCase(c)) {
	            anzahlGrossbuchstaben++;
	        }
	    }
	    System.out.println("Anzahl der Großbuchstaben im Satz: " + anzahlGrossbuchstaben);
	    
	    
	    // Aufgabe 4: Strings auf Gleichheit überprüfen und lexikalisch sortieren
	    
	    
	    System.out.print("Bitte geben Sie den ersten String ein: ");
	    String string1 = scanner.nextLine();
	    System.out.print("Bitte geben Sie den zweiten String ein: ");
	    String string2 = scanner.nextLine();
	    if (string1.equals(string2)) {
	        System.out.println("Die beiden Strings sind gleich.");
	    } else {
	        System.out.println("Die beiden Strings sind unterschiedlich.");
	        String kleinererString = (string1.compareTo(string2) < 0) ? string1 : string2;
	        String groessererString = (string1.compareTo(string2) > 0) ? string1 : string2;
	        System.out.println("Die Strings in lexikalischer Reihenfolge: " + kleinererString + " " + groessererString);
	    }
	    
	    
	    // Aufgabe 5: Passwort überprüfen
	    
	    
	    System.out.print("Bitte geben Sie das zu überprüfende Passwort ein: ");
	    char[] passwort = scanner.nextLine().toCharArray();
	    boolean mindestensAchtZeichen = passwort.length >= 8;
	    int anzahlBuchstaben = 0;
	    int anzahlZiffern = 0;
	    boolean grossbuchstabeVorhanden = false;
	    boolean kleinbuchstabeVorhanden = false;
	    boolean sonderzeichenVorhanden = false;
	    boolean mindestensEineZifferOderSonderzeichen = false;
	    for (int i = 0; i < passwort.length; i++) {
	        char c = passwort[i];
	        if (Character.isLetter(c)) {
	            anzahlBuchstaben++;
	            if (Character.isUpperCase(c)) {
	                grossbuchstabeVorhanden = true;
	            } else {
	                kleinbuchstabeVorhanden = true;
	            }
	        } else if (Character.isDigit(c)) {
	            anzahlZiffern++;
	            mindestensEineZifferOderSonderzeichen = true;
	        } else if (!Character.isWhitespace(c)) {
	            sonderzeichenVorhanden = true;
	            mindestensEineZifferOderSonderzeichen = true;
	        }
	    }
	    boolean passwortGueltig = mindestensAchtZeichen && anzahlBuchstaben >= 2 && anzahlZiffern >= 2 &&
	                             grossbuchstabeVorhanden && kleinbuchstabeVorhanden && sonderzeichenVorhanden &&
	                             mindestensEineZifferOderSonderzeichen;
	    if (passwortGueltig) {
	        System.out.println("Das Passwort erfüllt die Kriterien.");
	    } else {
	        System.out.println("Das Passwort erfüllt nicht alle");

		
	}

	}
}
