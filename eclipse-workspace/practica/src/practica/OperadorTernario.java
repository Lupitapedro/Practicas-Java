package practica;

import java.util.Scanner;

public class OperadorTernario {
	public static void main() {
		Scanner value =new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int age =value.nextInt();
		
		System.out.println(age >=18 && age<=150 ? "Eres mayor de edad":
			age>0 && age<18?"eres menor de edad": "valor fuera de rango");
		
	}

}
