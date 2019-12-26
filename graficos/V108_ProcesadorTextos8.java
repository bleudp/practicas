// Referencias:
//
// Vídeo 108 - Procesador de textos - 8
//
// Modularizar la creación de items de los menús y
// preparar para poner a la escucha en una sola instrucción.
//
// Dotar de funcionalidad, modificando el texto respetando los valores no modificados
//
// Clase StyledEditorKit
//
// Añadir iconos a los menús
// JChecKjBoxMenuItem
// JRadioButtonMenuItem

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class V108_ProcesadorTextos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V108_b_MenuProcesador_II mimarco = new V108_b_MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mimarco.setVisible(true);

	}
}

class V108_b_MenuProcesador_II extends JFrame {

	public V108_b_MenuProcesador_II() {

		setBounds(500, 300, 550, 400);
		setTitle("Prueba procesador de textos - 4");

		V108_b_LaminaProcesador_II milamina = new V108_b_LaminaProcesador_II();
		add(milamina);

		setVisible(true);

	}
}

class V108_b_LaminaProcesador_II extends JPanel {

	public V108_b_LaminaProcesador_II() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		// ------------------------------------------------------
		JMenuBar miBarra = new JMenuBar();

		// ------------------------------------------------------
		//
		// Se dejan vacíos o a cero los parámetros que no se van a utilizar
		// en cada caso. El método configura_menu() se utiliza para tres
		// acciones distintas, según el menú seleccionado.
		menuFuente = new JMenu("Fuente");
		configura_menu("Arial", "fuente", "Arial", 0, 0, "");
		configura_menu("Courier", "fuente", "Courier New", 0, 0, "");
		configura_menu("Verdana", "fuente", "Verdana", 0, 0, "");
		miBarra.add(menuFuente);

		menuEstilo = new JMenu("Estilo");
		// configura_menu("Negrita", "estilo", "", Font.BOLD, 0,
		// "src/recursos/famfamfam_silk_icons_v013/icons/text_bold.png");
		// configura_menu("Cursiva", "estilo", "", Font.ITALIC, 0,
		// "src/recursos/famfamfam_silk_icons_v013/icons/text_italic.png");
		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",
				new ImageIcon("src/recursos/famfamfam_silk_icons_v013/icons/text_bold.png"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",
				new ImageIcon("src/recursos/famfamfam_silk_icons_v013/icons/text_italic.png"));
		menuEstilo.add(negrita);
		menuEstilo.add(cursiva);
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		miBarra.add(menuEstilo);
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());

		menuTamano = new JMenu("Tamaño");
		// configura_menu("12", "tamano", "", 0, 12, "");
		// configura_menu("16", "tamano", "", 0, 16, "");
		// configura_menu("20", "tamano", "", 0, 20, "");
		// configura_menu("24", "tamano", "", 0, 24, "");

		ButtonGroup tamano_letra = new ButtonGroup();
		JRadioButtonMenuItem t12 = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem t16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem t20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem t24 = new JRadioButtonMenuItem("24");
		tamano_letra.add(t12);
		tamano_letra.add(t16);
		tamano_letra.add(t20);
		tamano_letra.add(t24);
		miBarra.add(menuTamano);
		t12.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 12));
		t16.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 16));
		t20.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 20));
		t24.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 24));
		menuTamano.add(t12);
		menuTamano.add(t16);
		menuTamano.add(t20);
		menuTamano.add(t24);
		// ------------------------------------------------------
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		// ------------------------------------------------------

		// ---- Preparar lámina para el texto en parte central
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);

	}

	public void configura_menu(String rotulo, String menu, String tipoLetra, int estilos, int tamano,
			String ruta_icono) {
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		if (menu == "fuente") {
			menuFuente.add(elem_menu);
			if (tipoLetra == "Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			} else if (tipoLetra == "Courier New") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier New"));
			} else if (tipoLetra == "Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}

		} else if (menu == "estilo" & 1 == 2) { // Desactivado
			menuEstilo.add(elem_menu);
			if (estilos == Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			} else if (estilos == Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		} else

		if (menu == "tamano") {
			menuTamano.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", tamano));
		}
	}

	JTextPane miarea;
	JMenu menuFuente, menuEstilo, menuTamano;
	Font letras;

}
