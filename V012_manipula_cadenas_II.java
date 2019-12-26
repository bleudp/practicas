
public class V012_manipula_cadenas_II {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo dia para aprender a programar en Java";
		System.out.println("Frase: " + frase);

		System.out.println("Prueba 1 de substring(): ");
		String frase_resumen=frase.substring(1, 3);
		System.out.println("Frase: " + frase_resumen);
		System.out.println();

		System.out.println("Prueba 2 de substring(): ");
		frase_resumen=frase.substring(29, 57);
		System.out.println("Frase: " + frase);
		System.out.println("Frase: " + frase_resumen);
		System.out.println();

	}
}
