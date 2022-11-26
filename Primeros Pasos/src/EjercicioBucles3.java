import javax.swing.JOptionPane;
public class EjercicioBucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean atSing = false;
		String mail = JOptionPane.showInputDialog("introduce your email");
		
		for(int i = 1; i < mail.length(); i++) {
		//este metodo sirve para contar los caractares que tiene un objeto String, es muy util
			if(mail.charAt(i) == '@') {
				//este metodo hace que puedas ir al caracter deseadode una pablabra, si lo combinas con un ciclo puede ser bastante util
				atSing = true;
			}
		}
			if(atSing == true ) {
				System.out.println("the email is correct");
			}else {
				System.out.println("The email  is incorrect");
				//codigo hecho para verificar la introduccion y colocacion de un email en una aplicacion
			}
		
	}

}
