import javax.swing.JOptionPane;

public class ejercicio34 {
	
	public static void main(String[] args) {
	//EJERCICIO 34
		/*
  String palabra = JOptionPane.showInputDialog("indica la palabra");
  
  char caracter [] = new char [palabra.length()];
  
  for (int i = 0; i < palabra.length(); i++) {
	  
	  caracter[i] = palabra.charAt(i);
	  System.out.println("el caracter " + i + "es igual a " + caracter[i]);
	
	  }*/
	//EJERCICIO 22
	/*String palabra = "La lluvia en Sevilla es una maravilla";
	int contador = 0;
	char caracter ;
	for (int i = 0; i < palabra.length(); i++) {
	
	caracter = palabra.charAt(i);
	
	if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
		contador++;
	}
	
		
	}
	
	System.out.println("en la palabra " + palabra + "hay " + contador + " vocales");
	System.out.println("con "  + palabra.length() + " caracteres");
	*/
  
  
		
		String semana [] ={"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		int diasSemana [] = {1,2,3,4,5,6,7};
		boolean a = false;
		System.out.println("indica el dia de la semana");
		
		int i = 0;
			do {
			
			int eleccion = Integer.parseInt(JOptionPane.showInputDialog("indica el dia de la semana de tu preferencua")); 
			if(eleccion >= 6 && eleccion < 8) {
			System.out.println("usted el dia " + semana[eleccion-1] + " tiene dia libre");
			a = true;
			}else if(eleccion < 6 && eleccion > 0){
				System.out.println("usted tiene que trabajar el dia " + semana[eleccion-1]);
				a = true;
			}else {
				System.out.println("valor incorrecto reintente nuevamente");
				a = false;
			}
			
		}while(a == false);
		
  }
	
}
