package Poo;
//interfaz creada en base al video 51 de pildoras Informaticas
public interface Trabajadores {
	
	double EstableceBonus(double BonusSueldo); /*colocamos un metodo para que todos los trabajadores heredeb de esta interfaz obligatoriamente tengan
	un metodo que tenga un Bonus */

	 double BonusMinimo = 1500;/* esto es una constante para que cualquier Bonificacion tenga como minimo el monto indicado
	 la variable que es constante es estatica, por ese motivo esta en cursivas. Da igual si esa variable la colocamos el modificador de accseso "public"
	 "abstract" o "Static" porque ya la interfaz lo toma como por defecto*/
}
