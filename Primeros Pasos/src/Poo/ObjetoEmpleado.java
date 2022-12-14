package Poo;
import java.util.*;


import javax.swing.JOptionPane;
public class ObjetoEmpleado implements Trabajadores {

	private String NombreEmpleado;
	private double Sueldo;
	//atributos del objeto privados respetando el encapsulamiento
	private double SubirSueldo;
	private int year = 0;
	private int month = 0;
	private int day = 0;
	private double Porcentaje;
	private int AumentarSueldoEn;
	//constructor de objeto 1
	

	
	public ObjetoEmpleado(String nombre, double Sueldo, int day, int month, int year) {
		this.NombreEmpleado = nombre;
		this.Sueldo = Sueldo;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//Constructor de objeto 2
	public ObjetoEmpleado(String nombre) {
		

		this(nombre, 1500, 1, 2, 2000);
	
	}
	public void setAumentarSueldoEn(int aumentarSueldoEn) {
		this.AumentarSueldoEn = aumentarSueldoEn;
		this.Sueldo = this.Sueldo + this.AumentarSueldoEn;
	}
	public String ObtenerNombreEmpleado(String NombreEmpleado) {
		
		this.NombreEmpleado = NombreEmpleado;
		return "El empleado " + this.NombreEmpleado;
	}
	public void ObtenerSueldo(double sueldo) {
		 Sueldo = sueldo;
	
	}

	public void FechaDeRetiro() {
		Random randomNumber = new Random() ;
		//este metodo sirve para calcular el año, el mes y el dia de jubilacion de un empleado de manera aleaotria
		year = Integer.parseInt(JOptionPane.showInputDialog("introduce la fecha de retiro en años"));
		month = randomNumber.ints(1,(12+1)).findFirst().getAsInt();
		day = randomNumber.ints(1,(30+1)).findFirst().getAsInt();
	}
	public String MostrarFechaAlta() {
		//getter par amostrar la fecha de alta del empleado
		return "la fecha de alta del empleado" + this.NombreEmpleado + "es " + day + "/" + month + "/" + year;
	}
	public void aumentarSueldo(String Respuesta) {
		boolean decision;
		if(Respuesta.equalsIgnoreCase("si")) {
			decision = true;	
			//setter para calcular el aumento de sueldo del empleado
		}else {
			decision = false;
			this.SubirSueldo = this.Sueldo;
		}
		if(decision) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("introduce cuando deseas aumentar el sueldo en porcentaje %"));
			this.Porcentaje = (Sueldo * num/100);
			SubirSueldo = (this.Porcentaje + this.Sueldo);
		}
	}
	public String MostrarAumentoSueldo() {
		return "el sueldo aumentado queda en " + SubirSueldo + "$";
	}
	public String MostrarDatosEmpleado() {
		return "el nombre del empleado es" + this.NombreEmpleado + "\nSu sueldo es de " + this.Sueldo + "\ny su fecha de alta " +  "es " + day + "/" + month + "/" + year;
	}
	public double getSueldo() {
		return this.Sueldo;
	}
	public double EstableceBonus(double BonusSueldo) {
		
		return BonusSueldo + BonusMinimo;
	}

}

abstract class Persona{
	protected String name;
	public Persona(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract String getDescription();
}

class jefe extends ObjetoEmpleado implements Jefes{
	private double Incentivo4 = 0;
	public double SueldoMaster = 0;
	public jefe(String nombre, double Sueldo, int day, int month, int year) {
		
     super (nombre, Sueldo, day, month, year);
	
	}
	public jefe(String nom) {
		super(nom);
	}
	public void EstableceIncetivo(double incentivo) {
	Incentivo4 = incentivo;
	}
	public double getSueldo() {
		 double sueldojefe =  super.getSueldo();
		 SueldoMaster = sueldojefe + SueldoMaster + Incentivo4;
		 return SueldoMaster;
	}
	
	public String TomarDecisiones(String decision) {
		return "la decision tomada por el jefe es= " + decision; //este es un metodo obligatoria tomado de la interfaz Jefes para la clase Jefes
	}
	public double EstableceBonus(double BonusSueldo) {
		double prima = 500.0;
		return BonusSueldo + prima;
	}
}

class Director extends jefe {
	//Clase heredada de jefe
	public Director(String nom) {
		super(nom);
	}
	//Metodos constructores del Director
	public Director(String nombre, double Sueldo, int day, int month, int year) {
		super( nombre,  Sueldo,  day,month, year);
	}
}

class Empleado2 extends Persona{
	private String NombreEmpleado;
	private double Sueldo;
	//atributos del objeto privados respetando el encapsulamiento
	private double SubirSueldo;
	private int year = 0;
	private int month = 0;
	private int day = 0;
	private double Porcentaje;
	private int AumentarSueldoEn;
	//constructor de objeto 1
	

	//objeto hecho para probar las clases abstractas
	public Empleado2(String nombre, double Sueldo, int day, int month, int year) {
		super(nombre);//el super porque estoy importando el constructor para obtenr el nombre de la clase Persona
		this.Sueldo = Sueldo;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//Constructor de objeto 2
	public Empleado2(String nombre) {
		

		super(nombre);//el super porque estoy importando el constructor para obtenr el nombre de la clase Persona
	
	}
	
	public String getDescription() {
		return "el sueldo del empleado es= " + Sueldo + "el nombre del empleado= " + this.name;
	}
	
}

class alumno extends Persona{
	
	private int edad;
	private int gradoNum;
	public alumno(String name, int edad, int gradoNum) {
		super(name);
		this.edad = edad;
		this.gradoNum = gradoNum;
	}
	
	public String getDescription() {
		return "el alumno" + name + "tiene " + edad + " Años y esta en " + gradoNum + " grado";  
	}
	
	
}