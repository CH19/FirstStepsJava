package Poo;

import java.util.Scanner;

public class Humano {

	private final String nombreHumano;
	private String Cabeza;
	private String TipoSangre;
	private int brazos;
	private int piernas;
	private boolean ExistenciaPiernas;
	private boolean ExistenciaBrazos;
	private int Edad;
	private boolean ExistenciaSangre = false;
	public String message = "";
	private static int IdSecuencia =  1;
	private int IdPersonal;
public Humano(String nom) {
	 nombreHumano  = nom;
}
/*	public void IdEmpleaod() {
		int aux = 0;
		if(this.Id == this.Id) {
			aux = Id;
			aux++;
		}
		Id = aux;
	}*/
public void IdEmpleados() {
	IdPersonal = IdSecuencia;
	IdSecuencia++;
}

	public String MostrarId() {
		return "El id del humano es" + IdPersonal;
	}
	public static String MostrarIdSiguiente() {
		return "el id siguiente seria" + IdSecuencia;
	}
	public void CambiarSangre(){
		Scanner DataChar = new Scanner (System.in);
		System.out.println("indica que tipo de sangre tienes");
		String condiciones [] = {"A","B","O","AB"};
		String EleccionSangre;
		EleccionSangre = "";
		EleccionSangre = DataChar.nextLine();
			for (int i = 0; i < condiciones.length; i++) {
				if(EleccionSangre.equalsIgnoreCase(condiciones[i])) {
					this.TipoSangre = EleccionSangre;
					ExistenciaSangre = true;
				}
			}
	}
	
	public void DevolverTipoSangre(){
		String message;
		if(ExistenciaSangre) {
			message = "El tipo de sangre de " + nombreHumano + " es de tipo " + this.TipoSangre;
			this.message = message;
		}
	}
	public String aaaa() {
		return this.message;
	}
}



