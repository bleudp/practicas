// Referencias:
//
// Vídeo 50
// Interfaces

package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class V050_POO_Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V050_Jefatura jefe_RRHH = new V050_Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);

		V050_Empleado[] mis_empleados = new V050_Empleado[6];

		mis_empleados[0] = new V050_Empleado("Ana", 3000, 2000, 07, 07);
		mis_empleados[1] = new V050_Empleado("Carlos", 50000, 1995, 06, 15);
		mis_empleados[2] = new V050_Empleado("Paco", 25000, 2005, 9, 25);
		mis_empleados[3] = new V050_Empleado("Antonio", 47000, 2009, 11, 9);
		mis_empleados[4] = jefe_RRHH; // Polimorfismo en acción. Principio de
										// sustitución
		mis_empleados[5] = new V050_Jefatura("María", 95000, 1999, 5, 26);
		V050_Jefatura jefa_Finanzas = (V050_Jefatura) mis_empleados[5];

		jefa_Finanzas.estableceIncentivo(95000);

		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más vacaciones a todos los empleados"));
		System.out.println();

		V050_Empleado director_comercial = new V050_Jefatura("Sandra", 85000, 2012, 05, 05);

		// Se puede instanciar la interfaz:
		Comparable ejemplo = new V050_Empleado("Elisabeth", 95000, 2011, 06, 07);

		// Con instanceof se averigua si un objeto es instancia de una clase.
		if (director_comercial instanceof V050_Jefatura) {
			System.out.println("director_comercial es instancia de V050_Jefatura");
			;
		}
		// También si es instancia de una interfaz.
		if (ejemplo instanceof V050_Empleado) {
			System.out.println("ejemplo es instancia de V050_Empleado");
			;
		}
		System.out.println();

		// Recorrer el array con bucle for-each
		for (V050_Empleado e : mis_empleados) {
			e.subeSueldo(5);
		}

		// Requiere implementar la interfaz Comparable
		Arrays.sort(mis_empleados);

		for (V050_Empleado e : mis_empleados) {
			System.out.println("Nombre: " + e.dameNombre() + "\t" + "Id: " + e.dameId() + "\t" + "Sueldo: "
					+ e.dameSueldo() + "\t" + "Fecha de alta: " + e.dameFechaContrato());
		}
		System.out.println();

	}

}

class V050_Empleado implements Comparable {

	public V050_Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();

		++idSiguiente;
		id = idSiguiente;

	}

	// Segundo método constructor. Sin parámetros "sueldo" ni "fecha alta"
	public V050_Empleado(String nom) {

		// Llama a otro constructor
		this(nom, 30000, 2001, 01, 01);
	}

	// Tercer constructor. Sin parámetro "sueldo"
	public V050_Empleado(String nom, int agno, int mes, int dia) {

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

	// Método compareTo requerido por la interfaz Array.Sort
	public int compareTo(Object miObjeto) {
		V050_Empleado otroEmpleado = (V050_Empleado) miObjeto;
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

	// Variables declaradas al final de la clase.
	// Es lo mismo que declararlas al prncipio.
	private String nombre; // Objeto de clase String
	private double sueldo; // Tipo de datos primitivo double
	private Date altaContrato; // Objeto de clase Date
	private String dpt;

	private int id;
	private static int idSiguiente = 0;

}

// final para que no se puda extender esta clase
final class V050_Jefatura extends V050_Empleado implements V050_Jefes {

	public V050_Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}

	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión " + decision + ".";
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
