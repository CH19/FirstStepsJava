import javax.swing.JOptionPane;

public class Arrays3Bidimensionales {

	public static void main(String[] args) {
		
		
		int numbers [][] = new int [4] [5] ;
		//lectura e impersion de arreglos de segunda dimension
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < 5; j++) {
				
				numbers[i][j] = Integer.parseInt(JOptionPane.showInputDialog("introduce the number "));
				System.out.println("the number of the array  " + i + " " + j +" is " + numbers[i][j] );
			}
			
		}
	}
}
