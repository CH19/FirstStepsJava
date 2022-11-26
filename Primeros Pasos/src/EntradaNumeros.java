import  javax.swing.JOptionPane ;
import java.util.Scanner;
public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("ingresa el numero que deseas dividir");
		String decNum2 = JOptionPane.showInputDialog("Ingresa el segundo numero que deseas dividir");
		double x = Double.parseDouble(decNum2);
		
	

		
		System.out.printf("%1.4f", x/3);
	}

}
