package Objetos;

public class sueldos1 {
	public static void calcularsueldo(trabajador t1) {
		switch(t1.rol) {
		case Manager:
			t1.sueldo*=1.10;
			break;
		case Boss:
			t1.sueldo*=1.50;
			break;
		case Employee:
			t1.sueldo*=0.85;
			break;
		case Volunteer:
			t1.sueldo*=0;
			break;
	}
	}
}
