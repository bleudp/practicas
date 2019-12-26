package poo;

public class V028_POO_Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar una clase
		// Renault es un ejemplar de la clase Coche
		V028_POO_Coche Renault = new V028_POO_Coche(); 
		
		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

		// Incorrecto.- No se debería poder modificar una propiedad
		// Se permite al no haberse indicado private en la clase
		Renault.ruedas = 3;
		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
	}

}
