import java.util.*;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce tu nombre");
		/*par usar el metodo Scanner primero tienes que importarlo, despues de eso tienes que inicializar un objeto que tenga el metodo 
		Y despues es que lo puedes empezar a usar, como hago en este pequeño programa*/
		String Nombre = entrada.nextLine();
		//al proceso que icimos en el objeto "entrada" se le llama instanciar una clase 
		System.out.println("Introduce tu edad actual");
		
		int edad = entrada.nextInt();
	
		System.out.println("Buenas " + Nombre + " el año proximo tendras " + (edad + 1 ) +  " Años");
		
	}

}
