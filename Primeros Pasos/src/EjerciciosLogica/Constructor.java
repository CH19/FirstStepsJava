package EjerciciosLogica;

import java.util.stream.IntStream;

public class Constructor {
  String nombre;
  String Apellido;
	//tomamos como ejemplo que la clase se llamaria "persona"
/**
 * @param nombre
 * @param apellido
 */
public Constructor(String nombre, String apellido) {
	super();
	this.nombre = nombre;
	Apellido = apellido;
 }
public String getNombre() {
	return nombre;
 }

@Override
public String toString() {
	return "Constructor [nombre=" + nombre + ", Apellido=" + Apellido + "]";
}
public IntStream chars() {
	return Apellido.chars();
}
public void setNombre(String nombre) {
	this.nombre = nombre;
 }
public String getApellido() {
	return Apellido;
 }
public void setApellido(String apellido) {
	Apellido = apellido;
 }
}


