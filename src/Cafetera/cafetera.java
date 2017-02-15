package Cafetera;

public class cafetera {
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	public cafetera() {
		this.capacidadMaxima=1000;
		this.cantidadActual=0;
	}
	public cafetera(int capacidadMaxima){
		this.capacidadMaxima=capacidadMaxima;
		this.cantidadActual=capacidadMaxima;
	}
	public cafetera(int capacidadMaxima, int cantidadActual){
		this.capacidadMaxima=capacidadMaxima;
		if(cantidadActual>capacidadMaxima){
			this.cantidadActual=capacidadMaxima;
		}else{
			this.cantidadActual=cantidadActual;
			
		}
	}
	
	public long getCapacidadMaxima(){
		return capacidadMaxima;
	}
	public long getCantidadActual(){
		return cantidadActual;
	}
	public void setCapacidadMaxima(int capacidadMaxima){
		this.capacidadMaxima=capacidadMaxima;
	}
	public void setCantidadActual(int cantidadActual){
		this.cantidadActual=cantidadActual;
	}
	
	public void llenarCafetera(){
		this.cantidadActual=this.capacidadMaxima;
	}
	public void servirTaza(int taza){
		this.cantidadActual=this.cantidadActual-taza;
		
	}
	public void vaciarCafetera(){
		this.cantidadActual=0;
	}
	public void agregarCafe(int cafe){
		this.cantidadActual=this.cantidadActual+cafe;				
	}
	
	public String toString(){
		return 	"Capacidad maxima: "+this.capacidadMaxima+"\n" +
				"Cantidad actual: "+this.cantidadActual;
	}
}
