//Author: Kamran Hussain
//Date: 5/23/21
//Rev 01
//Notes: Adapted from Pho Stock

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
public class PhoStyle extends JFrame implements ActionListener {
	//fields include the displayed buttons and the navigation buttons 
	private JButton back;
	private JButton next;
	private JButton veggie;
	private JButton chicken;
	private JButton beef;
	private static JPanel main; //static variables are sent to other classes and content is accessed
	private static String phoType;
//constructor constructs the gui on the main panel
	public PhoStyle() {
		super("Bob's Kitchen");
		//main panel is instantiated
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 3);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		//header panel with instructions
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Select Type of Pho, you can only choose once!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	  //*********************************************************************************
	  //displays, instantiates, and activates the veggie pho type button with its corresponding
	    ImageIcon veggiePhoImage = new ImageIcon("Resources/veggiepho.png"); 
	    veggie = new JButton();
		veggie.setIcon(veggiePhoImage);
		veggie.setHorizontalAlignment(JButton.CENTER);
		veggie.setBackground(Color.WHITE);
		veggie.addActionListener(this);
		this.add(veggie);
		
		//instantiates, displays, and activated the beef pho type button with its corresponding image
		ImageIcon beefPhoImage = new ImageIcon("Resources/beefpho.png");
		beef = new JButton();
		beef.setIcon(beefPhoImage);
		beef.setHorizontalAlignment(JButton.CENTER);
		beef.setBackground(Color.WHITE);
		beef.addActionListener(this);;
		this.add(beef);
		
		//instantiates, displays, and activates the chicken pho type button with its corresponding image.
		ImageIcon chickenPhoImage = new ImageIcon("Resources/chickenpho.png");
		chicken = new JButton();
		chicken.setIcon(chickenPhoImage);
		chicken.setHorizontalAlignment(JButton.CENTER);
		chicken.setBackground(Color.WHITE);
		chicken.addActionListener(this);;
		this.add(chicken);
		//adds the buttons and their content to the main panel
		main.add(veggie);
		main.add(beef);
		main.add(chicken);
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
//adds the main panel, header and footer to the windows content pane
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	//returns the main panel and its content for page switching
	public static Container getBody() {
		return main;
	}

	@Override
	//called when a button is pressed and checks which button is pressed
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == next) { //goes to the next page
			System.out.println("Next Button Selected");
			PhoStock window = new PhoStock();
			window.setBounds(50,50, 1000,900);
			window.setBackground(new Color(211,211,211));
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == back) { //goes to the previous page.
			System.out.println("Back Button Selected");
			Home confirm = new Home();
			confirm.setBounds(500, 500, 1000, 900);
			confirm.setBackground(new Color(211,211,211));
	    	confirm.setVisible(true);
	    	confirm.setIconImage(Main.getIcon());
	    	
    		setVisible(false);
    		dispose();
		}
		//identify which button was pressed and correspondantly stores the value in the pho type string
		if(e.getSource() == veggie) {
			System.out.println("Veggie Pho Style selected");
			phoType = "veggie pho";
			beef.setEnabled(false);
			chicken.setEnabled(false);
		}
		if(e.getSource() == beef) {
			System.out.println("Beef Pho Style Selected");
			phoType = "beef pho";
			veggie.setEnabled(false);
			chicken.setEnabled(false);
		}
		if(e.getSource() == chicken) {
			System.out.println("Chicken Pho Style Selected");
			phoType = "chicken pho";
			beef.setEnabled(false);
			veggie.setEnabled(false);
		}
	}
	//returns the stored user choice to the pho finish and scorer classes.
	public static String getPhoType() {
		return phoType;
	}

}
