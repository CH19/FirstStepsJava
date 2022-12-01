package Poo;

import javax.swing.JOptionPane;
import java.util.*;
public class UsoEmpleado {

	public static void main(String[] args) {
		//esto comentado porque es el objeto empleado sin usar la sobrecarga de constructores
	/*	ObjetoEmpleado Empleado = new ObjetoEmpleado();
		
		System.out.println(Empleado.ObtenerNombreEmpleado(JOptionPane.showInputDialog("indica el nombre del empleado")));
		
		System.out.println(Empleado.ObtenerSueldo(Integer.parseInt(JOptionPane.showInputDialog("introduce el sueldo del empleado"))) + "$");
		
		Empleado.FechaDeRetiro();
		System.out.println(Empleado.MostrarFechaAlta());
		
		Empleado.aumentarSueldo("si");
		System.out.println(Empleado.MostrarAumentoSueldo());
		*/
		//objeto con sobrecarga de constructores en forma de arreglo
		
		jefe Master = new jefe("boris", 1245, 21,4, 1982);
		Master.EstableceIncetivo(1500);
		Master.ObtenerSueldo(2500);
		
		
		ObjetoEmpleado MisEmpleados[] = new ObjetoEmpleado[7];
		
		MisEmpleados[1] = new ObjetoEmpleado("Christian", 1200, 19, 5, 2005);
		MisEmpleados[2] =  new ObjetoEmpleado("Fabian", 1500, 13, 4, 2007);
		MisEmpleados[3] =  new ObjetoEmpleado("Pedro", 1356, 21, 9, 2000);
		MisEmpleados[0] = new ObjetoEmpleado("Juana", 1256, 5, 9, 1977);
		//En este arreglo se esta usando la palabra reservada "this" para rellenar los datos faltantes con el sueldo y la fecha
		MisEmpleados[4] =  new ObjetoEmpleado("Enrique");
		MisEmpleados[5] = Master; //usandoo el objeto jefe heredado de objetoEmpleado se usa el principio del polimorfismo que sigue el principio de sustitucion
		MisEmpleados[6] = new jefe("Marta");
		
		jefe Gerente = (jefe) MisEmpleados[6];
		
		
		
		
		for (ObjetoEmpleado objetoEmpleado : MisEmpleados) {
			objetoEmpleado.setAumentarSueldoEn(1200);
		}
		
		Gerente.setAumentarSueldoEn(1500);;
		
		for (int i = 0; i < MisEmpleados.length; i++) {
			System.out.println((i+1) + "  " + MisEmpleados[i].MostrarDatosEmpleado() + "\n");
		}
		System.out.println("el jefe tiene un sueldo de " + Master.getSueldo());
		System.out.println(Gerente.TomarDecisiones("Estas Despedido juan Guarnizo"));//probando el metodo de la interfaz con la clase Jefe
		
		
	}
}
