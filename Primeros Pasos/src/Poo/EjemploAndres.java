package Poo;

public class EjemploAndres {
	static int id; 
	public static void main(String[] args) {
	
		String variableEjemplo;
		int variable2;
		
		id = 7;
		System.out.println(Suma(id, 5));
		
		
	}
 static int Suma(int val1, int val2) {
	 return val1+val2;
 }
 static String print(String algo) {
	 System.out.println(algo);
	 return algo;
 }
}

class objeto{
	
	public String atributo1;
	public int atributo2;
	
	objeto(){//este es el metodo constructor
		
	}

	public String getAtributo1() {//ejemplo getter
		return atributo1;
	}

	public void setAtributo1(String atributo1) {//ejemplosetter
		this.atributo1 = atributo1;
	}

	public int getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

}