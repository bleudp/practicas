// Referencias:
//
// Vídeo 120 - Layouts propios
//
// Layouts propios
// Interfaz LayoutManager
//
// Modifica el programa del vídeo 119 para que las parejas
// de componentes aparezcan centrados en el marco

package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V120_DisposicionLibre_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V120_MarcoLibre marco = new V120_MarcoLibre();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V120_MarcoLibre extends JFrame {

	public V120_MarcoLibre() {

		setBounds(400, 300, 800, 600);
		setTitle("Disposición Libre");

		V120_LaminaLibre milamina = new V120_LaminaLibre();

		add(milamina);

		setVisible(true);

	}
}

class V120_LaminaLibre extends JPanel {

	JButton boton1;

	public V120_LaminaLibre() {

		setLayout(new V120_EnColumnas());

		JLabel nombre = new JLabel("Nombre: ");
		JTextField c_nombre = new JTextField();

		JLabel apellidos = new JLabel("Apellidos: ");
		JTextField c_apellidos = new JTextField();

		JLabel edad = new JLabel("Edad: ");
		JTextField c_edad = new JTextField();

		JLabel telefono = new JLabel("Teléfono: ");
		JTextField c_telefono = new JTextField();

		add(nombre);
		add(c_nombre);

		add(apellidos);
		add(c_apellidos);

		add(edad);
		add(c_edad);

		add(telefono);
		add(c_telefono);

		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");

		add(boton1);
		add(boton2);

	}
}

class V120_EnColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub

		x = 20;
		y = 20;

		int d = micontenedor.getWidth(); // Ancho del contenedor
		x = d / 2; // Centro del contendor
		int anchoComponente = 100;
		int contador = 0;

		// Cuantos componentes hay en el contenedor
		int n = micontenedor.getComponentCount();
		
		// Recorre la lista de componentes
		for (int i = 0; i < n; i++) {
			contador++;
			Component c = micontenedor.getComponent(i);
			c.setBounds(x - anchoComponente, y, anchoComponente, 20);

			System.out.println(i + ": " + x + ", " + y);
			
			if (contador % 2 == 0) { // Pares
				x = d / 2;
				y += 40;
			} else {
				x += anchoComponente;
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub

	}

	private int x;
	private int y;

}