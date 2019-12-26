// Referencias:
//
// Vídeo V091 - Areas de Texto
// Todo el código en una única clase.- No recomendado
// Clase TextArea
// Clase JScrollPane
// Operador ternario

package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V091_AreaTexto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V091_MarcoArea V091_MarcoArea = new V091_MarcoArea();
		V091_MarcoArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		V091_MarcoArea.setVisible(true);

	}
}

class V091_MarcoArea extends JFrame {

	public V091_MarcoArea() {

		setTitle("Area de texto");
		setBounds(500, 300, 500, 350);

		setLayout(new BorderLayout());

		laminaBotones = new JPanel();

		botonInsertar = new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de La Mancha de cuyo nombre no quiero acordarme...");
			}
		});

		laminaBotones.add(botonInsertar);

		botonSaltoLinea = new JButton("Salto Línea");
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				boolean saltar = !areaTexto.getLineWrap();
				int modoIf = 2; // Para pruebas de distintos modos de probar la
								// condición
				areaTexto.setLineWrap(saltar);
				if (modoIf == 1) {
					if (saltar) {
						botonSaltoLinea.setText("Quitar salto");
					} else {
						botonSaltoLinea.setText("Salto Línea");
					}
				}
				if (modoIf == 2) {
					// Operador ternario
					// Como la función "si" de Excel
					botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Línea;");
				}
			}
		});

		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		areaTexto = new JTextArea(8, 20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}

	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}
