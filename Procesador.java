package curso;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador_II mimarco = new MenuProcesador_II();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

 
class MenuProcesador_II extends JFrame{
	
	public MenuProcesador_II() {
		
		setBounds(500,300,550,400);
		
		LaminaProcesador_II milamina = new LaminaProcesador_II();
		
		add(milamina);
		
		setVisible(true);
	}
	
}

class LaminaProcesador_II extends JPanel{
	
	
	
	public LaminaProcesador_II() {
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		JMenuBar mibarra=new JMenuBar();
		//-----------------------------------------
		fuente=new JMenu("Fuente");
		
		estilos=new JMenu("Estilo");
		
		tamagno=new JMenu("Tamaño");
		
		configura_menu("Arial","fuente",  "Arial", 9,10);
		configura_menu("Courier","fuente",  "Courier", 9,10);
		configura_menu("Verdana","fuente",  "Verdana", 9,10);
		
		configura_menu("Negrita","estilo",  "", Font.BOLD,10);
		configura_menu("Cursiva","estilo",  "", Font.ITALIC,10);
		
		configura_menu("12","tamaño",  "", 9,12);
		configura_menu("16","tamaño",  "", 9,16);
		configura_menu("20","tamaño",  "", 9,20);
		configura_menu("24","tamaño",  "", 9,24);
		
		//configura_menu();
		
		mibarra.add(fuente);
		
		mibarra.add(estilos);
		
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		miarea=new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
	}
	
	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilo, int tam){
	
		JMenuItem elem_menu=new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
		}
		else if(menu=="tamaño") {
			tamagno.add(elem_menu);
		}
		else {
			estilos.add(elem_menu);
		}
		
		elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilo, tam));
	}
	
	private class Gestiona_Eventos implements ActionListener{
		String tipo_texto, menu;
		int estilo_letra, tamagno_letra;
		
		Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra){
			tipo_texto=texto2;
			
			estilo_letra=estilo2;
			
			tamagno_letra=tam_letra;
			
			menu=elemento;
			
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			letras=miarea.getFont();
			
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {
				estilo_letra=letras.getStyle();
				
				tamagno_letra=letras.getSize();
				
			}
			else if(menu=="Negrita" || menu=="Cursiva") {
				
				if (letras.getStyle() == 1 || letras.getStyle()==2) {
					estilo_letra=3;
				}
				
				tipo_texto=letras.getName();
				
				tamagno_letra=letras.getSize();
			}
			else {
				estilo_letra=letras.getStyle();
				
				tipo_texto=letras.getName();
			}
			
			miarea.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra));
			
			System.out.println("Tipo de letra: " + tipo_texto + " Estilo: " + estilo_letra + " tamaño: " + tamagno_letra);
		}
		
	}
	
	JTextPane miarea;
	
	JMenu fuente, estilos, tamagno;
	
	Font letras;
	
}