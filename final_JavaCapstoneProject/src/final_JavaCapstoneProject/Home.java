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
	
	private JButton sandwich;
	private JButton burger;
	private JButton pancake;
	private JButton ramen;
	private JButton beefWellington;
	private JButton help;

	public Home() {
		super("Bob's Kitchen");
		
		//Base panel where all content is overlayed
		JPanel main = new JPanel();
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
	    topButtons.setBorder(BorderFactory.createEmptyBorder(0,120,0,120));
		topLayout.setVgap(5);
		topLayout.setHgap(150);
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
		
		//Level 2, make a burger
		ImageIcon burgerImage = new ImageIcon("Resources/burgerthumbnail.png");
		burger = new JButton();
		burger.setIcon(burgerImage);
		burger.setHorizontalAlignment(JButton.CENTER);
		burger.setBackground(Color.WHITE);
		burger.addActionListener(this);;
		this.add(burger);
		topButtons.add(burger);
		
		JPanel lowerButtons = new JPanel();
	    GridLayout lowerLayout = new GridLayout(1,2);
	    lowerButtons.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		lowerLayout.setVgap(5);
		lowerLayout.setHgap(5);
		lowerButtons.setLayout(lowerLayout);
		lowerButtons.setBackground(new Color(200,200,200));
		
		//Level 3, make a souffle pancake
		ImageIcon pancakeImage = new ImageIcon("Resources/pancakethumbnail.png");
		pancake = new JButton();
		pancake.setIcon(pancakeImage);
		pancake.setHorizontalAlignment(JButton.CENTER);
		pancake.setBackground(Color.WHITE);
		pancake.addActionListener(this);;
		this.add(pancake);
		lowerButtons.add(pancake);
		
		//Level 4, 
		ImageIcon ramenImage = new ImageIcon("Resources/ramenthumbnail.png");
		ramen = new JButton();
		ramen.setIcon(ramenImage);
		ramen.setHorizontalAlignment(JButton.CENTER);
		ramen.setBackground(Color.WHITE);
		ramen.addActionListener(this);;
		this.add(ramen);
		lowerButtons.add(ramen);
		
		ImageIcon wellingtonImage = new ImageIcon("Resources/wellingtonthumbnail.png");
		beefWellington = new JButton();
		beefWellington.setIcon(wellingtonImage);
		beefWellington.setHorizontalAlignment(JButton.CENTER);
		beefWellington.setBackground(Color.WHITE);
		beefWellington.addActionListener(this);;
		this.add(beefWellington);
		lowerButtons.add(beefWellington);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sandwich) {
			System.out.println("Level 1, Sandwich, was selected");
			
			ConfirmSandwichPlay confirm = new ConfirmSandwichPlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
			
		}
		if(e.getSource() == burger) {
			System.out.println("Level 2, Burger, was selected");
			ConfirmBurgerPlay confirm = new ConfirmBurgerPlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
		}
		if(e.getSource() == pancake) {
			System.out.println("Level 3, Souffle Pancake, was selected");
			ConfirmPancakePlay confirm = new ConfirmPancakePlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
		}
		if(e.getSource() == ramen) {
			System.out.println("Level 4, Waygu Ramen, was selected");
			ConfirmRamenPlay confirm = new ConfirmRamenPlay();
			confirm.setBounds(300,300, 300,100);
			confirm.setBackground(new Color(211,211,211));
			confirm.setVisible(true);
			confirm.setIconImage(Main.getIcon());
		}
		if(e.getSource() == beefWellington) {
			System.out.println("Level 5, Beef Wellington, was selected");
			ConfirmWellingtonPlay confirm = new ConfirmWellingtonPlay();
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
