// Referencias:
//
// Vídeo V093 - Radio Buttons
//
// Clase JRadioButton (cada uno de los botones)
// Clase ButtonGroup (el grupo)

package graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class V093_RadioButtons {

	public static boolean modoDebug = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V093_Marco V093_Marco = new V093_Marco();
		V093_Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class V093_Marco extends JFrame {

	public V093_Marco() {

		setTitle("Prueba RadioButton");
		setBounds(550, 300, 500, 300);

		V093_Lamina milamina = new V093_Lamina();

		add(milamina);

		setVisible(true);

	}
}

class V093_Lamina extends JPanel {
	public V093_Lamina() {

		// El grupo solo sirve para dar funcionalidad como grupo
		ButtonGroup migrupo1 = new ButtonGroup();
		ButtonGroup migrupo2 = new ButtonGroup();

		JRadioButton boton1 = new JRadioButton("Azul", false);
		JRadioButton boton2 = new JRadioButton("Rojo", true);
		JRadioButton boton3 = new JRadioButton("Verde", false);

		JRadioButton boton4 = new JRadioButton("Masculino", false);
		JRadioButton boton5 = new JRadioButton("Femenino", false);

		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);

		migrupo2.add(boton4);
		migrupo2.add(boton5);

		// Hay que añadir cada uno de los botones, no el grupo
		add(boton1);
		add(boton2);
		add(boton3);

		add(boton4);
		add(boton5);


	}

}