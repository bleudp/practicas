// Referencias:
//
// Vídeo 115 - Disposición en caja
//
// Clase: Box
// Método: Box.createHorizontalBox()
// Método: Box.createVerticalBox()
// Método: Box.createHorizontalStrut()
// Método: Box.createGlue()


package graficos;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class V115_BoxLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V115_MarcoCaja mimarco = new V115_MarcoCaja();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}
}

class V115_MarcoCaja extends JFrame {

	public V115_MarcoCaja() {

		setBounds(600, 350, 300, 200);
		setTitle("Marco disposición en caja");

		// --- Primer contenedor-----------------------------------------------

		JLabel rotulo1 = new JLabel("Nombre");
		JTextField texto1 = new JTextField(10);
		// Establece la longitud máxima para no tener problema al redimensionar
		texto1.setMaximumSize(texto1.getPreferredSize());

		// Crea un contenedor horizontal
		Box cajaH1 = Box.createHorizontalBox();

		// Añade el primer rótulo
		cajaH1.add(rotulo1);

		// Crea espacio fijo horizontal
		cajaH1.add(Box.createHorizontalStrut(10)); // px

		// Añade el primer campo de texto
		cajaH1.add(texto1);

		// --- Segundo contenedor ------------------------------------------

		JLabel rotulo2 = new JLabel("Contraseña");
		JTextField texto2 = new JTextField(10);
		// Establece la longitud máxima para no tener problema al redimensionar
		texto2.setMaximumSize(texto2.getPreferredSize());

		// Crea el segunto contenedor horizontal
		Box cajaH2 = Box.createHorizontalBox();

		// Añade el rótulo
		cajaH2.add(rotulo2);

		// Crea espacio fijo horizontal
		cajaH2.add(Box.createHorizontalStrut(10)); // px

		// Añade el campo de texto
		cajaH2.add(texto2);

		// --- Tercer contenedor ------------------------------------------

		JButton boton1 = new JButton("OK");
		JButton boton2 = new JButton("Cancelar");

		// Crea el tercer contenedor horizontal
		Box cajaH3 = Box.createHorizontalBox();

		// Añade el primer botón
		cajaH3.add(boton1);

		// Crea espacio variable (cambia si se redimensiona el marco)
		cajaH3.add(Box.createGlue()); //

		// Añade el segundo botón
		cajaH3.add(boton2);


		// --- Contenedor principal que contendrá a los demás ----------------

		// Crea la caja principal, vertical
		Box cajaVertical = Box.createVerticalBox();

		// Añade las tres cajas iniciales a la principal
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);

		
		// --- Añade la caja principal al marco
		
		add(cajaVertical, BorderLayout.CENTER);
		
	}
}
