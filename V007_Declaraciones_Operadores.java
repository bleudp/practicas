
public class V007_Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operaciones con enteros:");
		
		int a=5;
		int b;
		b=7;
		int c=b+a;
		System.out.println(c);

		c++;
		System.out.println(c);

		c+=6;
		System.out.println(c);

		c-=6;
		System.out.println(c);
		
		System.out.println(" ");
		
		// Para decimales
		System.out.println("Operaciones con decimales:");
		
		double da=5;
		double db;
		db=7;
		double dc=db/da;
		System.out.println(dc);

		da=5;
		db=10;
			dc=db/da;
		System.out.println(dc);

		System.out.println(" ");
		
		// Constantes
		System.out.println("Constantes:");
		c=5;
		System.out.println(c);
		c=7;
		System.out.println(c);

		final int cc=5;
		// No se permite cambiar el valor a una constante
		// cc=8;
		System.out.println(cc);

		final double apulgadas=2.54;
		double cm=6;
		double resultado=cm/apulgadas;
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");
		
		System.out.println(" ");
		
		// Declaración múltiple
		int operador1,operador2,operador3;
		operador1=8;
		operador2=7;
		operador3=operador1+operador2;
		System.out.println(operador3);


	}

}
