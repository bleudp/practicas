// Referencias:
//
// Vídeo 44
// Casting de objetos
//
// final aplicado a clases y a métodos
//
// final en una clase evita que se puedan crear subclases de esta clase
//
// final en un método impide que se sobreescriba el mismo método
// en una subclase.

package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class V044_POO_Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V044_Jefatura jefe_RRHH = new V044_Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);

		V044_Empleado[] mis_empleados = new V044_Empleado[7];
		mis_empleados[0] = new V044_Empleado("Paco Gómez", 85000, 1990, 12, 17);
		mis_empleados[1] = new V044_Empleado("Ana López", 95000, 1995, 06, 02);
		mis_empleados[2] = new V044_Empleado("María Martínez", 105000, 2002, 03, 15);
		// Al pasar solo un parámetro llama al segundo constructor
		mis_empleados[3] = new V044_Empleado("Antonio Fernández");
		mis_empleados[4] = new V044_Empleado("Pepe Márquez", 1992, 6, 7);

		// Polimorfismo. Se pasa un objeto "Jefatura" en vez de un "Empleado"
		// Principio de sustitución
		// Un "jefe" es un "empleado" (Regla "es un...")
		// Al almacenarlo en mis_empleados, no tendrá en el array los métodos de Jefatura
		mis_empleados[5] = jefe_RRHH;

		// Polimorfismo
		// Añade un objeto tipo jefatura en vez de empleado
		mis_empleados[6] = new V044_Jefatura("María", 95000, 1999, 5, 26);

		// Casting de V044_Empleado a V044_Jefatura
		V044_Jefatura jefa_Finanzas = (V044_Jefatura) mis_empleados[6];

		// Si se modifica el objeto jefa_Finanzas afecta a 
		// mis_empleados[6] y viceversa
		jefa_Finanzas.estableceIncentivo(95000);

		// Modificar dpt desde ambos objetos
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameDpt() +
				" mis_empleados[6]: "+ mis_empleados[6].dameDpt());

		jefa_Finanzas.estableceDpt("Administrativo");
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameDpt() +
				" mis_empleados[6]: "+ mis_empleados[6].dameDpt());
		
		mis_empleados[6].estableceDpt("Programador");
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameDpt() +
				" mis_empleados[6]: "+ mis_empleados[6].dameDpt());
		System.out.println();

		// Modificar sueldo desde ambos objetos
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameSueldo() +
				" mis_empleados[6]: "+ mis_empleados[6].dameSueldo());
		
		jefa_Finanzas.subeSueldo(10);
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameSueldo() +
				" mis_empleados[6]: "+ mis_empleados[6].dameSueldo());
		mis_empleados[6].subeSueldo(15);
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameSueldo() +
				" mis_empleados[6]: "+ mis_empleados[6].dameSueldo());
		System.out.println();
		
		// Modificar nombre desde ambos objetos
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameNombre() +
				" mis_empleados[6]: "+ mis_empleados[6].dameNombre());

		jefa_Finanzas.estableceNombre("Luisa");
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameNombre() +
				" mis_empleados[6]: "+ mis_empleados[6].dameNombre());
		mis_empleados[6].estableceNombre("Begoña");
		System.out.println("jefa_Finanzas: " + jefa_Finanzas.dameNombre() +
				" mis_empleados[6]: "+ mis_empleados[6].dameNombre());
		System.out.println();
		
		
		// mis_empleados[3] NO viene de V044_Jefatura, por lo que
		// no se puede hacer casting.
		// No da error de sintaxis pero produce una excepción al compilar
		//
		// Un jefe siempre es un empleado y se puede hacer casting
		// pero un empleado NO siempre es un jefe y por tanto
		// NO se puede hacer el casting
		//
		// Esto provoca una excepción:
		// V044_Jefatura jefe_Compras=(V044_Jefatura) mis_empleados[3];
		
		
		
		//mis_empleados[6].es

		for (int i = 0; i < mis_empleados.length; i++) {
			mis_empleados[i].subeSueldo(5);
		}

		// Enlazado dinámico:
		// Cuando procesa el objeto de clase Jefatura llama al método
		// dameSueldo de la clase V044_Jefatura, en vez del de la clase V044_Empleado
		for (int i = 0; i < mis_empleados.length; i++) {
			System.out.println("Nombre: " + mis_empleados[i].dameNombre() + "\t" +
					"Id: " + mis_empleados[i].dameId() + "\t" +
					"Sueldo: "	+ mis_empleados[i].dameSueldo() + "\t" + 
					"Fecha de alta: " + mis_empleados[i].dameFechaContrato());
		}
		System.out.println();

		
		// Recorrer el array con bucle for-each
		for (V044_Empleado e : mis_empleados) {
			e.subeSueldo(5);
		}

		for (V044_Empleado e : mis_empleados) {
			System.out.println("Nombre: " + e.dameNombre() + "\t" +
					"Id: " + e.dameId() + "\t" +
					"Sueldo: " + e.dameSueldo() + "\t" + 
					"Fecha de alta: " + e.dameFechaContrato());
		}
		System.out.println();

	}

}


class V044_Empleado {

	// Método constructor
	public V044_Empleado(String nom, double sue, int agno, int mes, int dia) {

		id = idSiguiente;
		idSiguiente++;

		nombre = nom;
		sueldo = sue;
		// En la clase GregorianCalendar los meses van del 0 al 11
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		// getTime devuelve en objeto Date
		altaContrato = calendario.getTime();

		dpt = "Becario";

	}

	// Segundo método constructor. Sin parámetros "sueldo" ni "fecha alta"
	public V044_Empleado(String nom) {

		// Llama a otro constructor
		this(nom, 30000, 2001, 01, 01);
	}

	// Tercer constructor. Sin parámetro "sueldo"
	public V044_Empleado(String nom, int agno, int mes, int dia) {

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

	public void estableceDpt(String dpt) { // Setter
		this.dpt = dpt;
	}

	// Con final evitamos que se sobreescriba este método en una subclase
	final public String dameDpt() { // Getter
		return dpt;
	}

	public void estableceNombre(String nombre) { // Setter
		this.nombre = nombre;
	}

	// Variables declaradas al final de la clase.
	// Es lo mismo que declararlas al prncipio.
	private String nombre; // Objeto de clase String
	private double sueldo; // Tipo de datos primitivo double
	private Date altaContrato; // Objeto de clase Date
	private String dpt;

	private int id;
	private static int idSiguiente = 1;

}


// final para que no se puda extender esta clase
final class V044_Jefatura extends V044_Empleado {

	public V044_Jefatura(String nom, double sue, int agno, int mes, int dia) {
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

	// Da error por haber declarado el método dameDpt() como final en la
	// superclase
	// No se puede sobreescribir este método
	// public String dameDpt(){ // Getter
	// return dpt;
	// }

	private double incentivo;

}

// Al haber declarado V044_Jefatura como final
// da error por no poderse ya crear subclases de V044_Jefatura
// class V044_Director extends V044_Jefatura {
//
// public V044_Director(String nom, double sue, int agno, int mes, int dia) {
// super(nom, sue, agno, mes, dia);
// }
// }
