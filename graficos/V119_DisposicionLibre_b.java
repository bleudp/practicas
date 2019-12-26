// Referencias:
//
// Vídeo 119 - Disposición libre
//
// Layouts propios
// Interfaz LayoutManager

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

public class V119_DisposicionLibre_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V119_MarcoLibre marco = new V119_MarcoLibre();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V119_MarcoLibre extends JFrame {

	public V119_MarcoLibre() {

		setBounds(400, 300, 800, 600);
		setTitle("Disposición Libre");

		V119_LaminaLibre milamina = new V119_LaminaLibre();

		add(milamina);

		setVisible(true);

	}
}

class V119_LaminaLibre extends JPanel {

	JButton boton1;

	public V119_LaminaLibre() {

		// int x, y, w, h;

		setLayout(new V119_EnColumnas());

		JLabel nombre = new JLabel("Nombre: ");
		JTextField c_nombre = new JTextField();

		JLabel apellidos = new JLabel("Apellidos: ");
		JTextField c_apellidos = new JTextField();

		JLabel edad = new JLabel("Edad: ");
		JTextField c_edad = new JTextField();

		// y = 20;
		// x = 25;
		// nombre.setBounds(x, y, 80, 20);
		// c_nombre.setBounds(x + 60, y, 100, 20);
		// y += 25;
		// apellidos.setBounds(x, y, 80, 20);
		// c_apellidos.setBounds(x + 60, y, 100, 20);

		add(nombre);
		add(c_nombre);

		add(apellidos);
		add(c_apellidos);

		add(edad);
		add(c_edad);

		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");

		// y = 100;
		// x = 25;
		// w = 90;
		// h = 25;
		// boton1.setSize((int) w / 2, (int) h / 2);
		// boton1.setLocation(x * 10, y);
		// boton1.setBounds(x, y, w, h);
		// boton2.setBounds(x + boton1.getWidth() + 5, y, w, h);

		add(boton1);
		add(boton2);

	}
}

class V119_EnColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub

		int contador = 0;

		x = 20;
		y = 20;

		// Cuantos componentes hemos agregado
		int n = micontenedor.getComponentCount();
		// Recorre la lista de componentes agregados
		for (int i = 0; i < n; i++) {
			contador++;
			Component c = micontenedor.getComponent(i);
			c.setBounds(x, y, 100, 20);
			if (contador % 2 == 0) { // Pares
				x = 20;
				y += 40;
			} else {
				x += 100;
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