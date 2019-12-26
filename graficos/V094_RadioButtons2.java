// Referencias:
//
// Vídeo V094 - Radio Buttons
//
// Clase JRadioButton (cada uno de los botones)
// Clase ButtonGroup (el grupo)

package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class V094_RadioButtons2 {

	public static boolean modoDebug = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V094_Marco V094_Marco = new V094_Marco();
		V094_Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class V094_Marco extends JFrame {

	public V094_Marco() {

		setTitle("Prueba RadioButton");
		setBounds(550, 300, 500, 300);

		V094_Lamina milamina = new V094_Lamina();

		add(milamina);

		setVisible(true);

	}
}

class V094_Lamina extends JPanel {
	public V094_Lamina() {

		setLayout(new BorderLayout());
		setBackground(Color.CYAN);
		texto = new JLabel("En un lugar de La Mancha de cuyo nombre...");
		texto.setHorizontalAlignment(JLabel.CENTER);
		add(texto, BorderLayout.CENTER);

		// El grupo solo sirve para dar funcionalidad como grupo
		ButtonGroup migrupo1 = new ButtonGroup();

		boton1 = new JRadioButton("Pequeño", false);
		boton2 = new JRadioButton("Mediano", true);
		boton3 = new JRadioButton("Grande", false);
		boton4 = new JRadioButton("Muy grande", false);

		// Segunda lámina.- Para los RadioButtons
		JPanel lamina_radio = new JPanel();

		Evento_radio mievento = new Evento_radio();
		boton1.addActionListener(mievento);
		boton2.addActionListener(mievento);
		boton3.addActionListener(mievento);
		boton4.addActionListener(mievento);

		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		migrupo1.add(boton4);

		// Hay que añadir cada uno de los botones, no el grupo
		lamina_radio.add(boton1);
		lamina_radio.add(boton2);
		lamina_radio.add(boton3);
		lamina_radio.add(boton4);

		lamina_radio.setBackground(Color.YELLOW);
		add(lamina_radio, BorderLayout.SOUTH);
	}

	private class Evento_radio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == boton1) {
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			} else if (e.getSource() == boton2) {
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
			} else if (e.getSource() == boton3) {
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			} else if (e.getSource() == boton4) {
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
			}
		}

	}

	private JLabel texto;
	private JRadioButton boton1;
	private JRadioButton boton2;
	private JRadioButton boton3;
	private JRadioButton boton4;

}