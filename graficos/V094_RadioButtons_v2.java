// Referencias:
//
// Vídeo V094 - Radio Buttons - v2
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

public class V094_RadioButtons_v2 {

	public static boolean modoDebug = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V094_Marco_v2 V094_Marco_v2 = new V094_Marco_v2();
		V094_Marco_v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class V094_Marco_v2 extends JFrame {

	public V094_Marco_v2() {

		setTitle("Prueba RadioButton");
		setBounds(550, 300, 500, 300);

		V094_Lamina_v2 milamina = new V094_Lamina_v2();

		add(milamina);

		setVisible(true);

	}
}

class V094_Lamina_v2 extends JPanel {
	public V094_Lamina_v2() {

		setLayout(new BorderLayout());
		setBackground(Color.CYAN);

		texto = new JLabel("En un lugar de La Mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		texto.setHorizontalAlignment(JLabel.CENTER);
		add(texto, BorderLayout.CENTER);

		lamina_botones = new JPanel();
		migrupo = new ButtonGroup();

		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy grande", false, 24);

		add(lamina_botones, BorderLayout.SOUTH);
	}

	public void colocarBotones(String nombre, boolean seleccionado, final int tamano) {
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		migrupo.add(boton);
		lamina_botones.add(boton);
		ActionListener mievento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}

		};

		boton.addActionListener(mievento);

	}

	private JLabel texto;
	private ButtonGroup migrupo;
	private JPanel lamina_botones;

}