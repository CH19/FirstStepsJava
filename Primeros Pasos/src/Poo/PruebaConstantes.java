package Poo;

import java.util.Iterator;
import java.util.Scanner;

public class PruebaConstantes {

public static void main(String[] args) {
	Humano human = new Humano("christian");
	Humano human2 = new Humano("Fabian");
	Humano human3 = new Humano("pedro");
//human.CambiarSangre();
human.DevolverTipoSangre();
human.IdEmpleados();
System.out.println(human.aaaa() + "\n" + human.MostrarId());
//human2.CambiarSangre();
human2.DevolverTipoSangre();
human2.IdEmpleados();
System.out.println(human2.aaaa() + "\n" + human2.MostrarId());
//human3.CambiarSangre();
human3.DevolverTipoSangre();
human3.IdEmpleados();
System.out.println(human3.aaaa() + "\n" + human3.MostrarId());
System.out.println(Humano.MostrarIdSiguiente());

  }

}

	
	
	