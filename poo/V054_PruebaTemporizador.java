// Referencias:
// Vídeo 054
//
// Temporizador
// Interfaz pasada como parámetro
// Retrollamada
//
// Clase abstracta Toolkit ==> Funciones del Sistema Operativo
//
// Convertir a clase interna local

package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class V054_PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Los parámetros pasar a enMarcha()
		// V054_Reloj mireloj = new V054_Reloj(2000, true);
		V054_Reloj mireloj = new V054_Reloj();
		mireloj.enMarcha(3000, true);

		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
	}

}

class V054_Reloj {

	// Se prescinde del contructor
	// public V054_Reloj(int intervalo, boolean sonido) {
	// this.intervalo = intervalo;
	// this.sonido = sonido;
	// }

	// El boolean tiene que ser final al pasar a parámetro de la clase interna
	// Ocurre con los parámetros que vayan a ser utilizados por la clase interna local
	public void enMarcha(int intervalo, final boolean sonido) {

		// Clase interna
		// Accede a las variables private de la clase Reloj sin método getter
		//
		// Solo pueden tener modificador private las clases internas
		//
		// Convertir a clase interna local ya que solo se usa desde el método
		// enMarcha()

		// Hay que eliminar el private. No se admite en clases internas locales
		// private class V054_DameLaHora implements ActionListener {
		class V054_DameLaHora implements ActionListener {
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 seg. " + ahora);
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}

		ActionListener oyente = new V054_DameLaHora();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}

	// Se convierten a parámetros de enMarcha()
	// private int intervalo;
	// private boolean sonido;

}