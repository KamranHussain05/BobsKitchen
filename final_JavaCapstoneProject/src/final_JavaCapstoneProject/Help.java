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

	public Help() {
		super("How to Play!");
		
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
	    
	    JLabel step1 = new JLabel("Step 1: ");
	    step1.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step1, BorderLayout.WEST);
	    JButton step1Left = new JButton();
	    step1Left.setText("<html>Select a dish to make! <br> Each level up is a harder dish!</html>");
	    step1Left.setBackground(Color.gray);
	    step1Left.setEnabled(false);
	    panel.add(step1Left, BorderLayout.EAST);
	    
	    JLabel step2 = new JLabel("Step 2: ");
	    step2.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step2, BorderLayout.WEST);
	    JButton step2Left = new JButton();
	    step2Left.setText("<html>Add your touch to the food! <br>Add ingredients and amounts!</html>");
	    step2Left.setBackground(Color.gray);
	    step2Left.setEnabled(false);
	    panel.add(step2Left, BorderLayout.EAST);
	    
	    JLabel step3 = new JLabel("Step 3: ");
	    step3.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step3, BorderLayout.WEST);
	    JButton step3Left = new JButton();
	    step3Left.setText("Submit your dish for judging!");
	    step3Left.setBackground(Color.gray);
	    step3Left.setEnabled(false);
	    panel.add(step3Left, BorderLayout.EAST);
	    
	    JLabel step4 = new JLabel("Step 4: ");
	    step4.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(step4, BorderLayout.WEST);
	    JButton step4Left = new JButton();
	    step4Left.setText("<html>Get your score! <br>Can you make a better dish next time?</html>");
	    step4Left.setBackground(Color.gray);
	    step4Left.setEnabled(false);
	    panel.add(step4Left, BorderLayout.EAST);
	    
	    JButton dismiss = new JButton();
	    dismiss.setText("Dismiss");
	    dismiss.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    dismiss.setBackground(new Color(191, 192, 192));
	    dismiss.addActionListener(this);;
	    this.add(dismiss);
		
		Container c = getContentPane();
		c.add(header, BorderLayout.BEFORE_FIRST_LINE);
		c.add(panel, BorderLayout.CENTER);
		c.add(dismiss, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
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