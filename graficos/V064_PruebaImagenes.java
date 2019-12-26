// Referencias:
//
// Video 064
// Imágenes

package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V064_PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V064_MarcoImagen mimarco = new V064_MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class V064_MarcoImagen extends JFrame {

	public V064_MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(50, 50, 1024, 640);

		V064_LaminaConImagen milamina = new V064_LaminaConImagen();
		add(milamina);
	}
}

class V064_LaminaConImagen extends JPanel {

	private Image imagen;

	public V064_LaminaConImagen() {

		try {
			imagen = ImageIO.read(new File("src/recursos/circ.gif"));
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra.");
		}

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// Se puede instanciar directamente en ImageIO.read
		// File miimagen=new File("src/recursos/car-37749_960_720.png");

		// this se refiere a la lámina (observer)
		int anchuraimagen = imagen.getWidth(this);
		int alturaimagen = imagen.getHeight(this);

		g.drawImage(imagen, 0, 0, null);

		// Copiar un área de la imagen
		// g.copyArea(0, 0, 10, 10, 150, 75);

		for (int i = 0; i < 300; i++) {
			for (int j = 0; j < 200; j++) {
				g.copyArea(0, 0, anchuraimagen, alturaimagen, anchuraimagen * i, alturaimagen * j);
			}
		}

	}

}