// Referencias:
//
// Ventanas / Marcos / Frames
// Posicionar ventana
// Cambiar atributos standard ventana
// Centrar ventana en la pantalla
// Toolkit

package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class V057_CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V057_MarcoCentrado mimarco = new V057_MarcoCentrado();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class V057_MarcoCentrado extends JFrame {

	public V057_MarcoCentrado() {

		// Obtiene el sistema de ventanas usado (móvil, PC, etc.)
		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = mipantalla.getScreenSize();

		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;

		setSize(anchoPantalla / 2, alturaPantalla / 2);
		System.out.println(anchoPantalla + " x " + alturaPantalla);

		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		// setSize(500, 300);
		// setLocation(500, 300);
		// setBounds(500, 300, 550, 250);
		// setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Marco Centrado");

		// Admite .png, .gif y .jpg
		Image miIcono = mipantalla.getImage("src/recursos/icono.gif");
		// Añade icono al marco de la ventana
		setIconImage(miIcono);

	}
}
