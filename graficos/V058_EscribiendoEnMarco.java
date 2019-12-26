// Referencias:
//
// Video 058
// Crear lámina para dibujar en ella, no en el Frame
// Añadir la lámina al Frame

package graficos;

import javax.swing.*;
import java.awt.*;

public class V058_EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciamos la clase. Ya tenemos un marco
		MarcoConTexto mimarco = new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

// Creamos una clase que hereda de JFrame para el marco
class MarcoConTexto extends JFrame {

	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer Texto");

		// Agregamos la lámina
		V058_Lamina miV058_Lamina = new V058_Lamina();
		add(miV058_Lamina);
	}
}

// Creamos una clase que hereda de JPanel para la lámina
class V058_Lamina extends JPanel {

	// Sobreescribimos el método paintComponent
	public void paintComponent(Graphics g) {

		// Invocamos el método de la superclase
		super.paintComponent(g);

		// Ejecutamos nuestras opciones de dibujo
		g.drawString("Estamos aprendiendo swing.", 100, 100);

	}
}