package poo;

// Hay que importar Clase3 por estar en otro paquete.
import paquetepruebas.V047_Clase3;

public class V047_Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se utiliza el constructor por defecto ya que
		// no se ha declarado ninguno para V047_Clase1
		V047_Clase1 miobj = new V047_Clase1();

		// Se puede acceder a las dos variables int y al método de miobj
		// ya que no se indicó nada en Clase1 y se utiliza el modificador
		// de acceso por defecto. Al estar tanto Clase1 como Clase2 en el 
		// mismo paquete, son visibles.
		//
		// miobj.mivar
		// miobj.mivar2
		// miobj.mimetodo()
		//
		// Si se declara una variable (mivar) como private en Clase1 deja
		// de poderse utilizar aquí

		
		// Creamos un objeto de la Clase3, que hereda de la Clase1
		V047_Clase3 miobj2 = new V047_Clase3();
		
		// Se puede comprobar que miobj2 no trae las variables y el método.
		// Ocurre por haber utilizado el modificador de acceso por defecto:
		//
		// miobj2.

		// Cambiando el modificador en Clase1 a "protected" ya se puede accceder
		// desde subclases de otro paquete.
	}

}
