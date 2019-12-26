// Referencias:
//
// Vídeo 103 - Procesador de textos - 3
//
// Modularizar la creación de items de los menús y
// preparar para poner a la escucha en una sola instrucción 

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class V103_ProcesadorTextos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V103_MenuProcesador_II mimarco = new V103_MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mimarco.setVisible(true);

	}
}

class V103_MenuProcesador_II extends JFrame {

	public V103_MenuProcesador_II() {

		setBounds(500, 300, 550, 400);
		setTitle("Prueba procesador de textos - 3");

		V103_LaminaProcesador_II milamina = new V103_LaminaProcesador_II();
		add(milamina);

		setVisible(true);

	}
}

class V103_LaminaProcesador_II extends JPanel {

	public V103_LaminaProcesador_II() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		// ------------------------------------------------------
		JMenuBar miBarra = new JMenuBar();

		// ------------------------------------------------------
		menuFuente = new JMenu("Fuente");
		configura_menu("Arial", "fuente", "", 0, 0);
		configura_menu("Courier", "fuente", "", 0, 0);
		configura_menu("Verdana", "fuente", "", 0, 0);
		miBarra.add(menuFuente);

		menuEstilo = new JMenu("Estilo");
		configura_menu("Negrita", "estilo", "", 0, 0);
		configura_menu("Cursiva", "estilo", "", 0, 0);
		miBarra.add(menuEstilo);

		menuTamano = new JMenu("Tamaño");
		configura_menu("12", "tamano", "", 0, 0);
		configura_menu("16", "tamano", "", 0, 0);
		configura_menu("20", "tamano", "", 0, 0);
		configura_menu("24", "tamano", "", 0, 0);
		miBarra.add(menuTamano);

		// ------------------------------------------------------
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		// ------------------------------------------------------

		// ---- Preparar lámina para el texto en parte central
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);

	}

	public void configura_menu(
			String rotulo, 
			String menu, 
			String tipoLetra, 
			int estilos, 
			int tamano) {
		JMenuItem elem_menu = new JMenuItem(rotulo);
		if (menu == "fuente") {
			menuFuente.add(elem_menu);
		} else if (menu == "estilo") {
			menuEstilo.add(elem_menu);
		} else if (menu == "tamano") {
			menuTamano.add(elem_menu);
		}
	}

	/*
	private class Gestiona_Eventos implements ActionListener {

		String menu; // Menú pulsado
		String tipoTexto; // Tipo seleccionado
		int estiloLetra; // Estilo seleccionado
		int tamanoLetra; // Tamaño seleccionado

		Gestiona_Eventos(String elemento2, String texto2, int estilo2, int tamano2) {
			tipoTexto = texto2;
			estiloLetra = estilo2;
			tamanoLetra = tamano2;
			menu = elemento2;
		};

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			miarea.setFont(new Font(tipoTexto, estiloLetra, tamanoLetra));

		}

	}
*/
	
	JTextPane miarea;
	JMenu menuFuente, menuEstilo, menuTamano;
	Font letras;
}
