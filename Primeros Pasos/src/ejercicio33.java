import javax.swing.JOptionPane;

public class ejercicio33 {
  public static void main(String[] args) {
	
	  String name = "";
	  String name2 = "";
	  boolean a = false;
	  
	  do {
		  
		  System.out.println("indica una palabra");
		  name = JOptionPane.showInputDialog("escibe una palabra");
		  
		  System.out.println("escribe una segunda palabra");
		  name2 = JOptionPane.showInputDialog("escribe otra palabra");
		  
		  if(name.equalsIgnoreCase(name2)) {
			  System.out.println("las palabras son iguales");
			  a = true;
		  }else if(name != name2) {
			  System.out.println("las palabras son diferentes, vuelve a intentar");
		  }
		  
		  
	  }while(a == false);
	  
	String subcadena = name.substring(2, 4);
	System.out.println(subcadena);

	 /*double num =  Math.random()*100;
	 int num2 = 50;
	 int num3 = 5;
	  
	  System.out.print("el numero es ");
	  System.out.printf("%.1f", Math.sqrt(num2));
	  System.out.println();
	  System.out.printf("el numero aleatorio es %.1f", num);
	  
	  System.out.printf("el numero elevado al exponente es %.1f", Math.pow(num3, 3));
	  */
		  
	  
	  
	  
	  
	  
  }
	
}
