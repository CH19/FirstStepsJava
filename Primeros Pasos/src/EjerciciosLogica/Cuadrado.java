package EjerciciosLogica;

public class Cuadrado extends Figura {

	private double lado;
	
	
	/**
	 * 
	 */
	public Cuadrado(double lado, double x, double y) {
		super(x,y);
		this.lado = lado;

		// TODO Auto-generated constructor stub
	}


	
	double CalcularArea() {
		double resultado = Math.pow(this.lado, 2);
		return resultado;
	}


	
	

}
