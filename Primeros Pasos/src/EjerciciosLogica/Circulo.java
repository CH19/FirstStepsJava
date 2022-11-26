package EjerciciosLogica;

public class Circulo extends Figura {

	double raiz;
	
	Circulo(double raiz, double y, double x){
		super(x,y);
		this.raiz = raiz;
	}
	
	double CalcularArea(){
		double resultado = Math.PI * Math.pow(raiz, 2);
		return resultado;
	}

}
