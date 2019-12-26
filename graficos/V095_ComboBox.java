// Referencias:
//
// Vídeo 095 - ComboBox
//
// Clase: JComboBox

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class V095_ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCombo marco = new MarcoCombo();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class MarcoCombo extends JFrame {

	public MarcoCombo() {

		setBounds(550, 300, 550, 400);
		setTitle("Prueba ComboBox");

		LaminaCombo milamina = new LaminaCombo();
		add(milamina);

		setVisible(true);

	}
}

class LaminaCombo extends JPanel {

	public LaminaCombo() {

		setLayout(new BorderLayout());

		texto = new JLabel("En un lugar de La Mancha...");

		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		texto.setHorizontalAlignment(JLabel.CENTER);
		add(texto, BorderLayout.CENTER);

		// Lámina para el ComboBox
		JPanel lamina_norte = new JPanel();

		// Prepara el ComboBox
		micombo = new JComboBox();
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		micombo.addItem("DialogInput");

		EventoCombo mievento = new EventoCombo();
		micombo.addActionListener(mievento);
		lamina_norte.add(micombo);

		add(lamina_norte, BorderLayout.NORTH);

	}

	private class EventoCombo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String) micombo.getSelectedItem(), Font.PLAIN, 18));
		}
	}

	private JLabel texto;
	private JComboBox micombo;

}
