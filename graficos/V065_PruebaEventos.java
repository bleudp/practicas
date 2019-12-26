// Referencias:
//
// Video 065
// Botones
// Eventos

package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class V065_PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V065_MarcoBotones mimarco = new V065_MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class V065_MarcoBotones extends JFrame {

	public V065_MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);

		V065_LaminaBotones milamina = new V065_LaminaBotones();
		add(milamina);
	}
}

class V065_LaminaBotones extends JPanel {



}