// Referencias:
//
// Video 086 y 087
// JTextField
// Distribuir elementos en dos láminas con distinto layout

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V086_PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V086_MarcoTexto marco = new V086_MarcoTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V086_MarcoTexto extends JFrame {

	public V086_MarcoTexto() {

		setBounds(600, 300, 600, 350);

		V086_LaminaTexto milamina = new V086_LaminaTexto();
		add(milamina);
		setVisible(true);

	}
}

class V086_LaminaTexto extends JPanel {

	public V086_LaminaTexto() {

		setLayout(new BorderLayout());

		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());

		resultado = new JLabel("", JLabel.CENTER);

		JLabel texto1 = new JLabel("Email: ");
		milamina2.add(texto1);

		campo1 = new JTextField(20);
		milamina2.add(campo1);

		add(resultado, BorderLayout.CENTER);

		JButton miboton = new JButton("Comprobar");
		DameTexto mievento = new DameTexto();
		miboton.addActionListener(mievento);
		milamina2.add(miboton);

		add(milamina2, BorderLayout.NORTH);
	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(campo1.getText().trim());
			int correcto = 0;
			String email = campo1.getText().trim();
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					correcto++;
				}

			}
			if (correcto != 1) {
				resultado.setText("Incorrecto");
			} else {
				resultado.setText("Correcto");
			}
		}

	}

	private JTextField campo1;
	private JLabel resultado;
}
