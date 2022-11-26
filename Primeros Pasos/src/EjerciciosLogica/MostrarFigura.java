package EjerciciosLogica;

class MostrarFigura {

	public static void main(String[] args) {
		
		Cuadrado cua = new Cuadrado(20, 5, 4);
		Circulo circ = new Circulo(30,6,4);
		
		System.out.println("el area del cuadrado es igual =" + cua.CalcularArea() + "cm");
		System.out.println("el area del circulo es igual =" + circ.CalcularArea() + "cm");
	}
	
}