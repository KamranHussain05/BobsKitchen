package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ScoreWindow extends JFrame implements ActionListener{
	
	private JButton home;
	private JButton star1;
	private JPanel main;
	
	public ScoreWindow() {
		super("How Good is Your Sandwich?");
		
		main = new JPanel();
		GridLayout layout = new GridLayout(1,5);
		layout.setHgap(5);
		main.setLayout(layout);
		main.setBackground(new Color(211,211,211));
		
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Your Sandwich Gets: " + Scorer.getScore() + "/5");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    ImageIcon star = new ImageIcon("Resources/star1.png");
	   
	    for (int i = 0; i<Scorer.getScore(); i++) {
	    	star1 = new JButton();
		    star1.setBackground(Color.WHITE);
		    star1.setIcon(star);
		    star1.addActionListener(this);
		    this.add(star1);
		    main.add(star1);
	    }
	    
	    JPanel footer = new JPanel();
	    home = new JButton();
	    home.setText("Home");
	    home.setEnabled(true);
	    home.addActionListener(this);
	    this.add(home);
	    footer.add(home);

		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			System.out.println("Woohoo! Never Gonna give you up \n never gonna let you down...");
			Home window = new Home();
			window.setBounds(50, 50, 1440, 900);
	    	window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	window.setIconImage(Main.getIcon());
	    	
	    	dispose();
	    	setVisible(false);
		}
		if(e.getSource() == star1) {
			ImageIcon surprise = new ImageIcon("Resources/prize.gif");
			star1.setIcon(surprise);
			
			refresh();
		}
	}

	private void refresh() {
		main.add(star1);
	}
}
