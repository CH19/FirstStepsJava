package Poo;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Practica {
  public static void main(String[] args) {
	
	  int contador0, contador1, contador2;
	  int cadena [] =  new int [18];
	  contador0 = 0;
	  contador1 = 0;
	  contador2 = 0;
	  
	  for(int i = 0; i<= cadena.length-1; i++) {
		  do{
			System.out.println("Indica el numero entre 0 y 2 " + i);
			cadena[i] =  Integer.parseInt(JOptionPane.showInputDialog("indica el numero entre 0 y 2"));
		  }while(cadena[i] > 3 || cadena[i] < 0);
		  if(cadena[i] ==  0) {
			  contador0++;
		  }else if(cadena[i] ==  1){
			  contador1++;
		  }else if(cadena[i] ==  2) {
			  contador2++;
		  }else {
			  
		  }
	  }
	  	System.out.println("el numero de paises a favor del comunismo es " + contador0 + "\nel numero de paises en contra del comunismo es " + contador1 + "\nel numero de paises neutrales al comunismo es" + contador2);
   }
	
	
}
