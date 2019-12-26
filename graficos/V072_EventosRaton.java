// Referencias:
//
// Video 072 y 073
// Eventos de ratón
// Interfaz mouseListener
// Interfaz mouseMotionListener

package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class V072_EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame {

	public MarcoRaton() {
		setVisible(true);
		setBounds(700, 300, 600, 450);

		EventosDeRaton EventoRaton = new EventosDeRaton();
		addMouseListener(EventoRaton);

		addMouseMotionListener(new EventosDeRaton2());
	}
}

// class EventosDeRaton implements MouseListener {
//
// @Override
// public void mouseClicked(MouseEvent e) {
// // TODO Auto-generated method stub
// System.out.println("Has hecho click.");
//
// }
//
// @Override
// public void mouseEntered(MouseEvent e) {
// // TODO Auto-generated method stub
// System.out.println("Acabas de entrar.");
// }
//
// @Override
// public void mouseExited(MouseEvent e) {
// // TODO Auto-generated method stub
// System.out.println("Acabas de salir.");
//
// }
//
// @Override
// public void mousePressed(MouseEvent e) {
// // TODO Auto-generated method stub
// System.out.println("Acabas de presionar.");
//
// }
//
// @Override
// public void mouseReleased(MouseEvent e) {
// // TODO Auto-generated method stub
// System.out.println("Acabas de levantar.");
//
// }
//
// }

// Clase adaptadora para no tener que desarrollar todos los métodos. Solo los
// utilizados.
class EventosDeRaton extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click.");
		System.out.println("Coordenada x: " + e.getX() + " - " + "Coordenada y: " + e.getY() + ".");
		System.out.println("Cuenta de clicks: " + e.getClickCount() + ".");

	}

	@Override
	public void mousePressed(MouseEvent e) {

		int modificadores = e.getModifiersEx();
		System.out.println("Modificadores: " + modificadores + ".");

		// TODO Auto-generated method stub

		System.out.println("Modificadores: " + modificadores + ".");
		if (modificadores == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el botón izquierdo.");
		} else if (modificadores == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado el botón 2.");
		} else if (modificadores == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el botón derecho.");
		}

	}

}

class EventosDeRaton2 implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estás arrastrando.");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estás moviendo.");
	}

}