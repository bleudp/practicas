
public class V009_Calculos_con_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor;
		double raiz;
		float num1_float;
		int res_int;
		double num1_double;
		long res_long;
		double base;
		double exponente;
		double res_double;
		
		System.out.println("Operaciones con la clase Math:");
		System.out.println();

		// Raiz cuadrada (sqrt)
		valor = 9.0;
		raiz = Math.sqrt(valor);
		System.out.println("Raiz de " + valor + " = " + raiz);
		System.out.println();

		// Redondeo (round)
		System.out.println("Distintas opciones de redondeo con 'round'");
		num1_float=5.85F;
		res_int=Math.round(num1_float);
		System.out.println("Redondear float a int: de " + num1_float + " = " + res_int);
		
		num1_double=5.85;
		res_long=Math.round(num1_double);
		System.out.println("Redondear double a long: de " + num1_double + " = " + res_long);
		
		// Forzar cambio de tipo (refundición)
		num1_double=5.85;
		res_int=(int)Math.round(num1_double);
		System.out.println("Redondear double con resultado forzado a int: de " + num1_double + " = " + res_int);
		System.out.println();
		
		
		// Potencia (pow)
		System.out.println("Potencia:");
		base=5;
		exponente=3;
		res_double=Math.pow(base, exponente);
		System.out.println(base + " elevado a " + exponente + " = " + res_double);
		
		// Forzando cambio de tipo a int (cast)
		res_int=(int)Math.pow(base, exponente);
		System.out.println(base + " elevado a " + exponente + " (resultado forzado a int)" + " = " + res_int);
		System.out.println();
		
	}

}
