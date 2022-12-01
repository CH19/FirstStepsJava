package Poo;

public class EjAbst {

	public static void main(String[] args) {
	/*	Empleado2 emps = new Empleado2("Christian", 1200, 19, 5, 2005);
		
		System.out.println(emps.getDescription());
		
		alumno als = new alumno("fabii", 15, 4);
		System.out.println(als.getDescription());
		*/
		//hacer lo mismo pero con array
		
		Persona perso[] =  new Persona[2];
		perso[0] = new Empleado2("Christian",1200,5,5,200);
		perso[1] = new alumno("Fabi", 15, 4);
		
		for (int i = 0; i < perso.length; i++) {
			System.out.println(perso[i].getDescription());
		}
	}
}
