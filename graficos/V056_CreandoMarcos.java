// Referencias:
//
// Ventanas / Marcos / Frames
// Posicionar ventana
// Cambiar atributos standard ventana

package graficos;

import java.awt.Frame;

import javax.swing.JFrame;

public class V056_CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V056_miMarco marco2 = new V056_miMarco();
		marco2.setVisible(true);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class V056_miMarco extends JFrame {

	public V056_miMarco() {
//		setSize(500, 300);
//		setLocation(500, 300);
		setBounds(500, 300, 550, 250);
//		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mi ventana");
		
		
	}
}
