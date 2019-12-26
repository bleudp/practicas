// Referencias:
//
// Vídeo 49
// Interfaces
// Comparar arrays

package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class V049_POO_Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V049_Jefatura jefe_RRHH = new V049_Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);

		V049_Empleado[] mis_empleados = new V049_Empleado[6];

		mis_empleados[0] = new V049_Empleado("Ana", 3000, 2000, 07, 07);
		mis_empleados[1] = new V049_Empleado("Carlos", 50000, 1995, 06, 15);
		mis_empleados[2] = new V049_Empleado("Paco", 25000, 2005, 9, 25);
		mis_empleados[3] = new V049_Empleado("Antonio", 47000, 2009, 11, 9);
		mis_empleados[4] = jefe_RRHH; // Polimorfismo en acción. Principio de
										// sustitución
		mis_empleados[5] = new V049_Jefatura("María", 95000, 1999, 5, 26);
		V049_Jefatura jefa_Finanzas = (V049_Jefatura) mis_empleados[5];

		jefa_Finanzas.estableceIncentivo(95000);

		// Recorrer el array con bucle for-each
		for (V049_Empleado e : mis_empleados) {
			e.subeSueldo(5);
		}

		// Requiere implementar la interfaz Comparable
		Arrays.sort(mis_empleados);

		for (V049_Empleado e : mis_empleados) {
			System.out.println("Nombre: " + e.dameNombre() + "\t" + "Id: " + e.dameId() + "\t" + "Sueldo: "
					+ e.dameSueldo() + "\t" + "Fecha de alta: " + e.dameFechaContrato());
		}
		System.out.println();

	}

}

class V049_Empleado implements Comparable {

	public V049_Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();

		++idSiguiente;
		id = idSiguiente;

	}

	// Segundo método constructor. Sin parámetros "sueldo" ni "fecha alta"
	public V049_Empleado(String nom) {

		// Llama a otro constructor
		this(nom, 30000, 2001, 01, 01);
	}

	// Tercer constructor. Sin parámetro "sueldo"
	public V049_Empleado(String nom, int agno, int mes, int dia) {

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
		V049_Empleado otroEmpleado = (V049_Empleado) miObjeto;
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
final class V049_Jefatura extends V049_Empleado {

	public V049_Jefatura(String nom, double sue, int agno, int mes, int dia) {
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
