//Author: Kamran Hussain
//Date: 5/23/21
//Rev01
//Notes: adapted from Pizza Type

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
public class PhoNoodles extends JFrame implements ActionListener {
//fields include the navigation and images
	private JButton back;
	private JButton next;
	private JButton glassNoodles;
	private JButton vermicelli;
	private static JPanel main; //static variables are returned to other classes
	private static String noodles;
//the constructor constructs the gui and adds all its elements
	public PhoNoodles() {
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
	    title.setText("Select Type of Noodles");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    //the glass noodle button with its overlayed image
	    ImageIcon glassNoodleImage = new ImageIcon("Resources/glassnoodle.png");
		glassNoodles = new JButton();
		glassNoodles.setIcon(glassNoodleImage);
		glassNoodles.setHorizontalAlignment(JButton.CENTER);
		glassNoodles.setBackground(Color.WHITE);
		glassNoodles.addActionListener(this);
		this.add(glassNoodles);
		main.add(glassNoodles);
		//the vermicelli noodle button with its overlayed image
		ImageIcon vermicelliImage = new ImageIcon("Resources/vermicelli.png");
		vermicelli = new JButton();
		vermicelli.setIcon(vermicelliImage);
		vermicelli.setHorizontalAlignment(JButton.CENTER);
		vermicelli.setBackground(Color.WHITE);
		vermicelli.addActionListener(this);;
		this.add(vermicelli);
		main.add(vermicelli);
	    //the footer panel with navigation
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
//the content is added to the content pane of the window
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	//returns the main panel and its content
	public static Container getBody() {
		return main;
	}

	@Override
	//tests where the button is pressed and stores data in the export string
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("Back button pressed"); //opens the previous page
			
			PhoMeat window = new PhoMeat();
			window.setBounds(50, 50, 1000,900);
			window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setIconImage(Main.getIcon());
	    	
	    	setVisible(false);
	    	dispose();
		}
		if(e.getSource() == next) {
			System.out.println("Next button pressed"); //opens the next page
			PhoToppings nextWindow = new PhoToppings();
			nextWindow.setBounds(50,50, 1000,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		if(e.getSource() == glassNoodles) { //identifies the glass noodle is pressed and stores it in the noodles string to be export to the scorer
			System.out.println("Glass Noodles Selected");
			noodles = "glass noodles";
			vermicelli.setEnabled(false);
		}
		if(e.getSource() == vermicelli) { //identifies the vermicelli noodle is pressed and stores it in the noodles string to be export to the scorer
			System.out.println("Vermicelli Noodles Selected");
			noodles = "vermicelli";
			vermicelli.setEnabled(false);
		}
	}

	public static String getNoodles() { //the static method that sends the noodle type to the scorer at the submit page.
		return noodles;
	}
}
