// Referencias:
//
// Vídeo 122 - Ventanas emergentes
//
// Clase JOptionPane
// Clase JFileChooser
// Clase JColorChooser

package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class V122_Tipos_Cuadros_Dialogos_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V122_Cuadros_Dialogos mimarco = new V122_Cuadros_Dialogos();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class V122_Cuadros_Dialogos extends JFrame {

	public V122_Cuadros_Dialogos() {

		setBounds(500, 300, 400, 250);
		add(new V122_Lamina_Cuadros_Dialogos());
	}
}

class V122_Lamina_Cuadros_Dialogos extends JPanel {

	public V122_Lamina_Cuadros_Dialogos() {

		boton1 = new JButton("boton1");
		boton2 = new JButton("boton2");
		boton3 = new JButton("boton3");
		boton4 = new JButton("boton4");

		boton1.addActionListener(new V122_Accion_botones());
		boton2.addActionListener(new V122_Accion_botones());
		boton3.addActionListener(new V122_Accion_botones());
		boton4.addActionListener(new V122_Accion_botones());

		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}

	private class V122_Accion_botones implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == boton1) {
				// System.out.println("Has pulsado el botón 1");

				// JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this,
				// "Mensaje de prueba");

				// Opciones para el icono a mostrar:
				// JOptionPane.ERROR_MESSAGE
				// JOptionPane.INFORMATION_MESSAGE
				// JOptionPane.WARNING_MESSAGE
				// JOptionPane.QUESTION_MESSAGE
				// JOptionPane.PLAIN_MESSAGE

				JOptionPane.showMessageDialog(V122_Lamina_Cuadros_Dialogos.this, "Mensaje de prueba", "Advertencia",
						JOptionPane.ERROR_MESSAGE);

			} else if (e.getSource() == boton2) {
				// System.out.println("Has pulsado el botón 2");

				JOptionPane.showInputDialog("Introduce el nombre");
				JOptionPane.showInputDialog(V122_Lamina_Cuadros_Dialogos.this, "Introduce nombre",
						"Introducción de datos", 2);

			} else if (e.getSource() == boton3) {
				// System.out.println("Has pulsado el botón 3");

				// Opciones de botones a mostrar
				// YES_NO_OPTION
				// YES_NO_CANCEL_OPTION
				// OK_CANCEL_OPTION
				int rc;
				rc = JOptionPane.showConfirmDialog(V122_Lamina_Cuadros_Dialogos.this, "Seleccione una opción",
						"Ventana confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("rc = " + rc);

			} else {
				// System.out.println("Has pulsado el botón 4");
				JOptionPane.showOptionDialog(V122_Lamina_Cuadros_Dialogos.this, "Seleccione una opción",
						"Option Dialog", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
			}
		}
	}

	private JButton boton1, boton2, boton3, boton4;
}
