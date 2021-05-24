//Author: Kamran Hussain
//Date: 5/22/2021
//Revision 08
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial") class SandwichCondiments extends JFrame implements ActionListener {
//fields are used in navigation and displaying content.
	private JButton back;
	private JButton next;
	private JButton cheeseButton;
	private JButton sauceButton;
	private static String sauce;
	private static String cheese;
	private JComboBox<String> sauceOptions;
	private JComboBox<String> cheeseOptions;
	private static JPanel main;
	//various options for menus
	private String empty = "";
	private String mustard = "Honey Mustard";
	private String mayo = "Mayonnaise";
	private String ketchup = "Ketchup";
	private String dressing = "1000 Island Dressing";
	private String none = "None";
	
	private String cheddar = "Cheddar";
	private String mozzarella = "Mozzarella";
	private String provolone = "Provolone";
	private String american = "American";
	private String cream = "Cream Cheese";
	
	public SandwichCondiments() {
		super("Level 1: Sandwich");
		//main panel is instantiated.
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
	    title.setText("Add Sauce and Cheese");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    //panel that displays the sauce options
	    JPanel saucePanel = new JPanel();
		JTextPane sauce = new JTextPane();
		sauce.setText("Sauce");
		sauce.setFont(new Font("Montserrat", Font.PLAIN, 30));
		sauce.setEditable(false);
		saucePanel.add(sauce, BorderLayout.BEFORE_LINE_BEGINS);
		//button is used to display the image of the user chosen option
		sauceButton = new JButton();
		ImageIcon sauceImage = new ImageIcon("Resources/noimage.png");
		sauceButton.setBackground(Color.WHITE);
		sauceButton.setIcon(sauceImage);
		saucePanel.add(sauceButton, BorderLayout.CENTER);
		//the menu is instantiated and the options are added
		sauceOptions = new JComboBox<String>();
		sauceOptions.setEnabled(true);
		sauceOptions.addItem(empty);
		sauceOptions.addItem(mustard);
		sauceOptions.addItem(mayo);
		sauceOptions.addItem(ketchup);
		sauceOptions.addItem(dressing);
		sauceOptions.addItem(none);
		sauceOptions.addActionListener(this);
		saucePanel.add(sauceOptions, BorderLayout.AFTER_LAST_LINE);
		main.add(saucePanel);
		//the cheese panel hosts the cheese label, image, and menu
		JPanel cheesePanel = new JPanel();
		JTextPane cheese = new JTextPane();
		cheese.setText("Cheese");
		cheese.setFont(new Font("Montserrat", Font.PLAIN, 30));
		cheese.setEditable(false);
		cheesePanel.add(cheese, BorderLayout.NORTH);
		///the button is used to display the user selected choice image
		cheeseButton = new JButton();
		ImageIcon cheeseImage = new ImageIcon("Resources/noimage.png");
		cheeseButton.setIcon(cheeseImage);
		cheeseButton.setBackground(Color.WHITE);
		cheesePanel.add(cheeseButton, BorderLayout.CENTER);
		//the menu is instantiated and the options are added.
		cheeseOptions = new JComboBox<String>();
		cheeseOptions.setEnabled(true);
		cheeseOptions.addItem(empty);
		cheeseOptions.addItem(cheddar);
		cheeseOptions.addItem(mozzarella);
		cheeseOptions.addItem(provolone);
		cheeseOptions.addItem(american);
		cheeseOptions.addItem(cream);
		cheeseOptions.addItem(none);
		cheeseOptions.addActionListener(this);
		cheesePanel.add(cheeseOptions, BorderLayout.AFTER_LAST_LINE);
		main.add(cheesePanel);
	    //the footer contains navigation
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
//adds the panel contents to the frame content pane
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
		if(e.getSource() == back) { // goes to the previous page.
			System.out.println("back selected");
			SandwichMeat next = new SandwichMeat();
			next.setBounds(50,50,1000,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) { //goes to the next page
			System.out.println("next selected");
			SandwichFinish next = new SandwichFinish();
			next.setBounds(50,50,1000,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		} 
		
		//determines what the user selected and stores their choice in a string.
		if(sauceOptions.getSelectedItem() == empty) {
			System.out.println("Sauce item is unselected");
			ImageIcon emptyImage = new ImageIcon("Resources/none.png");
			sauceButton.setIcon(emptyImage);
		}
		if(sauceOptions.getSelectedItem() == mustard) {
			System.out.println("Honey Mustard selected");
			ImageIcon mustardImage = new ImageIcon("Resources/honeymustard.png");
			sauceButton.setIcon(mustardImage);
			sauce = "honey mustard";
		}
		if(sauceOptions.getSelectedItem() == mayo) {
			System.out.println("Mayo selected");
			ImageIcon mayoImage = new ImageIcon("Resources/mayonnaise.png");
			sauceButton.setIcon(mayoImage);
			sauce = "mayo";
		}
		if(sauceOptions.getSelectedItem() == ketchup) {
			System.out.println("Ketchup Selected");
			ImageIcon ketchupImage = new ImageIcon("Resources/ketchup.png");
			sauceButton.setIcon(ketchupImage);
			sauce = "ketchup";
		}
		if(sauceOptions.getSelectedItem() == dressing) {
			System.out.println("1000 Island Dressing selected");
			ImageIcon dressingImage = new ImageIcon("Resources/islanddressing.png");
			sauceButton.setIcon(dressingImage);
			sauce = "island dressing";
		}
		if(sauceOptions.getSelectedItem() == none) {
			System.out.println("No sauce selected");
			ImageIcon non = new ImageIcon("Resources/none.png");
			sauceButton.setIcon(non);
			sauce = "none";
		}
		
		//Switchers for the cheese
		if(cheeseOptions.getSelectedItem() == empty) {
			System.out.println("Cheese item is unselected");
			ImageIcon emptyImage = new ImageIcon("Resources/none.png");
			cheeseButton.setIcon(emptyImage);
		}
		if(cheeseOptions.getSelectedItem() == cheddar) {
			System.out.println("Cheddar selected");
			ImageIcon cheddarImage = new ImageIcon("Resources/chedder.png");
			cheeseButton.setIcon(cheddarImage);
			cheese = "cheddar";
		}
		if(cheeseOptions.getSelectedItem() == mozzarella) {
			System.out.println("Mozzarella selected");
			ImageIcon mozzarellaImage = new ImageIcon("Resources/mozzarella.png");
			cheeseButton.setIcon(mozzarellaImage);
			cheese = "mozzarella";
		}
		if(cheeseOptions.getSelectedItem() == provolone) {
			System.out.println("Provolone selected");
			ImageIcon provoloneImage = new ImageIcon("Resources/provolone.png");
			cheeseButton.setIcon(provoloneImage);
			cheese = "provolone";
		}
		if(cheeseOptions.getSelectedItem() == american) {
			System.out.println("American Selected");
			ImageIcon americanImage = new ImageIcon("Resources/american.png");
			cheeseButton.setIcon(americanImage);
			cheese = "american";
		}
		if(cheeseOptions.getSelectedItem() == cream) {
			System.out.println("Cream Cheese selected");
			ImageIcon creamImage = new ImageIcon("Resources/creamcheese.png");
			cheeseButton.setIcon(creamImage);
			cheese = "cream cheese";
		}
		if(cheeseOptions.getSelectedItem() == none) {
			System.out.println("No Cheese selected");
			ImageIcon non = new ImageIcon("Resources/none.png");
			cheeseButton.setIcon(non);
			cheese = "none";
		}
	}

	//returns the user chosen option when called.
	public static String getCheese() {
		return cheese;
	}
	
	public static String getSauce() {
		return sauce;
	}

}
