//Referencias:
//
//Vídeo39:
//Sobrecarga de constructores
//this(parámetros) para llamar a otro constructor coincidente con los parámetros

package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class V039_POO_Sobrecarga_Constructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado2[] mis_empleados = new Empleado2[5];
		mis_empleados[0] = new Empleado2("Paco Gómez", 85000, 1990, 12, 17);
		mis_empleados[1] = new Empleado2("Ana López", 95000, 1995, 06, 02);
		mis_empleados[2] = new Empleado2("María Martínez", 105000, 2002, 03, 15);
		// Al pasar solo un parámetro llama al segundo constructor
		mis_empleados[3] = new Empleado2("Antonio Fernández");
		mis_empleados[4] = new Empleado2("Pepe Márquez", 1992, 6, 7);

		for (int i = 0; i < mis_empleados.length; i++) {
			mis_empleados[i].subeSueldo(5);
		}

		for (int i = 0; i < mis_empleados.length; i++) {
			System.out.println("Nombre: " + mis_empleados[i].dameNombre() + " Sueldo: " + mis_empleados[i].dameSueldo()
					+ " Fecha de alta: " + mis_empleados[i].dameFechaContrato());
		}
		System.out.println();

		// Con bucle for-each
		for (Empleado2 e : mis_empleados) {
			e.subeSueldo(5);
		}

		for (Empleado2 e : mis_empleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: "
					+ e.dameFechaContrato());
		}
		System.out.println();

	}

}

class Empleado2 {

	// Método constructor
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		// En la clase GregorianCalendar los meses van del 0 al 11
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		// getTime devuelve en objeto Date
		altaContrato = calendario.getTime();
	}

	// Segundo método constructor. Sin parámetros "sueldo" ni "fecha alta"
	public Empleado2(String nom) {

		// Llama a otro constructor
		this(nom, 30000, 2001, 01, 01);
	}

	// Tercer constructor. Sin parámetro "sueldo"
	public Empleado2(String nom, int agno, int mes, int dia) {

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
