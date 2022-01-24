package Objetos;

public class trabajador {
	
	protected Rol rol;
	protected double sueldobruto;
	protected double sueldoneto;
	protected double sueldonetoanual;
	protected double sueldobrutoanual;
	
	public trabajador(Rol rol, double sueldo) {
		this.rol = rol;
		this.sueldobruto = sueldo;
		this.sueldoneto=0;
		this.sueldobrutoanual=0;
		this.sueldonetoanual=0;
	}

	@Override
	public String toString() {
		if(this.rol==rol.volunteer) {
			return "trabajador [rol= " + rol + ", sueldobruto= " + sueldobruto + ", sueldoneto con ayudas= " + sueldoneto + " , sueldo neto anual es = "+ sueldonetoanual+", el sueldo bruto anual es = "+sueldobrutoanual+"]";
		}
		return "trabajador [rol= " + rol + ", sueldobruto= " + sueldobruto + ", sueldoneto= " + sueldoneto + " , sueldo neto anual es = "+ sueldonetoanual+", el sueldo bruto anual es = "+sueldobrutoanual+"]";
	}


	
}
