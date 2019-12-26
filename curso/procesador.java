package curso;

import java.awt.BorderLayout;

import javax.swing.*;

public class procesador {
	public static void main(String[] args) {
		MarcoProcesador mimarco=new MarcoProcesador();
	}
}

class MarcoProcesador extends JFrame{
	public MarcoProcesador(){
		LaminaProcesador milamina=new LaminaProcesador();
		setBounds(500,500,500,500);
		setSize(500,500);
		add(milamina);
		setVisible(true);
	}
}

class LaminaProcesador extends JPanel{
	JMenu menu;
	JMenu edicion;
	JMenu herramientas;
	public LaminaProcesador(){
		setLayout(new BorderLayout());
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		
		menu=new JMenu("Archivo");
		edicion=new JMenu("Edición");
		herramientas=new JMenu("Herramientas");
		
		// Configuración de botones
		Configura("menu", "Guardar");
		Configura("menu", "Guardar como");
		
		JMenuItem cortar=new JMenuItem("cortar", new ImageIcon("bin/curso/cortar.gif"));
		JMenuItem copiar=new JMenuItem("copiar", new ImageIcon("bin/curso/copiar.gif"));
		JMenuItem pegar=new JMenuItem("pegar", new ImageIcon("bin/curso/pegar.gif"));
		//Configura("edicion", "cortar");
		//Configura("edicion","copiar");
		//Configura("edicion", "pegar");
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		JMenu opciones=new JMenu("Opciones");
		opciones.add(new JMenuItem("Suprimir"));
		opciones.add(new JMenuItem("Test"));
		edicion.add(opciones);
		
		Configura("herramientas","Generales");
		
		JMenuItem opcion2=new JMenuItem();
		
		mibarra.add(menu);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		JTextPane recuadro=new JTextPane();
		add(recuadro, BorderLayout.CENTER);
	}
	
	public void Configura(String rotulo, String boton) {
		
		if (rotulo=="menu") {
			JMenuItem item=new JMenuItem(boton);
			menu.add(item);
		}
		else if(rotulo=="edicion") {
			JMenuItem item=new JMenuItem(boton);
			edicion.add(item);
		}
		else {
			JMenuItem item=new JMenuItem(boton);
			herramientas.add(item);
		}
		
	}
}
