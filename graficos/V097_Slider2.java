// Referencias:
//
// Vídeo 097 - Control deslizante - JSlider
//
// Clase JSlider
// addChangeListener(ChangeListener)

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class V097_Slider2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V097_MarcoSlider marco = new V097_MarcoSlider();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V097_MarcoSlider extends JFrame {

	public V097_MarcoSlider() {

		setBounds(550, 400, 550, 350);
		setTitle("Control deslizante");

		V097_Lamina milamina = new V097_Lamina();
		add(milamina);

		setVisible(true);

	}
}

class V097_Lamina extends JPanel {

	public V097_Lamina() {

		setLayout(new BorderLayout());

		rotulo = new JLabel("En un lugar de La Mancha...");
		rotulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(rotulo, BorderLayout.CENTER);

		control = new JSlider(SwingConstants.HORIZONTAL, 8, 50, 12);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		control.setPaintLabels(true);
		// control.setSnapToTicks(true);

		JPanel laminaSlider = new JPanel();

		control.addChangeListener(new EventoSlider());
		laminaSlider.add(control);

		add(laminaSlider, BorderLayout.NORTH);

	}

	private class EventoSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub

			// System.out.println("Estás manipulando el deslizador:" +
			// ++contador);
			// System.out.println("Estás manipulando el deslizador:" +
			// control.getValue());

			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));

		}

	}

	private JLabel rotulo;
	private JSlider control;
	private static int contador;
}
