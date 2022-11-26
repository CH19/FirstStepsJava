import javax.swing.*;
public class Bucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("indica tu si eres [M]asculino o [F]emenino");
		
		String gender = "";
		int contator = 0;
		do {
			 gender = JOptionPane.showInputDialog("What is your gender [M]aculine or [F]emeine?");
			 contator = contator + 1;
		}while(gender.equalsIgnoreCase("M") == false && gender.equalsIgnoreCase("F") == false);
			
		int tall = Integer.parseInt(JOptionPane.showInputDialog("Introduce your tall in cm"));
		
		int idealWeight = 0;
		
		if(gender.equalsIgnoreCase("M") == true) {
		idealWeight = tall - 110;
		
		System.out.println("You're a man and you ideal weight is " + idealWeight + "Kg");
		
		}else if(gender.equalsIgnoreCase("F") == true) {
			idealWeight = tall - 120;
			
			System.out.println("You're a girl and you ideal weight is " + idealWeight + "Kg");
		}else {
			System.out.println("ERROR");
		}
		System.out.println("The number of attemps is " + contator);
	
	}

}
