// Referencias:
//
// Vídeo 099
//
// Clase: JSpinner
// Clase: SpinnerListModel
// Clase: SpinnerNumberModel
// Método: GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
// Crear clase para modelo propio de JSpinner

package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class V099_JSpinner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V099_Marco marco = new V099_Marco();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V099_Marco extends JFrame {

	public V099_Marco() {

		setBounds(400, 300, 550, 400);
		setTitle("Título");

		V099_Lamina milamina = new V099_Lamina();
		add(milamina);

		setVisible(true);

	}
}

class V099_Lamina extends JPanel {

	public V099_Lamina() {

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
		float f;
		control3.setAlignmentX((float) 0.0);
		f = control3.getAlignmentX();
		System.out.println(f);
		control3.setPreferredSize(new Dimension(200, 20));
		add(control3);

		JSpinner control4 = new JSpinner(new MiModeloJSpinner());
		control4.setPreferredSize(new Dimension(100, 20));
		add(control4);

		// Mismo caso que en control4 pero utilizando una clase interna anónima
		// para cambiar el comportamiento de los botones
		// Se inserta el código de los métodos getNextvalue() y getPrevious()
		// al instanciar JSPinnerNumberModel
		JSpinner control5 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) { // Llave
																				// de
																				// la
																				// clase
																				// anónima
			public Object getNextValue() {
				return super.getPreviousValue();
			}

			public Object getPreviousValue() {
				return super.getNextValue();
			}
		} // Llave de cierre de la clase anónima
		); // Paréntesis de cierre de los parámetros de JSpinner
		control5.setPreferredSize(new Dimension(100, 20));
		add(control5);

	}

	// Crear nuevo modelo para que los cursores funcionen al revés, como
	// habitual en otros sistemas/aplicaciones
	private class MiModeloJSpinner extends SpinnerNumberModel {

		public MiModeloJSpinner() {
			super(5, 0, 10, 1);

		}

		// Invierte el funcionamiento de la superclase
		public Object getNextValue() {
			return super.getPreviousValue();
		}

		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
}
