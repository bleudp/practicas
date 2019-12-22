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
import javax.swing.text.StyledEditorKit;

public class copia_procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador_II_copia mimarco = new MenuProcesador_II_copia();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setTitle("Guadalping Word");
	}

}

 
class MenuProcesador_II_copia extends JFrame{
	
	public MenuProcesador_II_copia() {
		
		setBounds(500,300,550,400);
		
		LaminaProcesador_II_copia milamina = new LaminaProcesador_II_copia();
		
		add(milamina);
		
		
		
		setVisible(true);
	}
	
}

class LaminaProcesador_II_copia extends JPanel{
	
	
	
	public LaminaProcesador_II_copia() {
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
			
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_familia", tipo_letra));
			
		}
		else if(menu=="tamaño") {
			tamagno.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
			
		}
		else {
			
			if (estilo==Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}
			else if(estilo==Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
			estilos.add(elem_menu);
			
		}
		
		
		

	}
	
	JTextPane miarea;
	
	JMenu fuente, estilos, tamagno;
	
	Font letras;
	
}