import javax.swing.JOptionPane;

public class V021_Comprueba_Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean arroba = false;

		String mail = JOptionPane.showInputDialog("Introduce mail");

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba = true;
			}
		}
		if (arroba == true) {
			System.out.println("El mail es correcto");
		} else {
			System.out.println("El mail no es correcto");
		}
	}
}
