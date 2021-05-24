//Author: Kamran Hussain
//Date: 5/22/2021
//Revision 08
package final_JavaCapstoneProject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class SandwichFinish extends JFrame implements ActionListener {
//Fields	
	private JButton submit;
	private JButton back;
	private static JPanel main;
//Constructors
	public SandwichFinish() {
		super("Level 1: Sandwich");
		
		main = new JPanel();
		GridLayout layout = new GridLayout(1,2);
		layout.setHgap(5);
		main.setLayout(layout);
		main.setBackground(new Color(211,211,211));
		
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
	    JLabel imgLabel = new JLabel();
	    if(SandwichType.getSandwichStyle() == "grilled cheese") {
	    	ImageIcon gcIcon = new ImageIcon("Resources/grilledcheese.png");
	    	imgLabel.setIcon(gcIcon);
	    }
	    if(SandwichType.getSandwichStyle() == "blt") {
	    	ImageIcon bltIcon = new ImageIcon("Resources/blt.png");
	    	imgLabel.setIcon(bltIcon);
	    }
	    if(SandwichType.getSandwichStyle() == "banhmi") {
	    	ImageIcon banhmiIcon = new ImageIcon("Resources/banhmi.png");
	    	imgLabel.setIcon(banhmiIcon);
	    }
	    left.add(imgLabel);
	    main.add(left);
	    
	    //******************************************************
	    JPanel right = new JPanel();
	    GridLayout rightLayout = new GridLayout(8,1);
	    right.setLayout(rightLayout);
	    right.setBackground(Color.WHITE);
	    
	    JTextPane ingredients = new JTextPane();
	    ingredients.setText("Ingredients");
	    ingredients.setFont(new Font("Montserrat", Font.PLAIN, 35));
	    ingredients.setForeground(new Color(255, 255, 255));
	    ingredients.setBackground(new Color(79, 93, 117));
	    ingredients.setAlignmentX(CENTER_ALIGNMENT);
	    right.add(ingredients, BorderLayout.CENTER);
	    
	    JLabel sandwichType = new JLabel();
	    sandwichType.setText("<html><b>Sandwich Style:</b> " + SandwichType.getSandwichStyle());
	    sandwichType.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(sandwichType, BorderLayout.CENTER);
	    
	    JLabel bread = new JLabel();
	    bread.setText("<html><b>Bread Type:</b> " + SandwichBread.getBread());
	    bread.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(bread, BorderLayout.WEST);
	    
	    JLabel veggies = new JLabel();
	    veggies.setText("<html><b>Veggies:</b> " + "<br>" + SandwichVeggies.getVeg1()+ 
	    		"<br>"+"        "+ SandwichVeggies.getVeg2() + "<br>"+
	    		"        " + SandwichVeggies.getVeg3());
	    veggies.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(veggies);
	    
	    JLabel meat = new JLabel();
	    meat.setText("<html><b>Meat:</b>        " + SandwichMeat.getMeat());
	    meat.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(meat);
	    
	    JLabel sauce = new JLabel();
	    sauce.setText("<html><b>Sauce:</b>        "+ SandwichCondiments.getSauce());
	    sauce.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(sauce);
	    
	    JLabel cheese = new JLabel();
	    cheese.setText("<html><b>Cheese:</b>        " + SandwichCondiments.getCheese());
	    cheese.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(cheese);
	    main.add(right);

	    JPanel footer = new JPanel();
	    back = new JButton();
	    back.setText("Back");
	    back.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    back.setBackground(new Color(191, 192, 192));
	    back.addActionListener(this);;
	    this.add(back);
	    submit = new JButton();
	    submit.setText("Submit Dish");
	    submit.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    submit.setBackground(new Color(191, 192, 192));
	    submit.addActionListener(this);;
	    this.add(submit);
	    footer.add(back, BorderLayout.EAST);
	    footer.add(submit, BorderLayout.WEST);

		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}
	
	public static Component getBody() {
		return main;
	}

	@Override
	//Methods
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("back selected");
			SandwichCondiments back = new SandwichCondiments();
			back.setBounds(50,50,1000,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == submit) {
			System.out.println("submit dish selected");
			
			if(SandwichType.getSandwichStyle() == "grilled cheese") {
				Scorer.grilledCheeseScore(SandwichBread.getBread(), 
						SandwichCondiments.getCheese(), SandwichCondiments.getSauce(),
						SandwichVeggies.getVeg1(), SandwichVeggies.getVeg2(), 
						SandwichVeggies.getVeg3(), SandwichMeat.getMeat());
				submit.setEnabled(false);	
			}
			
			if(SandwichType.getSandwichStyle() == "banhmi") {
				Scorer.banhMiScore(SandwichBread.getBread(), 
						SandwichCondiments.getCheese(), SandwichCondiments.getSauce(),
						SandwichVeggies.getVeg1(), SandwichVeggies.getVeg2(), 
						SandwichVeggies.getVeg3(), SandwichMeat.getMeat());
				submit.setEnabled(false);
			}
			
			if(SandwichType.getSandwichStyle() == "blt") {
				Scorer.bltScore(SandwichBread.getBread(), 
						SandwichCondiments.getCheese(), SandwichCondiments.getSauce(),
						SandwichVeggies.getVeg1(), SandwichVeggies.getVeg2(), 
						SandwichVeggies.getVeg3(), SandwichMeat.getMeat());
				submit.setEnabled(false);
			}
			
			ScoreWindow window = new ScoreWindow();
			window.setBounds(50,50,1000,900);
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			window.setBackground(new Color(211,211,211));
			
			dispose();
			setVisible(false);
		}
	}
}
