// Referencias:
//
// Vídeo 42:
// Diseño de herencia
// Sobreescribir métodos
// super. para indicar que el método llamado sea el de la superclase
// 
// Vídeo 43:
// Polimorfismo
// Enlazado dinámico

package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class V042_POO_Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V042_Jefatura jefe_RRHH = new V042_Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);

		V042_Empleado[] mis_empleados = new V042_Empleado[7];
		mis_empleados[0] = new V042_Empleado("Paco Gómez", 85000, 1990, 12, 17);
		mis_empleados[1] = new V042_Empleado("Ana López", 95000, 1995, 06, 02);
		mis_empleados[2] = new V042_Empleado("María Martínez", 105000, 2002, 03, 15);
		// Al pasar solo un parámetro llama al segundo constructor
		mis_empleados[3] = new V042_Empleado("Antonio Fernández");
		mis_empleados[4] = new V042_Empleado("Pepe Márquez", 1992, 6, 7);

		// Polimorfismo. Se pasa un objeto "V042_Jefatura" en vez de un "Empleado"
		// Principio de sustitución
		// Un "jefe" es un "empleado" (Regla "es un...")
		mis_empleados[5] = jefe_RRHH;

		// Polimorfismo
		// Añade un objeto tipo V042_Jefatura en vez de empleado
		mis_empleados[6] = new V042_Jefatura("María", 95000, 1999, 5, 26);

		for (int i = 0; i < mis_empleados.length; i++) {
			mis_empleados[i].subeSueldo(5);
		}

		// Enlazado dinámico:
		// Cuando procesa el objeto de clase V042_Jefatura llama al método
		// dameSueldo de la clase V042_Jefatura, en vez del de la clase V042_Empleado
		for (int i = 0; i < mis_empleados.length; i++) {
			System.out.println("Nombre: " + mis_empleados[i].dameNombre() + "\t" +
					"Id: " + mis_empleados[i].dameId() + "\t" +
					"Sueldo: "	+ mis_empleados[i].dameSueldo() + "\t" + 
					"Fecha de alta: " + mis_empleados[i].dameFechaContrato());
		}
		System.out.println();

		// Con bucle for-each
		for (V042_Empleado e : mis_empleados) {
			e.subeSueldo(5);
		}

		for (V042_Empleado e : mis_empleados) {
			System.out.println("Nombre: " + e.dameNombre() + "\t" +
					"Id: " + e.dameId() + "\t" +
					"Sueldo: " + e.dameSueldo() + "\t" + 
					"Fecha de alta: " + e.dameFechaContrato());
		}
		System.out.println();

	}

}

class V042_Empleado {

	// Método constructor
	public V042_Empleado(String nom, double sue, int agno, int mes, int dia) {

		id = idSiguiente;
		idSiguiente++;
		
		nombre = nom;
		sueldo = sue;
		// En la clase GregorianCalendar los meses van del 0 al 11
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		// getTime devuelve en objeto Date
		altaContrato = calendario.getTime();
	}

	// Segundo método constructor. Sin parámetros "sueldo" ni "fecha alta"
	public V042_Empleado(String nom) {

		// Llama a otro constructor
		this(nom, 30000, 2001, 01, 01);
	}

	// Tercer constructor. Sin parámetro "sueldo"
	public V042_Empleado(String nom, int agno, int mes, int dia) {

		// Llama a otro constructor
		this(nom, 30000, agno, mes, dia);
	}

	public String dameNombre() { // Getter
		return nombre;
	}

	public double dameSueldo() { // Getter
		return sueldo;
	}

	public Date dameFechaContrato() { // Getter
		return altaContrato;
	}

	public int dameId() { // Getter
		return id;
	}

	public void subeSueldo(double porcentaje) { // Setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	// Variables declaradas al final de la clase.
	// Es lo mismo que declararlas al prncipio.
	private String nombre; // Objeto de clase String
	private double sueldo; // Tipo de datos primitivo double
	private Date altaContrato; // Objeto de clase Date

	private int id;
	private static int idSiguiente = 1;

}

class V042_Jefatura extends V042_Empleado {

	public V042_Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}

	public void estableceIncentivo(double b) { // setter
		incentivo = b;
	}

	// sobreescribir el método de la cuperclase
	public double dameSueldo() { // getter
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;
	}

	private double incentivo;

}
