// Referencias:
//
// Video 061
// Colores

package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class V061_PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciamos la clase. Ya tenemos un marco
		V061_MarcoConColor mimarco = new V061_MarcoConColor();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

// Creamos una clase que hereda de JFrame para el marco
class V061_MarcoConColor extends JFrame {

	public V061_MarcoConColor() {
		setTitle("Prueba de dibujo");
		setSize(400, 400);

		// Crear (instanciar) objeto milamina
		V061_LaminaConColor milamina = new V061_LaminaConColor();
		add(milamina);

		// Color de fondo del sistema operativo
		milamina.setBackground(SystemColor.window);

	}
}

// Creamos una clase que hereda de JPanel para la lámina
class V061_LaminaConColor extends JPanel {

	// Sobreescribimos el método paintComponent
	public void paintComponent(Graphics g) {

		// Invocamos el método de la superclase
		super.paintComponent(g);

		// Ejecutamos nuestras opciones de dibujo

		// Métodos antiguos (más simples)
		// g.drawRect(50, 50, 200, 200);
		// g.drawLine(100, 100, 200, 300);
		// g.drawArc(50, 100, 100, 200, 120, 150);
		// g.drawString("Estamos aprendiendo swing.", 100, 100);

		// Clases 2D (más modernas)
		Graphics2D g2 = (Graphics2D) g;

		// Principio de sustitución.
		// Rectangle2D es abstracta
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);

		// g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);

		// Principio de sustitución.
		// Ellipse2D es abstracta
		// La elipse se circunscribe a un rectángulo
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		// g2.setPaint(Color.BLUE);
		// g2.setPaint(new Color(0, 140, 255));
		// g2.setPaint(new Color(0, 140, 255).brighter().brighter());
		Color micolor = new Color(125, 189, 200);
		g2.setPaint(micolor);
		// g2.draw(elipse);
		g2.fill(elipse);

	}
}