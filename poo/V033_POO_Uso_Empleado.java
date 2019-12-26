package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class V033_POO_Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		 * Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
		 * Empleado empleado3 = new Empleado("María Martínez", 105000, 2002, 03,
		 * 15);
		 * 
		 * empleado1.subeSueldo(5); empleado2.subeSueldo(5);
		 * empleado3.subeSueldo(5);
		 * 
		 * System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: "
		 * + empleado1.dameSueldo() + " Fecha de alta: " +
		 * empleado1.dameFechaContrato()); System.out.println("Nombre: " +
		 * empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() +
		 * " Fecha de alta: " + empleado2.dameFechaContrato());
		 * System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: "
		 * + empleado3.dameSueldo() + " Fecha de alta: " +
		 * empleado3.dameFechaContrato());
		 */

		Empleado[] mis_empleados = new Empleado[3];
		mis_empleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		mis_empleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		mis_empleados[2] = new Empleado("María Martínez", 105000, 2002, 03, 15);

		for (int i = 0; i < mis_empleados.length; i++) {
			mis_empleados[i].subeSueldo(5);
		}

		for (int i = 0; i < mis_empleados.length; i++) {
			System.out.println("Nombre: " + mis_empleados[i].dameNombre() + " Sueldo: " + mis_empleados[i].dameSueldo()
					+ " Fecha de alta: " + mis_empleados[i].dameFechaContrato());
		}
		System.out.println();

		// Con bucle for-each
		for (Empleado e : mis_empleados) {
			e.subeSueldo(5);
		}

		for (Empleado e : mis_empleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: "
					+ e.dameFechaContrato());
		}
		System.out.println();

	}

}

class Empleado {

	// Método constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		// En la clase GregorianCalendar los meses van del 0 al 11
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		// getTime devuelve en objeto Date
		altaContrato = calendario.getTime();
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

	public void subeSueldo(double porcentaje) { // Setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	// Variables declaradas al final de la clase.
	// Es lo mismo que declararlas al prncipio.
	private String nombre; // Objeto de clase String
	private double sueldo; // Tipo de datos primitivo double
	private Date altaContrato; // Objeto de clase Date
}