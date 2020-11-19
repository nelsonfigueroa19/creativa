public class Principal extends CuentaB {

	public Principal(CuentaB cuentab) {
		super(cuentab);
	}

	public Principal(String NombreC, String NumeroC, double TipodeI, double Saldo) {
		super(NombreC, NumeroC, TipodeI, Saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Mensaje1(String constructor) {
		return "Mensaje para el constructor: " + constructor;
	}
}
