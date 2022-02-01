package practica;

import java.util.Scanner;

public class Switch {
	public static void main() {
		Scanner s =new Scanner(System.in);
		System.out.println("Elige una opcion ");
		String enter=s.nextLine();
		switch(enter){
		
			case "1":
				System.out.println("Elegiste opcion 1");
				break;
			case "2":
				System.out.println("Elegiste opcion 2");
				break;
			default:
				System.out.println("no es un opcion");
				break;
		}
		
	}

}
