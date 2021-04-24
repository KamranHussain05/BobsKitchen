package final_JavaCapstoneProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Help extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static boolean dismissed = false;

	public Help() {
		super("How to Play!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	    dispose();
		dismissed = true;
	}
	
	public static boolean isDismissed() {
		return dismissed;
	}

}
