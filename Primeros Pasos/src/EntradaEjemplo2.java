import javax.swing.JOptionPane;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName = JOptionPane.showInputDialog("ingresa tu nombre de usuario");
		
		String age = JOptionPane.showInputDialog("ingresa tu edad");
		
		int ageUsername = Integer.parseInt(age);
		ageUsername++;
		System.out.println("Buenas " + UserName + " El año que viene cumpliras " + ageUsername + " nos vemos");
	}

}
