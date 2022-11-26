import java.util.Iterator;

public class ejemploArray2D {
  public static void main(String[] args) {
	
	  double acumulado;
	  double tasaInteres = 0.10;
	  double porcentajeArray [][] =  new double [6][5];
	
	 for (int i = 0; i < 6; i++) {
		
		 porcentajeArray[i][0] = 10000;
		 acumulado = 10000;
		 for (int j = 1; j < 5; j++) {
			
			 acumulado = acumulado+(acumulado * tasaInteres);
			 porcentajeArray[i][j] = acumulado;
		}
		 tasaInteres = tasaInteres + 0.01;
	}
	
	 for(int z = 0; z < 6; z++) {
		 System.out.println();
		 for (int h = 0; h < 5; h++) {
			 System.out.printf("%1.2f" , porcentajeArray[z][h]);
			 System.out.println(" ");
			 
		}
	 }
	  
	  
	  
  }
  
}
