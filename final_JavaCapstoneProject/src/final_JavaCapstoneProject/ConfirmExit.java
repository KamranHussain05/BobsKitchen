package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ConfirmExit extends JFrame implements ActionListener {
	//Fields
	private static boolean dismissed = false;
	
	//Constructor
	public ConfirmExit() {
		super("Confirm Exit");
		
		JPanel main = new JPanel();
		main.setBackground(new Color(200,200,200));
		
		JLabel warning = new JLabel();
		warning.setText("Are you sure you want to exit?");
		main.add(warning);
		
		JLabel warning2 = new JLabel();
		warning2.setText("Your progress will not be saved");
		main.add(warning2);
		
		JButton dismiss = new JButton();
		dismiss.setText("Yes, I'm sure");
		dismiss.setBackground(new Color(79,93,117));
		dismiss.setForeground(Color.WHITE);
		dismiss.addActionListener(this);
		this.add(dismiss);
		
		Container base = getContentPane();
		base.add(main, BorderLayout.CENTER);
		base.add(dismiss, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
	//Method
	public void actionPerformed(ActionEvent e) {
		System.out.println("Game Exit confirmed");
		
		Home homePage = new Home();
		homePage.setBounds(50, 50, 1440, 900);
    	homePage.setBackground(new Color(211,211,211));
    	homePage.setVisible(true);
    	homePage.setIconImage(Main.getIcon());
		
		setVisible(false);
		dispose();
		dismissed = true;
	}

	//Method
	public static boolean isDismissed() {
		return dismissed;
	}
}
