//Author: Kamran Hussain
//Date: 5/22/2021
//Revision 08
package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class SandwichBread extends CardLayoutDemo {

	//Fields, navigation and buttons for gui
	private JButton back;
	private JButton next;
	private JButton whiteBread;
	private JButton baguette;
	private JButton garlicBread;
	private static String breadType; //static vars are needed for calling from other classses
	private static JPanel main;

	//Constructor
	public SandwichBread() {
		//instantiates the main panel and sets its layout
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 3);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Select Type of Bread");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    //*********************************************************************************
	    //Button is instantiated, activated, and enabled with image
	    ImageIcon whiteBreadImage = new ImageIcon("Resources/whitebread.png");
		whiteBread = new JButton();
		whiteBread.setIcon(whiteBreadImage);
		whiteBread.setHorizontalAlignment(JButton.CENTER);
		whiteBread.setBackground(Color.WHITE);
		whiteBread.addActionListener(this);
		this.add(whiteBread);
//button is instantiated, actived, and enabled with image
		ImageIcon baguetteImage = new ImageIcon("Resources/baguette.png");
		baguette = new JButton();
		baguette.setIcon(baguetteImage);
		baguette.setHorizontalAlignment(JButton.CENTER);
		baguette.setBackground(Color.WHITE);
		baguette.addActionListener(this);;
		this.add(baguette);
//button is instantiated, activated, and enabled with image.
		ImageIcon garlicBreadImage = new ImageIcon("Resources/garlicbread.png");
		garlicBread = new JButton();
		garlicBread.setIcon(garlicBreadImage);
		garlicBread.setHorizontalAlignment(JButton.CENTER);
		garlicBread.setBackground(Color.WHITE);
		garlicBread.addActionListener(this);;
		this.add(garlicBread);
		main.add(whiteBread);
		main.add(baguette);
		main.add(garlicBread);
	   //footer contains naviation 
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
//content is added to frame pane
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	//returns the main panel with all of its content.
	public static Component getBody() {
		return main;
	}

	@Override
	//determines what to do after a button is pressed
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) { //goes to the previous page.
			System.out.println("Back button pressed");
			
			SandwichType window = new SandwichType();
			window.setBounds(50, 50, 1000,900);
			window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setIconImage(Main.getIcon());
	    	
	    	setVisible(false);
	    	dispose();
		}
		if(e.getSource() == next) { //goes to the next page
			System.out.println("Next button pressed");
			SandwichVeggies nextWindow = new SandwichVeggies();
			nextWindow.setBounds(50,50, 1000,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		//Breads *********************************************************************
		//stores the type of bread selected as a string corresponding to the button selected.
		if(e.getSource() == whiteBread) {
			System.out.println("White Bread Selected");
			breadType = "White Bread";
			whiteBread.setBackground(new Color(211,211,211));
			baguette.setEnabled(false);
			garlicBread.setEnabled(false);
		}
		if(e.getSource() == baguette) {
			System.out.println("Sweet Bread Selected");
			breadType = "Baguette";
			baguette.setBackground(new Color(211,211,211));
			whiteBread.setEnabled(false);
			garlicBread.setEnabled(false);
		}
		if(e.getSource() == garlicBread) {
			System.out.println("Garlic Bread");
			breadType = "Garlic Bread";
			garlicBread.setBackground(new Color(211,211,211));
			whiteBread.setEnabled(false);
			baguette.setEnabled(false);
		}
	}
	
	//returns the string for the type of bread
	public static String getBread() {
		return breadType;
	}

}
