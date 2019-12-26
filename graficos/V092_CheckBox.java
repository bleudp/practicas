// Referencias:
//
// Vídeo V092 - CheckBox
// Clase JCheckBox
// Clase Font

package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class V092_CheckBox {

	public static boolean modoDebug = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V092_MarcoCheck V092_MarcoCheck = new V092_MarcoCheck();
		V092_MarcoCheck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		V092_MarcoCheck.setVisible(true);

	}
}

class V092_MarcoCheck extends JFrame {

	public V092_MarcoCheck() {

		setTitle("Prueba CheckBox");
		setBounds(550, 300, 550, 550);

		LaminaCheck milamina = new LaminaCheck();

		add(milamina);

		// setVisible(true);

	}
}

class LaminaCheck extends JPanel {
	public LaminaCheck() {

		setLayout(new BorderLayout());

		texto = new JLabel("En un lugar de La Mancha de cuyo nombre...");
		miletra = new Font("Serif", Font.PLAIN, 24);
		texto.setFont(miletra);

		JPanel laminaTexto = new JPanel();
		laminaTexto.add(texto);
		laminaTexto.setBackground(Color.YELLOW);
		add(laminaTexto, BorderLayout.CENTER);

		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");

		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());

		JPanel laminachecks = new JPanel();
		laminachecks.add(check1);
		laminachecks.add(check2);

		laminachecks.setBackground(Color.BLUE);
		add(laminachecks, BorderLayout.SOUTH);

	}

	private JLabel texto;
	private JCheckBox check1, check2;
	private Font miletra;

	class ManejaChecks implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			int tipo = Font.PLAIN;

			if (check1.isSelected())
				tipo += Font.BOLD;
			if (check2.isSelected())
				tipo += Font.ITALIC;

			miletra = new Font(miletra.getFamily(), tipo, miletra.getSize());

			if (V092_CheckBox.modoDebug) {
				System.out.println("Name:       " + miletra.getName());
				System.out.println("FontName:   " + miletra.getFontName());
				System.out.println("FontFamily: " + miletra.getFamily());
				System.out.println("Style:      " + miletra.getStyle());
				System.out.println("Size:       " + miletra.getSize());
				System.out.println("Tipo:       " + tipo);
			}
			texto.setFont(miletra);

		}

	}
}