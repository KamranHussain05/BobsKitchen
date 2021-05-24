//Author: Kamran Hussain

package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class Help extends JFrame implements ActionListener {
	//the main panel that holds all the page content.
	private static JPanel main;
	//Creates the GUI elements ands adds it to the window.
	public Help() {
		super("How to Play!");
	
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1,1);
		main.setLayout(mainLayout);
		main.setBackground(new Color(211,211,211));
		//the panel containing the steps
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(4,2, 10, 10);
		panel.setLayout(layout);
		panel.setBackground(new Color(211,211,211));
	    
	    JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("How To Play");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    //the following 4 labels contain all the necessary steps.
	    JLabel step1 = new JLabel("Step 1: ");
	    step1.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step1, BorderLayout.WEST);
	    JButton step1Left = new JButton();
	    step1Left.setText("<html>Select a dish to make! <br> Each level up is a harder dish! Keep your eyes open!</html>");
	    step1Left.setBackground(Color.WHITE);
	    step1Left.setEnabled(false);
	    panel.add(step1Left, BorderLayout.EAST);
	    
	    JLabel step2 = new JLabel("Step 2: ");
	    step2.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step2, BorderLayout.WEST);
	    JButton step2Left = new JButton();
	    step2Left.setText("<html>Add the ingredients according to the photo. <br>Add ingredients carefully!</html>");
	    step2Left.setBackground(Color.WHITE);
	    step2Left.setEnabled(false);
	    panel.add(step2Left, BorderLayout.EAST);
	    
	    JLabel step3 = new JLabel("Step 3: ");
	    step3.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step3, BorderLayout.WEST);
	    JButton step3Left = new JButton();
	    step3Left.setText("Submit your dish for judging!");
	    step3Left.setBackground(Color.WHITE);
	    step3Left.setEnabled(false);
	    panel.add(step3Left, BorderLayout.EAST);
	    
	    JLabel step4 = new JLabel("Step 4: ");
	    step4.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step4, BorderLayout.WEST);
	    JButton step4Left = new JButton();
	    step4Left.setText("<html>Get your score! <br>Make sure you remember the code you find! You'll<br>need it to unlock the vault</html>");
	    step4Left.setBackground(Color.WHITE);
	    step4Left.setEnabled(false);
	    panel.add(step4Left, BorderLayout.EAST);
	    
	    JButton dismiss = new JButton();
	    dismiss.setText("Dismiss");
	    dismiss.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    dismiss.setBackground(new Color(191, 192, 192));
	    dismiss.addActionListener(this);;
	    this.add(dismiss);
	    
	    main.add(panel);
		
		Container c = getContentPane();
		c.add(header, BorderLayout.BEFORE_FIRST_LINE);
		c.add(main, BorderLayout.CENTER);
		c.add(dismiss, BorderLayout.AFTER_LAST_LINE);
	}
	//Returns the main panel for switching cards and pages
	public static Container getBody() {
		return main;
	}

	@Override
	//closes the page and goes back to the home page
	public void actionPerformed(ActionEvent e) {
		System.out.println("Help menu was closed");
		
		Home window = new Home();
		window.setBounds(50,50, 1000,900);
		window.setBackground(new Color(211,211,211));
		window.setVisible(true);
		window.setIconImage(Main.getIcon());
		
		setVisible(false);
	    dispose();
	}
}