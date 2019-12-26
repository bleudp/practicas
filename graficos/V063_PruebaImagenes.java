// Referencias:
//
// Video 062
// Fonts

package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V063_PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V063_MarcoImagen mimarco = new V063_MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class V063_MarcoImagen extends JFrame {

	public V063_MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(50, 50, 1024, 640);

		V063_LaminaConImagen milamina = new V063_LaminaConImagen();
		add(milamina);
	}
}

class V063_LaminaConImagen extends JPanel {

	private Image imagen;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// Se puede instanciar directamente en ImageIO.read
		// File miimagen=new File("src/graficos/car-37749_960_720.png");

		try {
			imagen = ImageIO.read(new File("src/graficos/car-37749_960_720.png"));
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra.");
		}

		g.drawImage(imagen, 5, 5, null);

	}
}