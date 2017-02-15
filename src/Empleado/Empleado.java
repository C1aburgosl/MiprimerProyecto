package Empleado;

public class Empleado {
	private long NIF;
	private long sueldoBase;
	private long pagoHorasExtra;
	private long horasExtra;
	private long IRPF;
	private boolean casado;
	private int numHijos;
	
	public Empleado(long NIF,long sueldoBase,long pagoHorasExtra,long horasExtra,long IRPF,boolean casado,int numHijos){
		this.NIF=NIF;
		this.sueldoBase=sueldoBase;
		this.pagoHorasExtra=pagoHorasExtra;
		this.horasExtra=horasExtra;
		this.IRPF=IRPF;
		this.casado=casado;
		this.numHijos=numHijos;
		
	}
	
	public long getNIF(){
		return NIF;
	}
	public void setNIF(long NIF){
		this.NIF=NIF;
	}
	
	public long getsueldoBase(){
		return sueldoBase;
	}
	public void setsueldoBase(long sueldoBase){
		this.sueldoBase=sueldoBase;
	}
	
	public long getpagoHorasExtra(){
		return pagoHorasExtra;
	}
	public void setpagoHorasExtra(long pagoHorasExtra){
		this.pagoHorasExtra=pagoHorasExtra;
	}
	
	public long gethorasExtra(){
		return horasExtra;
	}
	public void sethorasExtra(long horasExtra){
		this.horasExtra=horasExtra;
	}
	
	public long getIRPF(){
		return IRPF;
	}
	public void setIRPF(long IRPF){
		this.IRPF=IRPF;
	}
	
	public boolean getcasado(){
		return casado;
	}
	public void setcasado(boolean casado){
		this.casado=casado;
	}
	
	public int getnumHijos(){
		return numHijos;
	}
	public void setnumHijos(int numHijos){
		this.numHijos=numHijos;
	}
	
	public long calculoExtras(){
		return this.pagoHorasExtra*this.horasExtra;
	}
	
	public long calculoSueldo(){
		return calculoExtras()+this.sueldoBase;
	}
	
	public long calculoIRPF (){
		return calculoSueldo()+this.IRPF;
		
	}
	
	public String println(){
		return 	"NIF: "+this.NIF+"\n" +
				"Casado: "+this.casado+"\n" +
				"Numero de hijos: "+this.numHijos+"\n"+
				"Sueldo Base: "+this.sueldoBase+"\n" +
				"Pago por horas extra: "+this.pagoHorasExtra+"\n"+
				"Horas extra: "+this.horasExtra+"\n"+
				"IRPF: "+this.IRPF;
				
	}
	public String printAll(){
		return 	"NIF: "+this.NIF+"\n" +
				"Casado: "+this.casado+"\n" +
				"Numero de hijos: "+this.numHijos+"\n"+
				"Sueldo Base: "+this.sueldoBase+"\n" +
				"Pago por horas extra: "+this.pagoHorasExtra+"\n"+
				"Horas extra: "+this.horasExtra+"\n"+
				"IRPF: "+this.IRPF+"\n"+
				"Calculo pago horas extras: "+calculoExtras()+"\n"+
				"Calculo pago sueldo bruto: "+calculoSueldo()+"\n"+
				"Calculo retenciones: "+calculoIRPF();
		
	}
	
	

}
