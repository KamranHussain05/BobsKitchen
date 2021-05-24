//Author: Kamran Hussain
//Date: 5/23/21
//Rev 01
//Notes: Adapted from Sandwich Type

package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PizzaStyle extends JFrame implements ActionListener { 
	//fields include string storage, navigation, main panel, and gui buttons
	private JButton newYork;
	private JButton neopolitan;
	private JButton back;
	private JButton next;
	private static String pizzaStyle;
	private static JPanel main;
//Constructor constructs and adds the gui 
	public PizzaStyle() {
		super("Bob's Kitchen");
		//instantiates the main panel
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 2);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Select Style of Pizza");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    //*********************************************************************************
	    //instantiates, activates, and enables the button with the corresponding image
	    ImageIcon newYorkImage = new ImageIcon("Resources/newYork.png");
		newYork = new JButton();
		newYork.setIcon(newYorkImage);
		newYork.setHorizontalAlignment(JButton.CENTER);
		newYork.setBackground(Color.WHITE);
		newYork.addActionListener(this);
		this.add(newYork);
		main.add(newYork);
		
		//instantiates, activates, and enables the button with the corresponding image
		ImageIcon neopolitanImage = new ImageIcon("Resources/neopolitan.png");
		neopolitan = new JButton();
		neopolitan.setIcon(neopolitanImage);
		neopolitan.setHorizontalAlignment(JButton.CENTER);
		neopolitan.setBackground(Color.WHITE);
		neopolitan.addActionListener(this);;
		this.add(neopolitan);
		main.add(neopolitan);
	    //the footer contains the navigation
	    JPanel footer = new JPanel();
	    back = new JButton();
	    back.setText("Back");
	    back.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    back.setBackground(new Color(191, 192, 192));
	    back.addActionListener(this);;
	    this.add(back);
	    
	    next = new JButton();
	    next.setText("Next");
	    next.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    next.setBackground(new Color(191, 192, 192));
	    next.addActionListener(this);;
	    this.add(next);
	    footer.add(back, BorderLayout.EAST);
	    footer.add(next, BorderLayout.WEST);
//adds the content to the content pane 
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	//returns the main panel with its elements
	public static Container getBody() {
		return main;
	}

	@Override
	//determines what to do when a button is pressed
	public void actionPerformed(ActionEvent e) {
		//these methods determine what button was pressed then store the user selected choice in a string
		if(e.getSource()==newYork) {
			System.out.println("New York Style Selected");
			neopolitan.setEnabled(false);
			pizzaStyle = "new york";
		}
		if(e.getSource()==neopolitan) {
			System.out.println("Neapolitan York Style Selected");
			newYork.setEnabled(false);
			pizzaStyle = "Neapolitan";
		}
		if(e.getSource() == back) { //goes to the previous page.
			System.out.println("Back button selected");
			
			Home window = new Home();
			window.setBounds(50,50,1000,900);
			window.setBackground(new Color(211,211,211));;
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) { //goes to the next page.
			System.out.println("Next button selected");
			
			PizzaDough window = new PizzaDough();
			window.setBounds(50,50,1000,900);
			window.setBackground(new Color(211,211,211));;
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
	}
	//returns the stored user choice in a string.
	public static String getPizzaType() {
		return pizzaStyle;
	}
}
