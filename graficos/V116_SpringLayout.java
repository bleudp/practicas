// Referencias:
//
// Vídeo 116 - SpringLayout
//
// Clase SprintLayout
// Clase Spring
// Método putConstraint(String e1, Component c1, int pad, String e2, Component c2)
// Método static constant(int a, int b, int c) (elasticidad, compresión, rebote)

package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class V116_SpringLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V116_MarcoMuelle marco = new V116_MarcoMuelle();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V116_MarcoMuelle extends JFrame {

	public V116_MarcoMuelle() {

		setBounds(300, 400, 1000, 350);
		setTitle("SpringLayout");

		V116_LaminaMuelle milamina = new V116_LaminaMuelle();
		add(milamina);

		setVisible(true);

	}
}

class V116_LaminaMuelle extends JPanel {

	public V116_LaminaMuelle() {

		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");
		JButton boton3 = new JButton("Botón 3");

		SpringLayout milayout = new SpringLayout();

		setLayout(milayout);

		add(boton1);
		add(boton2);
		add(boton3);

		Spring mimuelle = Spring.constant(0, 10, 100);
//		Spring muelle_rigido = Spring.constant(10);

		milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
		milayout.putConstraint(SpringLayout.WEST, boton2, mimuelle, SpringLayout.EAST, boton1);
		milayout.putConstraint(SpringLayout.WEST, boton3, mimuelle, SpringLayout.EAST, boton2);
		milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);

	}

}
