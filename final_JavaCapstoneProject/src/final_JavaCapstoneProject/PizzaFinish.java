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

	private JButton submit;
	private JButton back;
	private JPanel main;

	public PizzaFinish() {
		super("Bob's Kitchen");
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
	    JLabel imgLabel = new JLabel(new ImageIcon("Resources/none.png"));
	    left.add(imgLabel);
	    main.add(left);
	    
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("back selected");
			PizzaToppings back = new PizzaToppings();
			back.setBounds(50,50,1440,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == submit) {
			System.out.println("submit dish selected");
			
			if(PizzaStyle.getPizzaType() == "Neapolitan") {
				Scorer.neopolitanScore(PizzaDough.getDough(), 
						PizzaDough.getSauce(), PizzaDough.getCheese(),
						PizzaToppings.getVeg1(), PizzaToppings.getVeg2(), 
						PizzaToppings.getMeat());
				submit.setEnabled(false);	
			}
			
			if(PizzaStyle.getPizzaType() == "New York") {
				Scorer.newYorkScore(PizzaDough.getDough(), 
						PizzaDough.getSauce(), PizzaDough.getCheese(),
						PizzaToppings.getVeg1(), PizzaToppings.getVeg2(), 
						PizzaToppings.getMeat());
				submit.setEnabled(false);	
			}
			
		ScoreWindow window = new ScoreWindow();
		window.setBounds(50,50,1440,900);
		window.setVisible(true);
		window.setIconImage(Main.getIcon());
		window.setBackground(new Color(211,211,211));
		
		dispose();
		setVisible(false);
		}
	}
}