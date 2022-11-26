import javax.swing.JOptionPane;

public class Arrays2 {
	public static void main(String[] args) {
		
		
		
		//String paises [] = {"alemania","venezuela","polonia","colombia", "peru", "argentina", "cuba"};
		/*String paises [] = new String [7];
		/*for (int i = 0; i < paises.length; i++) {
			
			System.out.println((i+1) + " el pais es " + paises[i]);
			
		}
			
		for (int i = 0; i < paises.length; i++) {
			
			paises[i]=  JOptionPane.showInputDialog((i+1) + " Introduce el pais que ira al mundial");
		}
		
		
		for(String pais: paises) {
			System.out.println("el pais " + pais + " participara en el mundial");
			*/
	
		int randomNumber [] = new int [150];
		
		for (int i = 0; i < randomNumber.length; i++) {
			
			randomNumber[i] = (int)Math.round(Math.random()*100);
		}
		int a = 0;
		
		for(int route: randomNumber) {
			System.out.println((a++ + 1) +" The number is" + route + ",  ");
		}
	
	}
		
}

