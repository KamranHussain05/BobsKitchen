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
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class Home extends JFrame implements ActionListener {
	
	private JButton sandwich;
	private JButton burger;
	private JButton pancake;
	private JButton ramen;
	private JButton beefWellington;
	private JButton help;

	public Home() {
		super("Bob's Kitchen");
		
		JPanel main = new JPanel();
		GridLayout mainLayout = new GridLayout(2, 3);
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
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
		
		ImageIcon sandwichImage = new ImageIcon("Resources/sandwich.png");
		sandwich = new JButton();
		sandwich.setIcon(sandwichImage);
		sandwich.setHorizontalAlignment(JButton.CENTER);
		sandwich.setBackground(new Color(191,192,192));
		sandwich.addActionListener(this);
		this.add(sandwich);
		main.add(sandwich);
		
		ImageIcon burgerImage = new ImageIcon("Resources/burger.png");
		burger = new JButton();
		burger.setIcon(burgerImage);
		burger.setHorizontalAlignment(JButton.CENTER);
		burger.setBackground(new Color(191,192,192));
		burger.addActionListener(this);;
		this.add(burger);
		main.add(burger);
		
		ImageIcon pancakeImage = new ImageIcon("Resources/pancake.png");
		pancake = new JButton();
		pancake.setIcon(pancakeImage);
		pancake.setHorizontalAlignment(JButton.CENTER);
		pancake.setBackground(new Color(191,192,192));
		pancake.addActionListener(this);;
		this.add(pancake);
		main.add(pancake);
		
		ImageIcon ramenImage = new ImageIcon("Resources/ramen.png");
		ramen = new JButton();
		ramen.setIcon(ramenImage);
		ramen.setHorizontalAlignment(JButton.CENTER);
		ramen.setBackground(new Color(191,192,192));
		ramen.addActionListener(this);;
		this.add(ramen);
		main.add(ramen);
		
		ImageIcon wellingtonImage = new ImageIcon("Resources/beefwellington.png");
		beefWellington = new JButton();
		beefWellington.setIcon(wellingtonImage);
		beefWellington.setHorizontalAlignment(JButton.CENTER);
		beefWellington.setBackground(new Color(191,192,192));
		beefWellington.addActionListener(this);;
		this.add(beefWellington);
		main.add(beefWellington);
		
	    help = new JButton();
	    help.setText("Help!");
	    help.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    help.setBackground(new Color(191, 192, 192));
	    help.addActionListener(this);;
	    this.add(help);
		
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(help, BorderLayout.AFTER_LAST_LINE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sandwich) {
			System.out.println("Level 1, Sandwich, was selected");
		}
		if(e.getSource() == burger) {
			System.out.println("Level 2, Burger, was selected");
			
		}
		if(e.getSource() == pancake) {
			System.out.println("Level 3, Souffle Pancake, was selected");
			
		}
		if(e.getSource() == ramen) {
			System.out.println("Level 4, Waygu Ramen, was selected");
			
		}
		if(e.getSource() == beefWellington) {
			System.out.println("Level 5, Beef Wellington, was selected");
		}
		if(e.getSource() == help) {
			System.out.println("Help was selected");
			
		}
	}

}
