// Referencias:
//
// Vídeo 098
//
// Clase: JSpinner
// Clase: SpinnerListModel
// Clase: SpinnerNumberModel
// Método: GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class V098_JSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V098_Marco marco = new V098_Marco();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V098_Marco extends JFrame {

	public V098_Marco() {

		setBounds(400, 300, 550, 400);
		setTitle("Título");

		V098_Lamina milamina = new V098_Lamina();
		add(milamina);

		setVisible(true);

	}
}

class V098_Lamina extends JPanel {

	public V098_Lamina() {

		JSpinner control1 = new JSpinner();
		control1.setPreferredSize(new Dimension(100, 20));
		add(control1);

		String lista2[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		JSpinner control2 = new JSpinner(new SpinnerListModel(lista2));
		control2.setPreferredSize(new Dimension(100, 20));
		add(control2);

		String lista3[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control3 = new JSpinner(new SpinnerListModel(lista3));
		control3.setPreferredSize(new Dimension(200, 20));
		add(control3);

		JSpinner control4 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
		control4.setPreferredSize(new Dimension(100, 20));
		add(control4);

	}

}
