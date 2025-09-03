package Grace;

import java.util.Scanner;

public class Tugas2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		    System.out.print("Masukkan angka: ");
		    int angka = sc.nextInt();

		    boolean prima = true;
		    if (angka <= 1) {
		    	prima = false;
		    } else {
		        for (int i = 2; i <= angka / 2; i++) {
		        	if (angka % i == 0) {
		        		prima = false;
		                 break;
		        	}
		        }
		    }

		     if (prima) {
		         System.out.println("Angka " + angka + " adalah angka prima");
		     } else {
		         System.out.println("Angka " + angka + " bukan angka prima");
		     }
		   }

}