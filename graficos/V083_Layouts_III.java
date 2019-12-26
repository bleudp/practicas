// Referencias:
//
// Video 083
// Layouts
// GridLayout
// Calculadora

package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V083_Layouts_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V083_Marco_Calculadora marco = new V083_Marco_Calculadora();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}
}

class V083_Marco_Calculadora extends JFrame {

	public V083_Marco_Calculadora() {

		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);

		V083_Lamina_Calculadora milamina = new V083_Lamina_Calculadora();
		add(milamina);
	}
}

class V083_Lamina_Calculadora extends JPanel {

	public V083_Lamina_Calculadora() {

		setLayout(new BorderLayout());

		JButton pantalla = new JButton("0");

		pantalla.setEnabled(false);

		add(pantalla, BorderLayout.NORTH);

		// Segunda lámina. Tipo Grid
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4, 4));

		// Se pasa la creación de los botones a método aparte

		// JButton boton1 = new JButton("1");
		// JButton boton2 = new JButton("2");
		// JButton boton3 = new JButton("3");
		// JButton boton4 = new JButton("4");
		// JButton boton5 = new JButton("5");
		// JButton boton6 = new JButton("6");
		// JButton boton7 = new JButton("7");
		// JButton boton8 = new JButton("8");
		// JButton boton9 = new JButton("9");
		// JButton botonigual = new JButton("=");
		// JButton botonpor = new JButton("*");
		// JButton botonmas = new JButton("+");
		// JButton botoncoma = new JButton(",");
		// JButton botondividir = new JButton("/");
		// JButton botonresta = new JButton("-");
		// JButton boton99 = new JButton("");

		// milamina2.add(boton1);
		// milamina2.add(boton2);
		// milamina2.add(boton3);
		// milamina2.add(boton4);
		// milamina2.add(boton5);
		// milamina2.add(boton6);
		// milamina2.add(boton7);
		// milamina2.add(boton8);
		// milamina2.add(boton9);
		// milamina2.add(botonigual);
		// milamina2.add(botonpor);
		// milamina2.add(botonmas);
		// milamina2.add(botoncoma);
		// milamina2.add(botondividir);
		// milamina2.add(botonresta);
		// milamina2.add(boton99);

		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");

		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");

		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");

		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("=");
		ponerBoton("+");

		add(milamina2, BorderLayout.CENTER);

	}

	private void ponerBoton(String rotulo) {
		JButton boton = new JButton(rotulo);
		milamina2.add(boton);
	}

	// Se saca la declaración de milamina2 fuera del constructor, para que esté
	// disponible en todos los métodos de la clase
	private JPanel milamina2;
}