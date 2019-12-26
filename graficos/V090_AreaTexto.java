// Referencias:
//
// Vídeo V090 - Areas de Texto
// Clase TextArea

package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V090_AreaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V090_MarcoArea V090_MarcoArea = new V090_MarcoArea();
		V090_MarcoArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// V090_MarcoArea.setVisible(true);

	}
}

class V090_MarcoArea extends JFrame {

	public V090_MarcoArea() {

		setBounds(400, 300, 550, 400);

		V090_LaminaArea miV090_LaminaArea = new V090_LaminaArea();
		add(miV090_LaminaArea);
		setVisible(true);

	}
}

class V090_LaminaArea extends JPanel {

	public V090_LaminaArea() {

		miarea = new JTextArea(8, 20);

		// Para poder tener barras de desplazamiento hay que utilizar otra
		// lámina de clase JScrollPane
		JScrollPane laminabarras = new JScrollPane(miarea);
		miarea.setLineWrap(true);
		add(laminabarras);

		JButton miboton = new JButton("Dale");
		miboton.addActionListener(new GestionarArea());
		add(miboton);

	}

	private class GestionarArea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}

	}

	private JTextArea miarea;
}
