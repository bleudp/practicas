// Referencias:
//
// Video 081
// Layout en JPanel
// Clase FlowLayout (layout por defecto)

package graficos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V081_Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V081_Marco_Layout marco = new V081_Marco_Layout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class V081_Marco_Layout extends JFrame {

	public V081_Marco_Layout() {

		setTitle("Prueba Layout");
		setBounds(600, 350, 600, 300);
		Panel_Layout lamina = new Panel_Layout();

		// FlowLayout disposicion = new FlowLayout(FlowLayout.RIGHT);
		lamina.setLayout(new FlowLayout(FlowLayout.CENTER));

		add(lamina);
	}
}

class Panel_Layout extends JPanel {

	JButton boton_cerrar;

	public Panel_Layout() {
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		add(new JButton("Azul"));
	}
}
