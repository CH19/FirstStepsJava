
public class Arrays003Bidimensionales {

	public static void main(String[] args) {
		//buscando un error como pendejo y no pude ver que era que no habia declarado la variable como array
		int array [][] = {
				{12,23,34,45,56,67},
				{12,234,56,32,74, 3},
				{12,34,45,56,67,23}
					};
		
		/*for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 6; j++) {
				
				System.out.println("la variables " + i + " " + j + " contiene a " + array[i][j]);
				*/
			int xd = 1;
			for (int[] fila : array) {
				System.out.println("columna" + xd++);
				//para hacer un array conjunto que contenga toda la data con el ciclo for each con el segundo ciclo debemos de recorrer la variable de la primera
				
				for (int data : fila) {
					System.out.print(data + " ");
				}
				
			}
		
			
	}
		
		
		
	

}