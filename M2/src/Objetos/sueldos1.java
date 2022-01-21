package Objetos;

public class sueldos1 {
	public static void calcularsueldo(trabajador t1) {
		switch(t1.rol) {
		case boss:
			t1.sueldo*=1.50;
			break;
		case manager:
			t1.sueldo*=1.10;
			break;
		case senior:
			t1.sueldo*=0.95;
			break;
		case mid:
			t1.sueldo*=0.90;
			break;
		case junior:
			t1.sueldo*=0.85;
			break;
		case volunteer:
			t1.sueldo*=0;
			break;
	}
	}
}
