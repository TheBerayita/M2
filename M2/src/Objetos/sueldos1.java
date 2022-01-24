package Objetos;

public class sueldos1 {
	public static void calcularsueldo(trabajador t1) {
		switch (t1.rol) {
		case boss:
			t1.sueldobruto *= 1.50;
			t1.sueldoneto = t1.sueldobruto * 0.68;
			t1.sueldobrutoanual = t1.sueldobruto * 12;
			t1.sueldonetoanual = t1.sueldoneto * 12;
			break;
		case manager:
			t1.sueldobruto *= 1.10;
			t1.sueldoneto = t1.sueldobruto * 0.74;
			t1.sueldobrutoanual = t1.sueldobruto * 12;
			t1.sueldonetoanual = t1.sueldoneto * 12;
			break;
		case senior:
			t1.sueldobruto *= 0.95;
			t1.sueldoneto = t1.sueldobruto * 0.76;
			t1.sueldobrutoanual = t1.sueldobruto * 12;
			t1.sueldonetoanual = t1.sueldoneto * 12;
			break;
		case mid:
			t1.sueldobruto *= 0.90;
			t1.sueldoneto = t1.sueldobruto * 0.85;
			t1.sueldobrutoanual = t1.sueldobruto * 12;
			t1.sueldonetoanual = t1.sueldoneto * 12;
			break;
		case junior:
			t1.sueldobruto *= 0.85;
			t1.sueldoneto = t1.sueldobruto * 0.98;
			t1.sueldobrutoanual = t1.sueldobruto * 12;
			t1.sueldonetoanual = t1.sueldoneto * 12;
			break;
		case volunteer:
			t1.sueldobruto *= 0;
			t1.sueldoneto = t1.sueldobruto + 300;
			t1.sueldobrutoanual = t1.sueldobruto * 12;
			t1.sueldonetoanual = t1.sueldoneto * 12;

			break;
		}
	}
}
