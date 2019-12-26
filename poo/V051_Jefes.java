package poo;

// Se pueden heredar las interfaces, del mismo modo que las clases
// En este caso, obligatoriamente hay que desarrollar los métodos 
// heredados además de los propios donde se use la interfaz.

// En este caso, V051_Jefes hereda de V051_Trabajadores, por lo que
// donde se use la interfaz V051_Jefes habrá que desarrollar tanto
// los métodos de V051_Jefes como los de V051_Trabajadores.

public interface V051_Jefes extends V051_Trabajadores{

	// Se puede omitir "public abstract" ya que se asumen por omisión
	// Se declara el métido pero no se implementa. Eso se hace en cada clase.
	public abstract String V051_tomar_decisiones(String decision);
}
