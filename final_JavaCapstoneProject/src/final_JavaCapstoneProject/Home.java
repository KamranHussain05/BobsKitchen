//Author: Kamran Hussain
//Date: 5/23/21
//Rev 01 - Contains 5 dishes and 5 buttons
//Rev 02 - Contains 5 altered dishes, 6 buttons with help
//rev 03 - changed to 4 buttons and 4 levels with one help button on the botton
//rev 04 - size was changed to be more friendly for screens below 1080x1920 resolution

package final_JavaCapstoneProject;

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
public class Home extends JFrame implements ActionListener {
	
	//fields that instantiate all the necessary buttons and cross class elements.
	private JButton sandwich;
	private JButton pizza;
	private JButton pho;
	private JButton cake;
	private JButton help;
	private static JPanel main;

	//Constructor that adds all the elements to the home window.
	public Home() {
		super("Bob's Kitchen");
		
		//Base panel where all content is overlayed. The main panel is called to switch pages accross all classes.
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(2, 1);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Bob's Kitchen!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
		//JPanel that contains the top 2 buttons in the gui
	    JPanel topButtons = new JPanel();
	    GridLayout topLayout = new GridLayout(1,2);
	    topButtons.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		topLayout.setVgap(5);
		topLayout.setHgap(5);
		topButtons.setLayout(topLayout);
		topButtons.setBackground(new Color(200,200,200));
	    
	    //Level 1, make a sandwich
		ImageIcon sandwichImage = new ImageIcon("Resources/sandwichthumbnail.png");
		sandwich = new JButton();
		sandwich.setIcon(sandwichImage);
		sandwich.setHorizontalAlignment(JButton.CENTER);
		sandwich.setBackground(Color.WHITE);
		sandwich.addActionListener(this);
		this.add(sandwich);
		topButtons.add(sandwich);
		//Level 2, make a pizza
		ImageIcon pizzaImage = new ImageIcon("Resources/pizzathumbnail.png");
		pizza = new JButton();
		pizza.setIcon(pizzaImage);
		pizza.setHorizontalAlignment(JButton.CENTER);
		pizza.setBackground(Color.WHITE);
		pizza.addActionListener(this);;
		this.add(pizza);
		topButtons.add(pizza);
		//JPanel that contains the botton 2 buttons in the gui
		JPanel lowerButtons = new JPanel();
	    GridLayout lowerLayout = new GridLayout(1,2);
	    lowerButtons.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		lowerLayout.setVgap(5);
		lowerLayout.setHgap(5);
		lowerButtons.setLayout(lowerLayout);
		lowerButtons.setBackground(new Color(200,200,200));
		
		//Level 3, make pho 
		ImageIcon phoImage = new ImageIcon("Resources/phothumbnail.png");
		pho = new JButton();
		pho.setIcon(phoImage);
		pho.setHorizontalAlignment(JButton.CENTER);
		pho.setBackground(Color.WHITE);
		pho.addActionListener(this);;
		this.add(pho);
		lowerButtons.add(pho);
		//Originally make a cake, adapted to Bob's secret/disguised vault. 
		ImageIcon cakeImage = new ImageIcon("Resources/cakethumbnail.png");
		cake = new JButton();
		cake.setIcon(cakeImage);
		cake.setHorizontalAlignment(JButton.CENTER);
		cake.setBackground(Color.WHITE);
		cake.addActionListener(this);
		this.add(cake);
		lowerButtons.add(cake);
		//creates and adds the help button to enter the help menu.
	    help = new JButton();
	    help.setText("Help!");
	    help.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    help.setBackground(new Color(191, 192, 192));
	    help.addActionListener(this);;
	    this.add(help);
	    //adds the button panels to the main panel
	    main.add(topButtons);
	    main.add(lowerButtons);
		//adds all the content to the content pane on the window.
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(help, BorderLayout.AFTER_LAST_LINE);
	}
//returns the main panel to switch the page.
	public static Container getBody() {
		return main;
	}

	@Override
	//Checks the source of a button press to switch the page to that levels start
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sandwich) { //switches to the sandwich page when the sandwich button is pressed
			System.out.println("Level 1, Sandwich, was selected");
			
			SandwichType next = new SandwichType();
			next.setBounds(50,50, 1000,900);
			next.setBackground(new Color(211,211,211));
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
			
//			CardLayoutDemo.c1.show(CardLayoutDemo.cards, CardLayoutDemo.next);
		}
		if(e.getSource() == pizza) { //switches to the pizza page when the pizza button is pressed
			System.out.println("Level 2, Pizza, was selected");
			
			PizzaStyle next = new PizzaStyle();
			next.setBounds(50,50, 1000,900);
			next.setBackground(new Color(211,211,211));
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == pho) { //switches to the pho page when the pho button is pressed
			System.out.println("Level 4, Waygu Ramen, was selected");
			BobsVault next = new BobsVault();
			next.setBounds(50,50, 1000,900);
			next.setBackground(new Color(211,211,211));
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == cake) { //the disguise for the vault, switches to the vault passcode when cake is pressed.
			System.out.println("Level 5, Beef pho, was selected");
			BobsVault next = new BobsVault();
			next.setBounds(50,50, 1000,900);
			next.setBackground(new Color(211,211,211));
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == help) { //opens the help page when the help button is pressed.
			System.out.println("Help was selected");
			Help help = new Help();
			help.setBounds(50,50,1000,900);
			help.setBackground(new Color(211, 211, 211));
			help.setVisible(true);
			help.setResizable(false);
			help.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
	}

}
