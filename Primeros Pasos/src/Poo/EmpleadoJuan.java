package Poo;
import java.util.*;
public class EmpleadoJuan {
//CONSTRUCCION DEL PROGRAMA HECHO EN EL VIDEO 34 DE JAVA  por parte de la logica de juan de pildoras informaticas
	public static void main(String[] args) {
		
	}
	
	class EmpleadoUsos{
		
		private String employee;
		private int salary;
		private Date FechaAlta;
		public EmpleadoUsos(String employeeName, double SalaryBase, int year, int month, int day) {
			
			employee = employeeName;
			salary = (int)SalaryBase;
			
			GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
			FechaAlta = calendario.getTime();			
		}
		
		public String MostrarData() { //getter
			
			return "el nombre es " + employee;
			
		}
		
		public int MostrarSalario() { //getter
			return salary;
		}
		public Date MostrarFecha() { //getter
			return FechaAlta;
		}
		
		public void SubirSueldo(double Porcentage) {
			double aumento = salary * (Porcentage / 100);
			salary += aumento;
			
		}
		public int MostrarSueldoAumentado() {
			return salary;
		}
	
	}
}
