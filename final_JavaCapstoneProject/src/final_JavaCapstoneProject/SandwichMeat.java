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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class SandwichMeat extends JFrame implements ActionListener{
	//fields contain the images and navigation
	private JButton turkey;
	private JButton pork;
	private JButton beef; 
	private JButton bacon;
	private JButton none;
	private JButton back;
	private JButton next;
	private static String meat;
	private static JPanel main;

	public SandwichMeat() {
		super("Level 1: Sandwich");
		//main panel is instantiated and layout is set.
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
	    title.setText("Select Type of Meat");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    //*********************************************************************************
	    //this panel contains the top turkey and pork panels for formatting
	    JPanel topButtons = new JPanel();
	    GridLayout topLayout = new GridLayout(1,2);
	    topButtons.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		topLayout.setVgap(5);
		topLayout.setHgap(5);
		topButtons.setLayout(topLayout);
		topButtons.setBackground(new Color(200,200,200));
	    //button is instantiated, enabled, and activated with the corresponding image.
	    ImageIcon turkeyImage = new ImageIcon("Resources/turkey.png");
		turkey = new JButton();
		turkey.setIcon(turkeyImage);
		turkey.setHorizontalAlignment(JButton.CENTER);
		turkey.setBackground(Color.WHITE);
		turkey.addActionListener(this);
		this.add(turkey);
		topButtons.add(turkey);
		
		//button is instantiated, enabled, and activated with the corresponding image.r
		ImageIcon porkImage = new ImageIcon("Resources/pork.png");
		pork = new JButton();
		pork.setIcon(porkImage);
		pork.setHorizontalAlignment(JButton.CENTER);
		pork.setBackground(Color.WHITE);
		pork.addActionListener(this);;
		this.add(pork);
		topButtons.add(pork);
		//lower three buttons are added here to keep a consistent layout.
		JPanel lowButtons = new JPanel();
	    GridLayout lowLayout = new GridLayout(1,3);
	    lowButtons.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		lowLayout.setVgap(5);
		lowLayout.setHgap(5);
		lowButtons.setLayout(lowLayout);
		lowButtons.setBackground(new Color(200,200,200));
		
		//button is instantiated, enabled, and activated with the corresponding image.
		ImageIcon steakImage = new ImageIcon("Resources/steak.png");
		beef = new JButton();
		beef.setIcon(steakImage);
		beef.setHorizontalAlignment(JButton.CENTER);
		beef.setBackground(Color.WHITE);
		beef.addActionListener(this);;
		this.add(beef);
		lowButtons.add(beef);
		//button is instantiated, enabled, and activated with the corresponding image.
		ImageIcon baconImage = new ImageIcon("Resources/bacon.png");
		bacon = new JButton();
		bacon.setIcon(baconImage);
		bacon.setHorizontalAlignment(JButton.CENTER);
		bacon.setBackground(Color.WHITE);
		bacon.addActionListener(this);
		this.add(bacon);
		lowButtons.add(bacon);
		//button is instantiated, enabled, and activated with the corresponding image.
		ImageIcon noneImage = new ImageIcon("Resources/none.png");
		none = new JButton();
		none.setIcon(noneImage);
		none.setHorizontalAlignment(JButton.CENTER);
		none.setBackground(Color.WHITE);
		none.addActionListener(this);
		this.add(none);
		lowButtons.add(none);
		//panels and their content are added to the main panel.
		main.add(topButtons);
		main.add(lowButtons);
	    //footer contains the navigation for pages
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
	    next.addActionListener(this);
	    this.add(next);
	    footer.add(back, BorderLayout.EAST);
	    footer.add(next, BorderLayout.WEST);
//content is added to the frames content pane.
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	//returns the main panel and all of the content when called.
	public static Container getBody() {
		return main;
	}

	@Override
	//determines what to do when a button is pressed
	public void actionPerformed(ActionEvent e) {
		//these statements store the user selected option in a string.
		if(e.getSource() == turkey) { 
			System.out.println("Turkey Meat selected");
			meat = "turkey";
			pork.setEnabled(false);
			bacon.setEnabled(false);
			beef.setEnabled(false);
			none.setEnabled(false);
		}
		if(e.getSource() == pork) {
			System.out.println("pork Meat selected");
			meat = "pork";
			turkey.setEnabled(false);
			bacon.setEnabled(false);
			beef.setEnabled(false);
			none.setEnabled(false);
		}
		if(e.getSource() == beef) {
			System.out.println("Beef meat Selected");
			meat = "beef";
			pork.setEnabled(false);
			bacon.setEnabled(false);
			turkey.setEnabled(false);
			none.setEnabled(false);
		}
		if(e.getSource() == bacon) {
			System.out.println("Bacon Meat selected");
			meat = "bacon";
			pork.setEnabled(false);
			turkey.setEnabled(false);
			beef.setEnabled(false);
			none.setEnabled(false);
		}
		if(e.getSource() == none) {
			System.out.println("No Meat selected");
			meat = "none";
			pork.setEnabled(false);
			turkey.setEnabled(false);
			beef.setEnabled(false);
			bacon.setEnabled(false);
		}
		if(e.getSource() == back) { //goes to the previous page.
			System.out.println("back selected");
			SandwichVeggies back = new SandwichVeggies();
			back.setBounds(50,50,1000,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) { //goes to the next page.
			System.out.println("next selected");
			SandwichCondiments next = new SandwichCondiments();
			next.setBounds(50,50,1000,900);
			next.setBackground(new Color(211,211,211));
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
	}
	//returns the user selected choice.
	public static String getMeat() {
		return meat;
	}
}
