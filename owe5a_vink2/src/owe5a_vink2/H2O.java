package owe5a_vink2;
/**
 *
 * @author karin
 */
import javax.swing.JFrame;

public class H2O extends JFrame{
	
	public static void main(String[] args) {
		
		Molecuul watermolecuul = new Molecuul();
		watermolecuul.setSize(520,580);
		watermolecuul.setVisible(true);
		watermolecuul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}