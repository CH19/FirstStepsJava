import javax.swing.JOptionPane;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [] = new int [4];
		int xd = 0;
		for(int i = 0; i < matriz.length; i++){
			matriz[xd] = Integer.parseInt(JOptionPane.showInputDialog("Introducing the number for the array"));
			
			
			
			
			xd = xd + 1;
		}
		
		System.out.print(matriz[3]);
		for(int j = 0; j < matriz.length; j++) {
			/*use la variable "XD" para simplemente imprimir la variable del arreglo dependiendo de donde estaba, no funciono en lo absoluto
			Me frustro bastante el hecho que ese estupido error me consumio como una hora completa de tiempo. espero aprender que cuando declaras
			arreglos con un bucle for sabes para que esta hecho. Saludos
			*/
			System.out.println("the array " + j + "is equal to " +  matriz[j] );
			xd = xd + 1;
			
		}
		String Arreglo [] = new String [xd];
		xd = Integer.parseInt(JOptionPane.showInputDialog("introduce the lenght for the array"));
		
		for(int j = 1; j < Arreglo.length; j++ ) {
			Arreglo[xd] = JOptionPane.showInputDialog("introduce the data for the array");
		}
		
		
		
	}

}
