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
public class Home extends JFrame implements ActionListener {
	
	//fields
	final JButton sandwich;
	final JButton pizza;
	final JButton pho;
	final JButton cake;
	final JButton help;
	private static JPanel main;

	//Constructor
	public Home() {
		super("Bob's Kitchen");
		
		//Base panel where all content is overlayed
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

		ImageIcon pizzaImage = new ImageIcon("Resources/pizzathumbnail.png");
		pizza = new JButton();
		pizza.setIcon(pizzaImage);
		pizza.setHorizontalAlignment(JButton.CENTER);
		pizza.setBackground(Color.WHITE);
		pizza.addActionListener(this);;
		this.add(pizza);
		topButtons.add(pizza);
		
		JPanel lowerButtons = new JPanel();
	    GridLayout lowerLayout = new GridLayout(1,2);
	    lowerButtons.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		lowerLayout.setVgap(5);
		lowerLayout.setHgap(5);
		lowerButtons.setLayout(lowerLayout);
		lowerButtons.setBackground(new Color(200,200,200));
		
		//Level 3, 
		ImageIcon phoImage = new ImageIcon("Resources/phothumbnail.png");
		pho = new JButton();
		pho.setIcon(phoImage);
		pho.setHorizontalAlignment(JButton.CENTER);
		pho.setBackground(Color.WHITE);
		pho.addActionListener(this);;
		this.add(pho);
		lowerButtons.add(pho);
		
		ImageIcon cakeImage = new ImageIcon("Resources/cakethumbnail.png");
		cake = new JButton();
		cake.setIcon(cakeImage);
		cake.setHorizontalAlignment(JButton.CENTER);
		cake.setBackground(Color.WHITE);
		cake.addActionListener(this);
		this.add(cake);
		lowerButtons.add(cake);
		
	    help = new JButton();
	    help.setText("Help!");
	    help.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    help.setBackground(new Color(191, 192, 192));
	    help.addActionListener(this);;
	    this.add(help);
	    
	    main.add(topButtons);
	    main.add(lowerButtons);
		
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(help, BorderLayout.AFTER_LAST_LINE);
	}
	
	public static Component getBody() {
		return main;
	}

	@Override
	//Method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sandwich) {
			System.out.println("Level 1, Sandwich, was selected");
			
			ConfirmSandwichPlay confirm = new ConfirmSandwichPlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
			
		}
		if(e.getSource() == pizza) {
			System.out.println("Level 2, Pizza, was selected");
			ConfirmPizzaPlay confirm = new ConfirmPizzaPlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
		}
		if(e.getSource() == pho) {
			System.out.println("Level 4, Waygu Ramen, was selected");
			ConfirmPhoPlay confirm = new ConfirmPhoPlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
		}
		if(e.getSource() == cake) {
			System.out.println("Level 5, Beef pho, was selected");
			ConfirmCakePlay confirm = new ConfirmCakePlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
		}
		if(e.getSource() == help) {
			System.out.println("Help was selected");
			Help help = new Help();
			help.setBounds(1000,70,500,900);
			help.setBackground(new Color(211, 211, 211));
			help.setVisible(true);
			help.setResizable(false);
			help.setIconImage(Main.getIcon());
		}
	}

}
