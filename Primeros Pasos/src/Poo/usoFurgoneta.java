package Poo;

public class usoFurgoneta {

	public static void main(String[] args) {
		
		coche miCoche1 = new coche();
		
		miCoche1.CambiarColor("Rojo");
		
		Furgoneta camioneta1 = new Furgoneta(2, 300);
		
		camioneta1.CambiarColor("Amarillo");
		camioneta1.ExistenciaAireAcondicionado("si");
		
		System.out.println(miCoche1.MostrarDatoGenerales());
		System.out.println(camioneta1.MostrarDatoGenerales() + "\ny la furgoneta tiene: " + camioneta1.MostrarFurgoneta());
		
		
	}
	
}
