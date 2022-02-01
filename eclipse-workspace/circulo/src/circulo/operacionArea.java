package circulo;

import java.util.Scanner;

public class operacionArea {
	public static void operacionArea(String[] args) {
		Scanner s= new Scanner(System.in);

		System.out.println ("Ingresa la base");
		double base= s.nextDouble();

		System.out.println ("Ingresa el la altura");
		double altura= s.nextDouble();


		double area =(base*altura)/2;
		System.out.println("El area del triangulo es: " + area);
	}

}
