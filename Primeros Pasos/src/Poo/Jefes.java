package Poo;

public interface Jefes extends Trabajadores {/*aqui estamos heredando de una interfaz lo cual quiere decir que cualquier clase que herede de la interfaz jefes
	va a tener que incluir los metodos de trabajadores, esto es lo que se llama JERARQUIA DE INTERFACES y la interfaz trabajdores esta en la punta 
	de la piramide*/

	public abstract String TomarDecisiones(String decision); //asi se declara un metodo en una intergaz
	//la palabra public y abstract no es necesaria colocarla porque la interfaz la toma como obivio su escritura

}
