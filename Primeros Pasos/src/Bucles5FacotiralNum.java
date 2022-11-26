import javax.swing.JOptionPane;

public class Bucles5FacotiralNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long resultado = 1;
		int number = Integer.parseInt(JOptionPane.showInputDialog("introduce a number"));
		
		for(int i = number;i>0; i--){
			
			resultado = resultado*i;
		}
		
		System.out.println("the factual the a number " + number + " is " + resultado);
	}

}
