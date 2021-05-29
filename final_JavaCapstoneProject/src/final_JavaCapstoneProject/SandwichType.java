package final_JavaCapstoneProject;

//Author: Kamran Hussain
//Date: 5/22/2021
//Revision 08

import java.awt.BorderLayout;
import java.awt.Color;
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
public class SandwichType extends JFrame implements ActionListener{
//static variables are returnable, otheres are displayed on the panel.
	private static JButton grilledCheese;
	private JButton blt;
	private JButton banhmi;
	private JButton back;
	private JButton next;
	private static JPanel main;
	private static String sandwichType;
	
	public SandwichType() {
		super("Bob's Kitchen, Level 1");
		//main panel is instantiated
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 3);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		//header contains instructions for the page.
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Select Type of Sandwich, you can only choose once!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	  //*********************************************************************************
	    //button is instantiated, enabled and activated with its corresponding image
	    ImageIcon grilledCheeseImage = new ImageIcon("Resources/grilledcheese.png");
		grilledCheese = new JButton();
		grilledCheese.setIcon(grilledCheeseImage);
		grilledCheese.setHorizontalAlignment(JButton.CENTER);
		grilledCheese.setBackground(Color.WHITE);
		grilledCheese.addActionListener(this);
		this.add(grilledCheese);
		
		//button is instantiated, enabled and activated with its corresponding image
		ImageIcon bltImage = new ImageIcon("Resources/blt.png");
		blt = new JButton();
		blt.setIcon(bltImage);
		blt.setHorizontalAlignment(JButton.CENTER);
		blt.setBackground(Color.WHITE);
		blt.addActionListener(this);;
		this.add(blt);
		
		//button is instantiated, enabled and activated with its corresponding image
		ImageIcon banhmiImage = new ImageIcon("Resources/banhmi.png");
		banhmi = new JButton();
		banhmi.setIcon(banhmiImage);
		banhmi.setHorizontalAlignment(JButton.CENTER);
		banhmi.setBackground(Color.WHITE);
		banhmi.addActionListener(this);;
		this.add(banhmi);
		//buttons are added to the main panel.
		main.add(grilledCheese);
		main.add(blt);
		main.add(banhmi);
	    //footer contains navigation
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
//content is added to the frams content pane.
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
		
	}
	//returns the main panel and all of its elements when called.
	public static Container getBody() {
		return main;	
	}

	@Override
	//determines what to do when a button is pressed.
	public void actionPerformed(ActionEvent e) {
		//determines what is selected and stores the choice in the string.
		if(e.getSource() == getGrilledCheese()) {
			System.out.println("Grilled Cheese Style selected");
			sandwichType = "grilled cheese";
			blt.setEnabled(false);
			banhmi.setEnabled(false);
		}
		if(e.getSource() == blt) {
			System.out.println("BLT Style Selected");
			sandwichType = "blt";
			getGrilledCheese().setEnabled(false);
			banhmi.setEnabled(false);
		}
		if(e.getSource() == banhmi) {
			System.out.println("banhmi");
			sandwichType = "banhmi";
			blt.setEnabled(false);
			getGrilledCheese().setEnabled(false);
		}
		if(e.getSource() == next) { //goes to the next page
			System.out.println("Next Button Selected");
			SandwichBread window = new SandwichBread();
			window.setBounds(50,50, 1000,900);
			window.setBackground(new Color(211,211,211));
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == back) { //goes to the previous page
			System.out.println("Back Button Selected");
			Home confirm = new Home();
			confirm.setBounds(50, 50, 1000,900);
			confirm.setBackground(new Color(211,211,211));
	    	confirm.setVisible(true);
	    	confirm.setIconImage(Main.getIcon());

	    	setVisible(false);
	    	dispose();
		}
	}
	//returns the user chosen selection when called. Submitted to scorer on submit in finish page.
	public static String getSandwichStyle() {
		return sandwichType;
	}

	public static JButton getGrilledCheese() {
		return grilledCheese;
	}

}
