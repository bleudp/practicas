// Referencias:
//
// Vídeo 096 - Control deslizante - JSlider
//
// Clase JSlider

package graficos;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class V096_Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V096_MarcoSlider marco = new V096_MarcoSlider();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V096_MarcoSlider extends JFrame {

	public V096_MarcoSlider() {

		setBounds(550, 400, 550, 350);
		setTitle("Control deslizante");

		V096_LaminaSlider milamina = new V096_LaminaSlider();
		add(milamina);

		setVisible(true);

	}
}

class V096_LaminaSlider extends JPanel {

	public V096_LaminaSlider() {

		JSlider control = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 50);
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif", Font.ITALIC, 12));
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		add(control);
	}

}
