package Main;

import javax.swing.*;
import Objetos.*;

public class milestone1App {

	public static void main(String[] args) {

		int sueldo = 0;
		String text = JOptionPane.showInputDialog("Introduce el puesto");
		text.toLowerCase();
		trabajador t1 = null;

		switch (text) {
		case "boss":
			do {
				sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo mayor a 8000€"));

			} while (!(sueldo >= 8000));
			t1 = new trabajador(Rol.boss, sueldo);
			break;
		case "manager":
			do {
				sueldo = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el sueldo mayor a 3000€ y menor a 5000"));
			} while (!(sueldo >= 3000 && sueldo <= 5000));
			t1 = new trabajador(Rol.manager, sueldo);
			break;
		case "senior":
			do {
				sueldo = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el sueldo mayor a 2700€ y menor a 4000"));
			} while (!(sueldo >= 2700 && sueldo <= 4000));
			t1 = new trabajador(Rol.senior, sueldo);
			break;
		case "mid":
			do {
				sueldo = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el sueldo mayor a 1800€ y menor a 2500"));
			} while (!(sueldo >= 1800 && sueldo <= 2500));
			t1 = new trabajador(Rol.mid, sueldo);
			break;
		case "junior":
			do {
				sueldo = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el sueldo mayor a 900€ y menor a 1600"));
			} while (!(sueldo >= 900 && sueldo <= 1600));
			t1 = new trabajador(Rol.junior, sueldo);
			break;
		case "volunteer":
			do {
				sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo igual a 0€"));
			} while (!(sueldo == 0));
			t1 = new trabajador(Rol.volunteer, sueldo);
			break;

		}

		sueldos1.calcularsueldo(t1);


		System.out.println(t1);


	}
}