package aufgabe4;

import java.util.Scanner;

public class Zinstabelle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Kapitelwert eingaben: ");
		double kapitelwert = scan.nextDouble();
		
		System.out.println("Zinssatz eingaben: ");
		double zinssatz = scan.nextDouble();

		
		System.out.println("Laufzeit eingaben: ");
		int laufzeit = scan.nextInt();
		
		
		// testen ( klien oder gleich 7)
		if (laufzeit > 7) {
			
			System.out.println("Laufzeit kann maximal 7 Jahre dauern.");
			// Programm schlieﬂen
			return;
		}
		
		
		// Erstellung und Ausgabe einer Tabelle mit Zinseszinsen
		System.out.println("Jahreszahl  | Summenwert");
		System.out.println("________________________");
		
		for (int Jahreszahl = 1; Jahreszahl <= laufzeit; Jahreszahl++ ) {
			
			
		double summenwert = kapitelwert * Math.pow(1 + zinssatz / 100, Jahreszahl);
		
		System.out.printf("%-6d      | %-10.2f%n", Jahreszahl, summenwert);
		}

	}

}
