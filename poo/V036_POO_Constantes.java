// Referencias:
//
// Vídeos 36 y 37:
// Constantes (palabra clave "final")
// Variables static
//
// Vídeo 38
// Métodos static

package poo;

public class V036_POO_Constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("María");

		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		System.out.println();

		trabajador1.cambiaSeccion("Recursos Humanos");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		System.out.println();

		// trabajador1.cambiaNombre("María");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		System.out.println();

		// trabajador1.cambiaNombre("María");
		System.out.println(trabajador1.devuelveDatos());
		// Se utiliza la variable static id con el nombre de la clase.
		// Esto no la asigna a cada instancia.
		// Empleados.id++;
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		System.out.println();

		System.out.println(Empleados.dameidSiguiente());

	}

}

class Empleados {

	public Empleados(String nom) { // Constructor
		nombre = nom;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}

	public void cambiaSeccion(String seccion) { // setter
		this.seccion = seccion;
	}

	public String devuelveDatos() { // getter
		return "El nombre es " + nombre + " y la sección es " + seccion + " y el id es " + id + ".";
	}

	// Método estático.
	// No actúa sobre objetos.
	// Pertenece a la clase.
	// Utilización: nombreclase.método()
	public static String dameidSiguiente() {
		return "El id siguiente es " + idSiguiente;
	}

	// Ejemplo de uso de "final"
	// Da fallo al haber indicado que la propiedad "nombre" es "final"
	// Por tanto no es modificable
	//
	// public void cambiaNombre(String nombre) { // setter
	// this.nombre = nombre;
	// }

	// No se podrá modificar el nombre (final)
	private final String nombre;
	private String seccion;

	// static para que la variable se comparta para todos los objetos de esta
	// clase
	// private para mantener la encapsulación. No se manipula la variable desde
	// fuera
	// De este modo se puede autoasignar un contador para cada objeto que se
	// cree.
	private int id;
	private static int idSiguiente = 1;

}