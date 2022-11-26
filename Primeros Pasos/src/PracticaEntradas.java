import java.util.*;
public class PracticaEntradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String NombreEmpleado = "";
		Scanner Estatica = new Scanner(System.in);
		double SalarioBase, MontoVentasEnero, MontoVentasFebrero, MontoVentasMarzo, PromedioVentas, ComisionVentas, SalarioTotal, TotalVentas;
		int DiasTrabajados, BonoTickets;
		
		System.out.println("Indique su nombre de empleado");
		NombreEmpleado = Estatica.nextLine();
		System.out.println("Muy bien " + NombreEmpleado + " Indiquenos cual es su Sueldo Base");
		SalarioBase = Estatica.nextDouble();
		System.out.println("Muy bien ahora indiquenos el monto de ventas del mes de Enero, Febrero y Marzo en ese orden");
		MontoVentasEnero = Estatica.nextDouble();
		MontoVentasFebrero = Estatica.nextDouble();
		MontoVentasMarzo =Estatica.nextDouble();
		System.out.println("Ahora indiquenos cuantos dias ha trabajado");
		DiasTrabajados = Estatica.nextInt();
		
		TotalVentas = MontoVentasEnero + MontoVentasFebrero + MontoVentasMarzo ;
		PromedioVentas = TotalVentas /3;
		ComisionVentas = TotalVentas * 0.15;
		BonoTickets = DiasTrabajados * 10;
		System.out.printf("%1.4f", PromedioVentas);
		PromedioVentas = PromedioVentas ;
		System.out.println("Usted " + NombreEmpleado);
		System.out.println("ha trabajado" + DiasTrabajados + "Dias");
		System.out.println("El total de ventas " + TotalVentas + "$");
		System.out.println("El promedio de ventas es de " + PromedioVentas + "$");
		System.out.println("Tu comision de ventas es de " + ComisionVentas + "$");
		System.out.println("y tu Bono de tickets Alimenticios es de " + BonoTickets + "$");
	
		
		
	}

}
