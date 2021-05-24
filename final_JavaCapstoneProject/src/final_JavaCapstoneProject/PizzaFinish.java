//Author: Kamran Hussain
//Date: 5/23/21
//Rev01
//Notes: Adapted from sandwich finish

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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PizzaFinish extends JFrame implements ActionListener {
//fields include navigation and the main panel
	private JButton submit;
	private JButton back;
	private static JPanel main;
//constructor constructs the main panel and adds the elements to the main panel
	public PizzaFinish() {
		super("Bob's Kitchen");
		//main panel is instantiated and the layout is set
		main = new JPanel();
		GridLayout layout = new GridLayout(1,2);
		layout.setHgap(5);
		main.setLayout(layout);
		main.setBackground(new Color(211,211,211));
		//the header with the page title
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
		//left panel inlcudes the chosen type of pizza.
	    JPanel left = new JPanel();
	    left.setBackground(Color.WHITE);
	    JLabel imgLabel = new JLabel();
	    if(PizzaStyle.getPizzaType() == "new york") {
	    	ImageIcon newIcon = new ImageIcon("Resources/newYork.png");
	    	imgLabel.setIcon(newIcon);
	    }
	    if(PizzaStyle.getPizzaType() == "Neapolitan") {
	    	ImageIcon neoIcon = new ImageIcon("Resources/neopolitan.png");
	    	imgLabel.setIcon(neoIcon);
	    }
	    left.add(imgLabel);
	    main.add(left); //left panel is added to main
	    
	    //*****************************************************************************
	    //right panel includes the labels and summary
	    JPanel right = new JPanel();
	    GridLayout rightLayout = new GridLayout(8,1);
	    right.setLayout(rightLayout);
	    right.setBackground(Color.WHITE);
	    //ingredients title header
	    JTextPane ingredients = new JTextPane();
	    ingredients.setText("Ingredients");
	    ingredients.setFont(new Font("Montserrat", Font.PLAIN, 35));
	    ingredients.setForeground(new Color(255, 255, 255));
	    ingredients.setBackground(new Color(79, 93, 117));
	    ingredients.setAlignmentX(CENTER_ALIGNMENT);
	    right.add(ingredients, BorderLayout.CENTER);
	    //the jlabels state the type of ingredient then get the user selected item from the storage string in the ingredients class.
	    JLabel pizzaType = new JLabel();
	    pizzaType.setText("<html><b>Pizza Style:</b> " + PizzaStyle.getPizzaType());
	    pizzaType.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(pizzaType, BorderLayout.CENTER);
	    main.add(right);
	    
	    JLabel dough = new JLabel();
	    dough.setText("<html><b>Crust Style:</b> " + PizzaDough.getDough());
	    dough.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(dough, BorderLayout.WEST);
	    
	    JLabel sauce = new JLabel();
	    sauce.setText("<html><b>Sauce:</b> " +PizzaDough.getSauce());
	    sauce.setFont( new Font("Monsterrat", Font.PLAIN, 16));
	    right.add(sauce);
	    
	    JLabel cheese = new JLabel();
	    cheese.setText("<html><b>Cheese:</b> " + PizzaDough.getCheese());
	    cheese.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(cheese);
	    
	    JLabel veggies = new JLabel();
	    veggies.setText("<html><b>Veggies:</b> <br>"+ PizzaToppings.getVeg1() + "<br>" + PizzaToppings.getVeg2());
	    veggies.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(veggies);
	    
	    JLabel meat = new JLabel();
	    meat.setText("<html><b>Meat:</b> " + PizzaToppings.getMeat());
	    meat.setFont(new Font("Montserrat",Font.PLAIN, 16));
	    right.add(meat);
	    
	    //the footer contains navigation
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
	//returns the main panel and all the content for page navigation.
	public static Container getBody() {
		return main;
	}

	@Override
	//determines what to do when a button is pressed
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) { //goes to the previous page
			System.out.println("back selected");
			PizzaToppings back = new PizzaToppings();
			back.setBounds(50,50,1000,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == submit) { //submits the dish to the scorer
			System.out.println("submit dish selected");
			
			if(PizzaStyle.getPizzaType() == "Neapolitan") { //determines if the type matches this then inputs to data to the corresponding method in the scorer
				Scorer.neopolitanScore(PizzaDough.getDough(), 
						PizzaDough.getSauce(), PizzaDough.getCheese(),
						PizzaToppings.getVeg1(), PizzaToppings.getVeg2(), 
						PizzaToppings.getMeat());
				submit.setEnabled(false);	
			}
			
			if(PizzaStyle.getPizzaType() == "new york") { //determines if the type matches this then inputs to data to the corresponding method in the scorer
				Scorer.newYorkScore(PizzaDough.getDough(), 
						PizzaDough.getSauce(), PizzaDough.getCheese(),
						PizzaToppings.getVeg1(), PizzaToppings.getVeg2(), 
						PizzaToppings.getMeat());
				submit.setEnabled(false);	
			}
			
		ScoreWindow window = new ScoreWindow(); //opens the score page and closes this page.
		window.setBounds(50,50,1000,900);
		window.setVisible(true);
		window.setIconImage(Main.getIcon());
		window.setBackground(new Color(211,211,211));
		
		dispose();
		setVisible(false);
		}
	}
}