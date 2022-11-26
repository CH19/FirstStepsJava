package Poo;
//La plabra reservada "extends" quiere decir que la clase Furgonete esta herendando todos los atributos y metodos de la clase indicada, en este ejemplo la clase Coche
public class Furgoneta extends coche {
	//Aqui declarando atributos especificos que debe tener la clase Furgoneta
	private int capacidadCarga;
	private int puestosExtra;
	
	//Metodo constructor de la clase Furgoneta
	public Furgoneta(int puestosExtra, int capacidadCarga) {
		super();
		this.puestosExtra = puestosExtra;
		this.capacidadCarga = capacidadCarga;
	}
	public String MostrarFurgoneta() {
		return "los puestos de la furgoneta extra son: " + this.puestosExtra + " y la capacidad extra de carga es de: " + this.capacidadCarga + "KG";
	}
}
