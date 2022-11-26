package EjerciciosLogica;

public abstract class Figura {

	protected double x;//posicion x
	protected double y; //posicion y
	//los atributos de una clase abstracta no pueden ser instanciados

	Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double CalcularArea() ; //se pone la palabra reservada abstract para señalar que es un metodo abstracto
 //no se abren llaves porque como es un metodo abstracto cualquier subclase lo va a interpretar como quiera
}
