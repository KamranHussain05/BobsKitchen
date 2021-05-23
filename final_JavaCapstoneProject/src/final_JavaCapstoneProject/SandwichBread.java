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

	//Fields
	private JButton back;
	private JButton next;
	private JButton whiteBread;
	private JButton baguette;
	private JButton garlicBread;
	private static String breadType;
	private static JPanel main;

	//Constructor
	public SandwichBread() {
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
	    ImageIcon whiteBreadImage = new ImageIcon("Resources/whitebread.png");
		whiteBread = new JButton();
		whiteBread.setIcon(whiteBreadImage);
		whiteBread.setHorizontalAlignment(JButton.CENTER);
		whiteBread.setBackground(Color.WHITE);
		whiteBread.addActionListener(this);
		this.add(whiteBread);

		ImageIcon baguetteImage = new ImageIcon("Resources/baguette.png");
		baguette = new JButton();
		baguette.setIcon(baguetteImage);
		baguette.setHorizontalAlignment(JButton.CENTER);
		baguette.setBackground(Color.WHITE);
		baguette.addActionListener(this);;
		this.add(baguette);

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

		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	
	public static Component getBody() {
		return main;
	}

	@Override
	//Method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("Back button pressed");
			
			SandwichType window = new SandwichType();
			window.setBounds(500, 500, 300,200);
			window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setIconImage(Main.getIcon());
	    	
	    	setVisible(false);
	    	dispose();
		}
		if(e.getSource() == next) {
			System.out.println("Next button pressed");
			SandwichVeggies nextWindow = new SandwichVeggies();
			nextWindow.setBounds(50,50, 1440,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		//Breads *********************************************************************
		if(e.getSource() == whiteBread) {
			System.out.println("White Bread Selected");
			breadType = "White Bread";
			whiteBread.setBackground(new Color(211,211,211));
			baguette.setEnabled(false);
			garlicBread.setEnabled(false);
		}
		if(e.getSource() == baguette) {
			System.out.println("Sweet Bread Selected");
			breadType = "Sweet Bread";
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
	
	//Method
	public static String getBread() {
		return breadType;
	}

}
