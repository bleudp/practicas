package curso;

import java.awt.BorderLayout;

import javax.swing.*;

public class procesador_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesadorMarco mimarco=new ProcesadorMarco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class ProcesadorMarco extends JFrame{
	ProcesadorMarco(){
		setBounds(500,500,300,300);
		setSize(500,500);
		ProcesadorLamina milamina=new ProcesadorLamina();
		add(milamina);
		setVisible(true);
		
	}
}

class ProcesadorLamina extends JPanel{
	ProcesadorLamina(){
		setLayout(new BorderLayout());
		JPanel panel=new JPanel();
		JMenuBar barra=new JMenuBar();
		JMenu archivo=new JMenu("Archivo");
		JMenu edicion=new JMenu("Edición");
		JMenu herramientas=new JMenu("Herramientas");
		barra.add(archivo);
		barra.add(edicion);
		barra.add(herramientas);
		
		panel.add(barra);
		add(panel, BorderLayout.NORTH);
	}
}