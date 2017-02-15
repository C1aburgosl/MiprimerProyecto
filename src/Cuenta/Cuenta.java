package Cuenta;



public class Cuenta {
	private static long cuenta=10001;
	private long NumCuenta;
	private long DNI;
	private long Saldo;
	private long Interes;
	
	public Cuenta(){
		this.NumCuenta=cuenta++;
		this.DNI=0;
		this.Saldo=0;
		this.Interes=0;
	}
	
	public Cuenta(long DNI,long Saldo,long Interes){
		this.NumCuenta=cuenta++;
		this.DNI=DNI;
		this.Saldo=Saldo;
		this.Interes=Interes;
	}
	
	public long getNumCuenta(){
		return NumCuenta;
	}
	
	public long getDNI(){
		return DNI;
	}
	public long getSaldo(){
		return Saldo;
	}
	public long getInteres(){
		return Interes;
	}
	
	public void setDNI(long DNI){
		this.DNI=DNI;
	}
	
	public void setSaldo(long Saldo){
		this.Saldo=Saldo;
	}
	
	public void setInteres(long Interes){
		this.Interes=Interes;
	}
	
	public void actualizarSaldo(){
		this.Saldo=this.Saldo+(((this.Interes*this.Saldo)/100)/365);
	}
	
	public void ingresar(long dinero){
		this.Saldo=this.Saldo+dinero;
	}
	
	public void retirar(long dinero){
		this.Saldo=this.Saldo-dinero;
	}
	
	public String toString(){
		return 	"Numero de cuenta: "+this.NumCuenta+"\n" +
				"Saldo actual: "+this.Saldo+"\n" +
				"DNI cliente: "+this.DNI+"\n" +
				"Intereses: "+this.Interes;
	}
	

}
