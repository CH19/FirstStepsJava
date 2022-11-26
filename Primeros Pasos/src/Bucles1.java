import javax.swing.JOptionPane;
public class Bucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Password = "contraseña";
		String user1 = "";
		int contador = 0 ;
		
		while(Password.equals(user1) == false){
			user1 = JOptionPane.showInputDialog("introduce la contrasenna correcta");
			contador = contador + 1;
			
			if(Password.equals(user1) ==  false) {
				System.out.println("ERROR \n contraseña incorrecta reintente nuevamente");
				
			}
		}
		System.out.print("Usted ingreso la contraseña correcta en el intento " + contador);
	}

}
