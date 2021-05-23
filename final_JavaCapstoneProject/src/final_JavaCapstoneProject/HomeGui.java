package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class HomeGui extends JFrame {
	
	private static JButton sandwich;
	private static JButton burger;
	private static JButton pancake;
	private static JButton ramen;
	private static JButton beefWellington;
	private static JButton help;
	private static JLabel score;
	
	final static String BUTTONPANEL = "Card with JButtons";
	final static String TEXTPANEL = "Card with JTextField";

	public HomeGui() {
		
	}
	
	public static Component getBody() {
		JPanel main = new JPanel();
		GridLayout mainLayout = new GridLayout(2, 1);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
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
		topButtons.add(sandwich);
		
		//Level 2, make a burger
		ImageIcon burgerImage = new ImageIcon("Resources/burgerthumbnail.png");
		burger = new JButton();
		burger.setIcon(burgerImage);
		burger.setHorizontalAlignment(JButton.CENTER);
		burger.setBackground(Color.WHITE);
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
		lowerButtons.add(pancake);
		
		//Level 4, 
		ImageIcon ramenImage = new ImageIcon("Resources/ramenthumbnail.png");
		ramen = new JButton();
		ramen.setIcon(ramenImage);
		ramen.setHorizontalAlignment(JButton.CENTER);
		ramen.setBackground(Color.WHITE);
		lowerButtons.add(ramen);
		
		ImageIcon wellingtonImage = new ImageIcon("Resources/wellingtonthumbnail.png");
		beefWellington = new JButton();
		beefWellington.setIcon(wellingtonImage);
		beefWellington.setHorizontalAlignment(JButton.CENTER);
		beefWellington.setBackground(Color.WHITE);
		lowerButtons.add(beefWellington);
		
	    help = new JButton();
	    help.setText("Help!");
	    help.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    help.setBackground(new Color(191, 192, 192));
	    
	    main.add(topButtons);
	    main.add(lowerButtons);
		
		return main;
	}
	
	
	public static Component getSecondCard() {
		JPanel main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 2);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Finish");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    JPanel left = new JPanel();
	    left.setBackground(Color.WHITE);
	    JLabel imgLabel = new JLabel(new ImageIcon("Resources/none.png"));
	    left.add(imgLabel);
	    main.add(left);
	    
	    //******************************************************
	    JPanel right = new JPanel();
	    GridLayout rightLayout = new GridLayout(8,1);
	    right.setLayout(rightLayout);
	    right.setBackground(Color.WHITE);
	    
	    JTextPane ingredients = new JTextPane();
	    ingredients.setText("Ingredients");
	    ingredients.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    ingredients.setForeground(new Color(255, 255, 255));
	    ingredients.setBackground(new Color(79, 93, 117));
	    ingredients.setAlignmentX(CENTER_ALIGNMENT);
	    right.add(ingredients);
	    
	    JLabel bread = new JLabel();
	    bread.setText("Bread Type: "+ SandwichBread.getBread());
	    bread.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(bread, BorderLayout.WEST);
	    
	    JLabel veggies = new JLabel();
	    veggies.setText("<html>Veggies: " + "<br>" +SandwichVeggies.getVeg1()+ "<br>"+"        "
	    + SandwichVeggies.getVeg2() + "<br>"+"        " + SandwichVeggies.getVeg3());
	    right.add(veggies);
	    
	    score = new JLabel();
	    score.setText("Your Score is: " + Scorer.getScore()+"/2");
	    right.add(score);
	    main.add(right);
		
		return main;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.equals(null)) {
			System.out.println("listener");
		}
		
	}
}
