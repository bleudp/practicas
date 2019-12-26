// Referencias:
//
// Video 082
// BorderLayout
// Layout en el Frame

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V082_Layouts_II {

	// Para pruebas con distintas clases de layout
	public static final int FLOWLAYOUT = 1;
	public static final int BORDERLAYOUT = 2;
	public static final int GRIDLAYOUT = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V082_Marco_Layout marco = new V082_Marco_Layout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}
}

class V082_Marco_Layout extends JFrame {

	int clase_layout = V082_Layouts_II.FLOWLAYOUT;

	public V082_Marco_Layout() {

		setTitle("Prueba Layout");
		setBounds(600, 350, 600, 300);

		V082_Panel_Layout lamina = new V082_Panel_Layout(clase_layout);
		// FlowLayout disposicion = new FlowLayout(FlowLayout.RIGHT);

		add(lamina, BorderLayout.NORTH);

		V082_Panel_Layout2 lamina2 = new V082_Panel_Layout2();
		add(lamina2, BorderLayout.SOUTH);

	}
}

class V082_Panel_Layout extends JPanel {

	JButton boton_cerrar;

	public V082_Panel_Layout(int clase_layout) {
		if (clase_layout == V082_Layouts_II.FLOWLAYOUT) {
			setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
			add(new JButton("Amarillo"));
			add(new JButton("Rojo"));
			add(new JButton("Azul"));
		}
		if (clase_layout == V082_Layouts_II.BORDERLAYOUT) {
			// setLayout(new BorderLayout());
			setLayout(new BorderLayout(20, 20));
			add(new JButton("Amarillo"), BorderLayout.NORTH);
			add(new JButton("Rojo"), BorderLayout.SOUTH);
		}
	}
}

class V082_Panel_Layout2 extends JPanel {
	public V082_Panel_Layout2() {
		setLayout(new BorderLayout(20, 20));
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);

	}
}
