// Referencias:
//
// Video 089
// Campo Password: JPasswordField

package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class V089_CampoPassword {

	static boolean debug=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// debug = true;

		V089_MarcoPassword marco = new V089_MarcoPassword();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V089_MarcoPassword extends JFrame {

	public V089_MarcoPassword() {

		setBounds(400, 300, 550, 400);

		V089_LaminaPassword milamina = new V089_LaminaPassword();
		add(milamina);
		setVisible(true);

	}
}

class V089_LaminaPassword extends JPanel {

	public V089_LaminaPassword() {

		// Lámina tipo BorderLayout
		setLayout(new BorderLayout());

		// Segunda lámina (Grid)
		JPanel lamina_superior = new JPanel();
		lamina_superior.setLayout(new GridLayout(2, 2));
		add(lamina_superior, BorderLayout.NORTH);

		JLabel etiqueta1 = new JLabel("Usuario: ");
		JLabel etiqueta2 = new JLabel("Contraseña: ");
		JTextField c_usuario = new JTextField(15);
		c_contra = new JPasswordField(15);

		Comprueba_pass mievento = new Comprueba_pass();
		c_contra.getDocument().addDocumentListener(mievento);

		// Añadir elementos al GridLayout, de izquierda a derecha
		lamina_superior.add(etiqueta1);
		lamina_superior.add(c_usuario);
		lamina_superior.add(etiqueta2);
		lamina_superior.add(c_contra);

		JButton enviar = new JButton("Enviar");
		add(enviar, BorderLayout.SOUTH);

	}

	private class Comprueba_pass implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			compruebaContra();

		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			compruebaContra();

		}

		private void compruebaContra() {

			char[] contrasena;
			int longitud;

			contrasena = c_contra.getPassword();
			longitud = contrasena.length;

			if (V089_CampoPassword.debug) {
				System.out.println("Longitud: " + longitud);
			}

			if (longitud < 8 || longitud > 12) {
				c_contra.setBackground(Color.RED);
			} else {
				c_contra.setBackground(Color.WHITE);
			}

		}

	}

	JPasswordField c_contra;
}
