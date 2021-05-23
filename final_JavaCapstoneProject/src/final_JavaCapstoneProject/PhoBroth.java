package final_JavaCapstoneProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PhoBroth extends JFrame implements ActionListener {

	private JButton back;
	private JButton next;
	private static JPanel main;
	private static String broth;
	
	public PhoBroth() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("Back button pressed");
			
			PhoStock window = new PhoStock();
			window.setBounds(500, 500, 300,200);
			window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setIconImage(Main.getIcon());
	    	
	    	setVisible(false);
	    	dispose();
		}
		if(e.getSource() == next) {
			System.out.println("Next button pressed");
			SandwichVeggies nextWindow = new SandwichVeggies();
			nextWindow.setBounds(50,50, 1440,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
	}

}
