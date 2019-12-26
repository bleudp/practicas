
public class V011_manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="José Luis";
		System.out.println("Mi nombre es " + nombre + ".");
		System.out.println();
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println();

		System.out.println("La primera letra de '" + nombre + "'es " + nombre.charAt(0) + ".");
		System.out.println();
		
		System.out.println("La última letra de '" + nombre + "'es " + nombre.charAt(nombre.length()-1) + ".");

	}

}
