package Main;

import Objetos.*;

public class milestone1App {

	public static void main(String[] args) {
		trabajador t1 = new trabajador(Rol.Boss,1000);
		trabajador t2 = new trabajador(Rol.Manager,1000);
		trabajador t3 = new trabajador(Rol.Employee,1000);
		trabajador t4 = new trabajador(Rol.Volunteer,1000);
		
		sueldos1.calcularsueldo(t1);
		sueldos1.calcularsueldo(t2);
		sueldos1.calcularsueldo(t3);
		sueldos1.calcularsueldo(t4);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

	}

}
