package owe5a_vink2;

/**
 *
 * @author karin
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Molecuul extends JFrame{
	private JPanel panel;
	private JTextField field1;
	private JTextField field2;
	private JButton button;
	
	public Molecuul(){ //method 
		super("Watermolecuul - K. Geertse");
		setLayout(new FlowLayout());
		
		//add components to window
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setBackground(Color.white);
        add(panel);
        
        JLabel label1 = new JLabel("x:");
        add(label1);
        field1 = new JTextField(5);
		add(field1);
		
        JLabel label2 = new JLabel("y:");
        add(label2);
        field2 = new JTextField(5);
		add(field2);
			
		button = new JButton("Teken water molecuul");
        add(button);
        
        //add listener to events
		Eventhandler handler = new Eventhandler();
		button.addActionListener(handler);
		
	}
	//perform after event
	private class Eventhandler implements ActionListener{
	    public void actionPerformed(ActionEvent event) {

	    	String fieldx = field1.getText(); 
	    	String fieldy = field2.getText(); 
	    	int x = Integer.parseInt(fieldx);
	    	int y = Integer.parseInt(fieldy);

			Graphics paper = panel.getGraphics();
			paper.setColor(Color.white);
			paper.fillRect(0, 0, 1000, 1000);
			paper.setColor(Color.red);
			paper.fillOval(x, y, 100, 100);
			paper.setColor(Color.black);
			paper.drawLine(x-52, y-75, x+15, y+15);
			paper.drawLine(x-140 , y+120, x+2, y+ 65);
			paper.setColor(Color.blue);
			paper.fillOval(x-100, y-125, 60, 60);
			paper.fillOval(x-170, y+80, 60, 60);
	    }

	}

}
