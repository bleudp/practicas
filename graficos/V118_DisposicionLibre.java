// Referencias:
//
// Vídeo 118 - Disposición libre
//
// setLayout(null)

package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V118_DisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V118_MarcoLibre marco = new V118_MarcoLibre();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V118_MarcoLibre extends JFrame {

	public V118_MarcoLibre() {

		setBounds(400, 300, 800, 600);
		setTitle("Disposición Libre");

		V118_LaminaLibre milamina = new V118_LaminaLibre();

		add(milamina);

		setVisible(true);

	}
}

class V118_LaminaLibre extends JPanel {

	JButton boton1;

	public V118_LaminaLibre() {

		int x, y, w, h;

		setLayout(null);

		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellidos = new JLabel("Apellidos: ");
		JTextField c_nombre = new JTextField();
		JTextField c_apellidos = new JTextField();

		y = 20;
		x = 25;
		nombre.setBounds(x, y, 80, 20);
		c_nombre.setBounds(x + 60, y, 100, 20);
		y += 25;
		apellidos.setBounds(x, y, 80, 20);
		c_apellidos.setBounds(x + 60, y, 100, 20);

		add(nombre);
		add(apellidos);
		add(c_nombre);
		add(c_apellidos);

		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");

		y = 100;
		x = 25;
		w = 90;
		h = 25;
		boton1.setSize((int) w / 2, (int) h / 2);
		boton1.setLocation(x * 10, y);
		boton1.setBounds(x, y, w, h);
		boton2.setBounds(x + boton1.getWidth() + 5, y, w, h);

		add(boton1);
		add(boton2);
		w = boton1.getWidth();
		h = boton1.getHeight();

	}
}
