package Objetos;

public class trabajador {
	
	protected Rol rol;
	protected double sueldo;
	
	public trabajador(Rol rol, double sueldo) {
		this.rol = rol;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "trabajador [rol=" + rol + ", sueldo=" + sueldo + "]";
	}
	
	
}
