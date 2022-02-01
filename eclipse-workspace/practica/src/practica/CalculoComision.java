package practica;

import java.util.Scanner;

public class CalculoComision {
	public static void main() {
		
	
		Scanner s =new Scanner(System.in);
		System.out.println("Monto de venta:  ");
		Double venta=s.nextDouble();
		Double comision;
		
		if (venta >= 10000 ) {
			comision= venta*.30;
		System.out.println("Tu comision es de:  " + comision);
		}else if (venta>=5001 && venta<=10000) { 
			comision= venta*.20;
			System.out.println("Tu comision es de:  " + comision);
			
		}else if (venta>=1001 && venta<=5000) {
			comision= venta*.10;
			System.out.println("Tu comision es de:  " + comision);
		}else if (venta>=0 && venta <1001) {
			System.out.println("No aplica comision  " );
		}else {
			System.out.println("No puedes tener ventas negativas");
		}
		
		
		
		
		
		}	
	}


