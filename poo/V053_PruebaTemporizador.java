// Referencias:
// Vídeo 053
//
// Temporizador
// Interfaz pasada como parámetro
// Retrollamada
//
// Clase abstracta Toolkit ==> Funciones del Sistema Operativo
//
// Uso de clase interna

package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class V053_PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj = new Reloj(2000, true);
		mireloj.enMarcha();

		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
	}

}

class Reloj {

	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}

	public void enMarcha() {
		ActionListener oyente = new V053_DameLaHora();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}

	private int intervalo;
	private boolean sonido;

	// Clase interna
	// Accede a las variables private de la clase Reloj sin método getter
	//
	// Solo pueden tener modificador private las clases internas
	private class V053_DameLaHora implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 seg. " + ahora);
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}

	}

}