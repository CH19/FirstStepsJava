package Poo;

public class coche {

	private	int  ruedas;
	private int pesoPlataforma;
	private int largo;
	private int ancho;
	private int motor;

	private int pesoTotal;
	private String colorCoche;
	private boolean AireAcondicionado, asientosCueros;
	
	int PrecioTotal;
	
	public coche() {
		
		ruedas = 4;
		pesoPlataforma = 550;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		PrecioTotal = 0;
		colorCoche = "verde";
		
	}
	
	public String MostrarRuedas() { //GETTER
		return "la cantidad de ruedas es " + ruedas;
	} 
	public void CambiarColor(String color) { //SETTER
		colorCoche = color;
	}
	public void DatosGenerlaes(int dato) {
		dato = ruedas;
		dato = pesoPlataforma;
		dato = largo;
		dato = ancho;
		dato = motor;
		dato = pesoTotal;
	}
	
	public String MostrarDatoGenerales() {
		return "El color del auto es " + colorCoche + " mide " +
	largo/1000 +  " metros" + "con un ancho de " + ancho/100 + " metros." + 
				"y un peso de plataforma de " + pesoPlataforma + "kg";
	}
	
	public void ExistenciaAireAcondicionado(String AireAcondicionado) { //Setter
		
		if(AireAcondicionado.equalsIgnoreCase("si")) {
			this.AireAcondicionado = true;
		}else {
			this.AireAcondicionado = false;
		}
	}
	
	public String ExistenciaAire(){ //Getter
		
		if(AireAcondicionado == true) {
			return "El auto tiene aireAcondicionado :)";
		}else if(AireAcondicionado == false) {
			return "el aire acondicionado no tinee aireAcondicionado :(";
		}else {
			return "no hay asientos";
		}
		
	}
	
	public void ExistenciaASientos(String Asientos) {
		
		if(Asientos.equalsIgnoreCase("si")) {
			asientosCueros = true;
		}else {
			asientosCueros = false;
		}
	}
	
	public String MostrarExistenciaAsientos() {
		
		if(asientosCueros == true) {
			return "hay asientos de cuero";
		}else {
			return "Los asientos son convencionales";
		}
	}
	
	public String PesoCarro () { //getter y setter al mismo tiempo
		//ESTA PRACTICA NO ES RECOMENDABLE
		
		int PesoCarro;
		
		
		if(AireAcondicionado == true) {
			pesoTotal += 10;
		}
		
		if(asientosCueros == true) {
			pesoTotal += 50;
		}else {
			pesoTotal += 20;
		}
		PesoCarro = pesoTotal + pesoPlataforma;
		
		return "el peso total del carro es igual = " + PesoCarro;
	
	}

	public void CalcularPrecioTotal() {
		
		PrecioTotal = 10000;
		
		if(asientosCueros == true) {
			PrecioTotal += 2000;
		}
		
		if(AireAcondicionado == true) {
			PrecioTotal += 1500;
		}
	
	}
	public String MostrarPrecioTotal() {
		return "el precio total del carro es " + PrecioTotal;
	}
	
	

}
