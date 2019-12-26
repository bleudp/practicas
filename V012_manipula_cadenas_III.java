
public class V012_manipula_cadenas_III {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		String alumno1, alumno2;
		alumno1="David";
		alumno2="David";
		System.out.println("Prueba de equals(): " + alumno1.equals(alumno2));
		System.out.println();
		
		alumno2="david";
		System.out.println("Prueba de equals(): " + alumno1.equals(alumno2));
		System.out.println("Prueba de equalsIgnoreCase(): " + alumno1.equalsIgnoreCase(alumno2));

	}
}
