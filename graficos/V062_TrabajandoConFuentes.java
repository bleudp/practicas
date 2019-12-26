// Referencias:
//
// Video 062
// Fonts

package graficos;

import java.awt.*;
import javax.swing.*;

public class V062_TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciamos la clase. Ya tenemos un marco
		V062_MarcoConFuentes mimarco = new V062_MarcoConFuentes();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class V062_MarcoConFuentes extends JFrame {

	public V062_MarcoConFuentes() {
		setTitle("Prueba con fuentes");
		setSize(400, 400);

		// Crear (instanciar) objeto milamina
		V062_LaminaConFuentes milamina = new V062_LaminaConFuentes();
		add(milamina);

		// Establece el color de primer plano para todo lo que se dibuje en la
		// lámina.
		// Solo funciona si no se había utilizado previamente setColor()
		milamina.setForeground(Color.BLUE);

	}
}

class V062_LaminaConFuentes extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		this.setForeground(Color.ORANGE);

		Font mifuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(mifuente);

		g2.setColor(Color.BLUE);
		g2.drawString("Juan", 100, 100);

		g2.setFont(new Font("Palatino", Font.ITALIC, 26));
		g2.setColor(new Color(128, 90, 50).brighter());
		g2.drawString("Pepe", 100, 130);

		this.setForeground(Color.RED);
		g2.drawString("Manolo", 100, 160);

	}
}