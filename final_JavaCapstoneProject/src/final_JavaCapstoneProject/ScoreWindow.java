<<<<<<< Updated upstream
//Author: Kevin Choi
//Date: 5/22/2021 
//Revision 08
=======
//Author: Kamran Hussain
//Date: 05/23/21
//Rev 01
>>>>>>> Stashed changes

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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class ScoreWindow extends JFrame implements ActionListener{
<<<<<<< Updated upstream
	//fields
	private JButton home;
	private JButton star1;
	private JPanel main;
	//constructor 
	public ScoreWindow() {
		super("How Good is Your Dish?");//title text
		
=======
	//Buttons needed for the page.
	private JButton home;
	private JButton star1;
	private JPanel main;
	//Constructor with the page content
	public ScoreWindow() {
		super("How Good is Your Dish?");
		//The main panel is instantiated. It contains the layout needed for the page
>>>>>>> Stashed changes
		main = new JPanel();
		GridLayout layout = new GridLayout(1,5);
		layout.setHgap(5);
		main.setLayout(layout);
		main.setBackground(new Color(211,211,211));
<<<<<<< Updated upstream
		
		JPanel header = new JPanel();//"How Good is Your Dish?" is the header
=======
		//The header with the score from the Scorer class
		JPanel header = new JPanel();
>>>>>>> Stashed changes
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Your Dish Gets: " + Scorer.getScore() + "/5");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    //The Icon for the star buttons
	    ImageIcon star = new ImageIcon("Resources/star1.png");
<<<<<<< Updated upstream
	   //for loop that adds the stars on the screen representing the score.
=======
	    //The loop automatically creates the number of stars needed based on the score provided by the Scorer
>>>>>>> Stashed changes
	    for (int i = 0; i<Scorer.getScore(); i++) {
	    	star1 = new JButton();
		    star1.setBackground(Color.WHITE);
		    star1.setIcon(star);
		    star1.addActionListener(this);
		    this.add(star1);
		    main.add(star1);
	    }
<<<<<<< Updated upstream
	    //if loops unlocks the vault code after the game finishes scoring 
=======
	    //The footer for the class that includes the passcode enter button
>>>>>>> Stashed changes
	    JPanel footer = new JPanel();
	    JLabel passcode = new JLabel();
	    if(Scorer.getLevel() == "sandwich"); {
	    	passcode.setText("Part of Vault Code: 213");
	    }
	    if(Scorer.getLevel() == "pizza") {
	    	passcode.setText("Part of Vault Code: 426");
	    }
	    if(Scorer.getLevel() == "pho") {
	    	passcode.setText("part of Vault Code: 960");
	    }
	    footer.add(passcode);
	    //creates the button
	    home = new JButton();
	    home.setText("Home");
	    home.setEnabled(true);
	    home.addActionListener(this);
	    this.add(home);
	    footer.add(home);
	    //adds everything to the window
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
		
	}
	//Method
	@Override
	//enters the vault if the password is right.
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			System.out.println("Woohoo! Never Gonna give you up \n never gonna let you down...");
			Home window = new Home();
			window.setBounds(50, 50, 1000, 900);
	    	window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	window.setIconImage(Main.getIcon());
	    	
	    	dispose();
	    	setVisible(false);
		}
	}
}
