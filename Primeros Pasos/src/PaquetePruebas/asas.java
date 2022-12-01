package PaquetePruebas;
import java.util.*;
public class asas {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		String a [] = new String[10];
		System.out.println("introduce el contenido de los arreglos");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i);
			String respuesta = r.next();
			respuesta = a[i];
			
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println("DescriptWords[" + j + "] =" + a[j] + ";");
		}
	}
	
}
