package Poo;

import javax.swing.JOptionPane;

public class UsoVehiculo {
	public static void main(String[] args) {
		
		//coche Renault = new coche();
		coche Mercedez = new coche();
		/*Mercedez.DatosGenerlaes(ruedas);
		Mercedez.MostrarDatoGenerales();
		System.out.println(Mercedez.MostrarColor());
		*/
		//Renault.ruedas = 3;
		//no aparece el error en Renault.ruedas porque es una clase privada y por eso SOLO SE PUEDE MODIFICAR  en el objeto
		//System.out.println("este coche tiene " + Renault.ruedas + " ruedas");
		//System.out.println(Renault.MostrarRuedas());
		/*Mercedez.CambiarColor("verde");
		System.out.println(Mercedez.MostrarDatoGenerales());
		*/
		
		System.out.println(Mercedez.MostrarDatoGenerales());
		
		Mercedez.ExistenciaAireAcondicionado(JOptionPane.showInputDialog("el Carro lleva aire Acondicionado??"));
		System.out.println(Mercedez.ExistenciaAire());
		
	
		
		Mercedez.ExistenciaASientos(JOptionPane.showInputDialog("El carro Lleva asientos??"));
		System.out.println(Mercedez.MostrarExistenciaAsientos());
		
		System.out.println(Mercedez.PesoCarro() + "Kg");
		
		Mercedez.CalcularPrecioTotal();
		System.out.println(Mercedez.MostrarPrecioTotal());
	}

}
