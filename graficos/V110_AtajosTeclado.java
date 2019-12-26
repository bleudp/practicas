// Referencias:
//
// Vídeo 110 - Atajos de teclado
//
// Clase JMenuItem
// Método setAccelerator()
// Método getKeyStroke(int keycode, int modifiers)

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class V110_AtajosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V110_MenuProcesador_II mimarco = new V110_MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mimarco.setVisible(true);

	}
}

class V110_MenuProcesador_II extends JFrame {

	public V110_MenuProcesador_II() {

		setBounds(500, 300, 550, 400);
		setTitle("Prueba procesador de textos con menú emergente");

		V110_c_LaminaProcesador_II milamina = new V110_c_LaminaProcesador_II();
		add(milamina);

		setVisible(true);

	}
}

class V110_c_LaminaProcesador_II extends JPanel {

	public V110_c_LaminaProcesador_II() {

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
		configura_menu("Negrita", "estilo", "", Font.BOLD, 0,
				"src/recursos/famfamfam_silk_icons_v013/icons/text_bold.png");
		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 0,
				"src/recursos/famfamfam_silk_icons_v013/icons/text_italic.png");
		miBarra.add(menuEstilo);

		// JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",
		// new
		// ImageIcon("src/recursos/famfamfam_silk_icons_v013/icons/text_bold.png"));
		// JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",
		// new
		// ImageIcon("src/recursos/famfamfam_silk_icons_v013/icons/text_italic.png"));
		// negrita.addActionListener(new StyledEditorKit.BoldAction());
		// miBarra.add(menuEstilo);
		// cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		// menuEstilo.add(negrita);
		// menuEstilo.add(cursiva);

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

		// Añadir atajo de teclado Ctrl-D a la opción de tamaño 24
		// t24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,
		// InputEvent.CTRL_DOWN_MASK));

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

		// Añadir menú emergente
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		emergente.add(negritaE);
		emergente.add(cursivaE);
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		miarea.setComponentPopupMenu(emergente);

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

		} else if (menu == "estilo") {
			menuEstilo.add(elem_menu);
			if (estilos == Font.BOLD) {

				// Atajo de teclado para Negrita: Ctrl-N
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			} else if (estilos == Font.ITALIC) {
				// Atajo de teclado para Cursiva: Ctrl-K
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
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
