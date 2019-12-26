// Referencias:
//
// Video 059
// Crear lámina para dibujar en ella, no en el Frame
// Añadir la lámina al Frame
// Utilizar la clase Graphics

package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class V059_PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciamos la clase. Ya tenemos un marco
		MarcoConDibujos mimarco = new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

// Creamos una clase que hereda de JFrame para el marco
class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {
		setTitle("Prueba de dibujo");
		setSize(400, 400);

		// Crear (instanciar) objeto milamina
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);

	}
}

// Creamos una clase que hereda de JPanel para la lámina
class LaminaConFiguras extends JPanel {

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
		g2.draw(rectangulo);

		// Principio de sustitución.
		// Ellipse2D es abstracta
		// La elipse se circunscribe a un rectángulo
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);

		// Dibuja una línea instanciada en la propia llamada draw
		g2.draw(new Line2D.Double(100, 100, 300, 250));

		double CentroenX = rectangulo.getCenterX();
		double CentroenY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX + radio, CentroenY + radio);
		g2.draw(circulo);
	}
}