package Objetos;

public class trabajador {
	
	protected Rol rol;
	protected double sueldobruto;
	protected double sueldoneto;
	
	public trabajador(Rol rol, double sueldo) {
		this.rol = rol;
		this.sueldobruto = sueldo;
		this.sueldoneto=0;
	}

	@Override
	public String toString() {
		if(this.rol==rol.volunteer) {
			return "trabajador [rol=" + rol + ", sueldobruto=" + sueldobruto + ", sueldoneto con ayudas=" + sueldoneto + "]";
		}
		return "trabajador [rol=" + rol + ", sueldobruto=" + sueldobruto + ", sueldoneto=" + sueldoneto + "]";
	}


	
}
