// Referencias:
//
// Video 088
// DocumentListener
// changedUpdate()
// removeUpdate()

package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class V088_PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V088_MarcoTexto marco = new V088_MarcoTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V088_MarcoTexto extends JFrame {

	public V088_MarcoTexto() {

		setBounds(500, 300, 500, 350);

		V088_LaminaPrueba milamina = new V088_LaminaPrueba();
		add(milamina);
		setVisible(true);

	}
}

class V088_LaminaPrueba extends JPanel {

	public V088_LaminaPrueba() {
		JTextField micampo = new JTextField(20);

		V088_EscuchaTexto el_evento = new V088_EscuchaTexto();
		Document midoc = micampo.getDocument();
		midoc.addDocumentListener(el_evento);
		add(micampo);
	}

	private class V088_EscuchaTexto implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
		}

	}
}
