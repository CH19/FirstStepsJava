//clase para probar los datos enum
import java.util.Scanner;
public class Uso_Tallas 
{

	//enum Tallas{PEQUENNA, MEDIANA, GRANDE};//enum simple
	
	//enum complejo con metodos contructores y metodos
	
	enum tallas
	{
		PEQUENNA("S"), MEDIANA("M"), GRANDE("L"), MUYGRANDE("XL");//en los datos del enum se ponen entre parentesis el tipo de parametro permitido
		//a la linea escrita
		//metodo constructor del enum
		private tallas(String abreviatura) 
		{//en los enum el metodo constructor siempre debe ser private
			this.abreviatura = abreviatura;
		}
		private String abreviatura;//los enum son objetos completos por lo que tambien hay atributos 
		
		public String getAbreviatura() 
		{//en los enum tambien hay metodos setter y getter para modificar el objeto
			return abreviatura;
		}
	
	}
	
	public static void main(String[] args) 
	{
		
		Scanner respuesta = new Scanner(System.in);
		
		System.out.println("introduce la talla a comprar, PEQUENNA, MEDIANA, GRANDE o MUYGRANDE");
		String a = respuesta.next().toUpperCase();
		tallas tallaCamisas = Enum.valueOf(tallas.class, a);
		System.out.println("la talla solicitad= " + tallaCamisas);
		System.out.println(tallaCamisas.getAbreviatura());
		
		
	}
}