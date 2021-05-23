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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PizzaDough extends JFrame implements ActionListener {

	private static String dough;
	private static String sauce;
	private static String cheese;

	private JButton back;
	private JButton next;
	private JButton doughImage;
	private JButton sauceImage;
	private JButton cheeseImage;

	private JComboBox<String> doughOptions;
	private JComboBox<String> sauceOptions;
	private JComboBox<String> cheeseOptions;

	private String select = "";
	private String thinCrust = "Thin Crust";
	private String thickCrust = "Thick Crust";
	private String deepDish = "Deep Dish";

	private String tomatoSauce = "Marinara";
	private String pestoSauce = "Pesto Sauce";

	private String mozzarella = "Mozzarella";
	private String cheddar = "Cheddar";
	private String provolone = "Provolone";

	private static JPanel main;

	public PizzaDough() {
		super("Bob's Kitchen");

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
		title.setText("Select What Veggies You Want");
		title.setEditable(false);
		title.setAlignmentX(CENTER_ALIGNMENT);
		title.setFont(new Font("Montserrat", Font.PLAIN, 40));
		title.setForeground(new Color(255, 255, 255));
		title.setBackground(new Color(79, 93, 117));
		header.add(title);

		JPanel left = new JPanel();
		JTextPane doughLabel = new JTextPane();
		doughLabel.setText("Dough");
		doughLabel.setFont(new Font("Montserrat", Font.PLAIN, 30));
		doughLabel.setEditable(false);
		left.add(doughLabel, BorderLayout.BEFORE_FIRST_LINE);

		doughImage = new JButton();
		ImageIcon doughIcon = new ImageIcon("Resources/noimage.png");
		doughImage.setIcon(doughIcon);
		doughImage.setBackground(Color.WHITE);
		left.add(doughImage, BorderLayout.CENTER);

		doughOptions = new JComboBox<String>();
		doughOptions.addItem(select);
		doughOptions.addItem(thinCrust);
		doughOptions.addItem(thickCrust);
		doughOptions.addItem(deepDish);
		doughOptions.addActionListener(this);
		left.add(doughOptions, BorderLayout.AFTER_LAST_LINE);
		main.add(left);

		//*****************************************************
		JPanel center = new JPanel();
		JTextPane sauceLabel = new JTextPane();
		sauceLabel.setText("Sauce");
		sauceLabel.setFont(new Font("Montserrat", Font.PLAIN, 30));
		sauceLabel.setEditable(false);
		center.add(sauceLabel, BorderLayout.NORTH);

		sauceImage = new JButton();
		ImageIcon sauceIcon = new ImageIcon("Resources/noimage.png");
		sauceImage.setIcon(sauceIcon);
		sauceImage.setBackground(Color.WHITE);
		center.add(sauceImage, BorderLayout.CENTER);

		sauceOptions = new JComboBox<String>();
		sauceOptions.addItem(select);
		sauceOptions.addItem(tomatoSauce);
		sauceOptions.addItem(pestoSauce);
		sauceOptions.addActionListener(this);
		center.add(sauceOptions, BorderLayout.SOUTH);

		main.add(center);
		//***********************************************************
		JPanel right = new JPanel();
		JTextPane cheeseLabel = new JTextPane();
		cheeseLabel.setText("Cheese");
		cheeseLabel.setFont(new Font("Montserrat", Font.PLAIN, 30));
		cheeseLabel.setEditable(false);
		right.add(cheeseLabel, BorderLayout.NORTH);

		cheeseImage = new JButton();
		ImageIcon cheeseIcon = new ImageIcon("Resources/noimage.png");
		cheeseImage.setIcon(cheeseIcon);
		cheeseImage.setBackground(Color.WHITE);
		right.add(cheeseImage, BorderLayout.CENTER);

		cheeseOptions = new JComboBox<String>();
		cheeseOptions.addItem(select);
		cheeseOptions.addItem(mozzarella);
		cheeseOptions.addItem(cheddar);
		cheeseOptions.addItem(provolone);
		cheeseOptions.addActionListener(this);
		right.add(cheeseOptions, BorderLayout.SOUTH);

		main.add(right);

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
	
	public static Container getBody() {
		return main;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("back selected");
			PizzaStyle back = new PizzaStyle();
			back.setBounds(50,50,1440,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());

			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			PizzaToppings next = new PizzaToppings();
			next.setBounds(50,50,1440,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());

			setVisible(false);
			dispose();
		}

		if(doughOptions.getSelectedItem() == thinCrust) {
			System.out.println("Thin Crust Dough Selected");
			dough = "thincrust";
			ImageIcon doughIcon = new ImageIcon("Resources/thincrust.png");
			doughImage.setIcon(doughIcon);
		}
		if(doughOptions.getSelectedItem() == thickCrust) {
			System.out.println("Thick Crust Dough Selected");
			dough = "thickcrust";
			ImageIcon doughIcon = new ImageIcon("Resources/thickcrust.png");
			doughImage.setIcon(doughIcon);
		}
		if(doughOptions.getSelectedItem() == deepDish) {
			System.out.println("Deep Dish Dough Selected");
			dough = "deepdish";
			ImageIcon doughIcon = new ImageIcon("Resources/deepdish.png");
			doughImage.setIcon(doughIcon);
		}
		if(sauceOptions.getSelectedItem() == tomatoSauce) {
			System.out.println("Marinara Sauce Selected");
			sauce = "tomatosauce";
			ImageIcon sauceIcon = new ImageIcon("Resources/tomatosauce.png");
			sauceImage.setIcon(sauceIcon);
		}
		if(sauceOptions.getSelectedItem() == pestoSauce) {
			System.out.println("Pesto Sauce Selected");
			sauce = "pestosauce";
			ImageIcon sauceIcon = new ImageIcon("Resources/pesto.png");
			sauceImage.setIcon(sauceIcon);
		}
		if(cheeseOptions.getSelectedItem() == mozzarella) {
			System.out.println("Mozzarella Cheese Selected");
			cheese = "mozzarella";
			ImageIcon cheeseIcon = new ImageIcon("Resources/mozzarella.png");
			cheeseImage.setIcon(cheeseIcon);
		}
		if(cheeseOptions.getSelectedItem() == cheddar) {
			System.out.println("Cheddar Cheese Selected");
			cheddar = "cheddar";
			ImageIcon cheeseIcon = new ImageIcon("Resources/chedder.png");
			cheeseImage.setIcon(cheeseIcon);
		}
		if(cheeseOptions.getSelectedItem() == provolone) {
			System.out.println("Provolone Cheese Selected");
			cheese = "provolone";
			ImageIcon cheeseIcon = new ImageIcon("Resources/provolone.png");
			cheeseImage.setIcon(cheeseIcon);
		}

	}

	public static String getDough() {
		return dough;
	}

	public static String getSauce() {
		return sauce;
	}
	public static String getCheese() {
		return cheese;
	}

}
