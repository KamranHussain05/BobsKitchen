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
public class PizzaToppings extends JFrame implements ActionListener {

	private static String veggie1;
	private static String veggie2;
	private static String meat;
	
	private JButton back;
	private JButton next;
	private JButton veg1Image;
	private JButton veg2Image;
	private JButton meatImage;

	private JComboBox<String> veg1Options;
	private JComboBox<String> veg2Options;
	private JComboBox<String> meatOptions;
	
	private String select = "";
	private String onion = "Onion";
	private String olives = "Olives";
	private String bellPepper = "Bell Pepper";
	private String basil = "Basil";
	
	private String sausage = "Sausage";
	private String peperoni = "Peperoni";
	private String none = "None";
	
	private static JPanel main;
	
	public PizzaToppings() {
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
	    title.setText("Toppings");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
		JPanel left = new JPanel();
		JTextPane veg1 = new JTextPane();
		veg1.setText("Veggie 1");
		veg1.setFont(new Font("Montserrat", Font.PLAIN, 30));
		veg1.setEditable(false);
		left.add(veg1, BorderLayout.BEFORE_FIRST_LINE);
		 
		veg1Image = new JButton();
		ImageIcon veg1Icon = new ImageIcon("Resources/noimage.png");
		veg1Image.setIcon(veg1Icon);
		veg1Image.setBackground(Color.WHITE);
		left.add(veg1Image, BorderLayout.CENTER);
		 
		veg1Options = new JComboBox<String>();
		veg1Options.addItem(select);
		veg1Options.addItem(onion);
		veg1Options.addItem(olives);
		veg1Options.addItem(bellPepper);
		veg1Options.addItem(basil);
		veg1Options.addItem(none);
		veg1Options.addActionListener(this);
		left.add(veg1Options, BorderLayout.AFTER_LAST_LINE);
		main.add(left);
		
		//*****************************************************
		JPanel center = new JPanel();
		JTextPane veg2 = new JTextPane();
		veg2.setText("Veggie 2");
		veg2.setFont(new Font("Montserrat", Font.PLAIN, 30));
		veg2.setEditable(false);
		center.add(veg2, BorderLayout.NORTH);
		 
		veg2Image = new JButton();
		ImageIcon veg2Icon = new ImageIcon("Resources/noimage.png");
		veg2Image.setIcon(veg2Icon);
		veg2Image.setBackground(Color.WHITE);
		center.add(veg2Image, BorderLayout.CENTER);
		 
		veg2Options = new JComboBox<String>();
		veg2Options.addItem(select);
		veg2Options.addItem(onion);
		veg2Options.addItem(olives);
		veg2Options.addItem(bellPepper);
		veg2Options.addItem(basil);
		veg2Options.addItem(none);
		veg2Options.addActionListener(this);
		center.add(veg2Options, BorderLayout.SOUTH);
		
		main.add(center);
		//***********************************************************
		JPanel right = new JPanel();
		JTextPane veg3 = new JTextPane();
		veg3.setText("Meat");
		veg3.setFont(new Font("Montserrat", Font.PLAIN, 30));
		veg3.setEditable(false);
		right.add(veg3, BorderLayout.NORTH);
		 
		meatImage = new JButton();
		ImageIcon meatIcon = new ImageIcon("Resources/noimage.png");
		meatImage.setIcon(meatIcon);
		meatImage.setBackground(Color.WHITE);
		right.add(meatImage, BorderLayout.CENTER);
		 
		meatOptions = new JComboBox<String>();
		meatOptions.addItem(select);
		meatOptions.addItem(peperoni);
		meatOptions.addItem(sausage);
		meatOptions.addItem(none);
		meatOptions.addActionListener(this);
		right.add(meatOptions, BorderLayout.SOUTH);
		
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
			PizzaDough back = new PizzaDough();
			back.setBounds(50,50,1000,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			PizzaFinish next = new PizzaFinish();
			next.setBounds(50,50,1000,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		//First Drop Down Menu listener
		if(veg1Options.getSelectedItem() == onion) {
			System.out.println("Onion Veggie Selected");
			veggie1 = "onion";
			ImageIcon vegIcon = new ImageIcon("Resources/onion.png");
			veg1Image.setIcon(vegIcon);
		}
		if(veg1Options.getSelectedItem() == olives) {
			System.out.println("Olive Veggie Selected");
			veggie1 = "olive";
			ImageIcon vegIcon = new ImageIcon("Resources/olive.png");
			veg1Image.setIcon(vegIcon);
		}
		if(veg1Options.getSelectedItem() == bellPepper) {
			System.out.println("Bell Pepper Veggie Selected");
			veggie1 = "bellpepper";
			ImageIcon vegIcon = new ImageIcon("Resources/bellpepper.png");
			veg1Image.setIcon(vegIcon);
		}
		if(veg1Options.getSelectedItem() == basil) {
			System.out.println("Basil Veggie Selected");
			veggie1 = "basil";
			ImageIcon vegIcon = new ImageIcon("Resources/basil.png");
			veg1Image.setIcon(vegIcon);
		}
		if(veg1Options.getSelectedItem() == none) {
			System.out.println("None Veggie Selected");
			veggie1 = "none";
			ImageIcon vegIcon = new ImageIcon("Resources/none.png");
			veg1Image.setIcon(vegIcon);
		}
		
		//Second Drop Down Menu listener
		if(veg2Options.getSelectedItem() == onion) {
			System.out.println("Onion Veggie Selected");
			veggie2 = "onion";
			ImageIcon vegIcon = new ImageIcon("Resources/onion.png");
			veg2Image.setIcon(vegIcon);
		}
		if(veg2Options.getSelectedItem() == olives) {
			System.out.println("Olive Veggie Selected");
			veggie2 = "olive";
			ImageIcon vegIcon = new ImageIcon("Resources/olive.png");
			veg2Image.setIcon(vegIcon);
		}
		if(veg2Options.getSelectedItem() == bellPepper) {
			System.out.println("Bell Pepper Veggie Selected");
			veggie2 = "bellpepper";
			ImageIcon vegIcon = new ImageIcon("Resources/bellpepper.png");
			veg2Image.setIcon(vegIcon);
		}
		if(veg2Options.getSelectedItem() == basil) {
			System.out.println("Basil Veggie Selected");
			veggie2 = "basil";
			ImageIcon vegIcon = new ImageIcon("Resources/basil.png");
			veg2Image.setIcon(vegIcon);
		}
		if(veg2Options.getSelectedItem() == none) {
			System.out.println("None Veggie Selected");
			veggie2 = "none";
			ImageIcon vegIcon = new ImageIcon("Resources/none.png");
			veg2Image.setIcon(vegIcon);
		}
		
		//Third Drop Down menu listener
		if(meatOptions.getSelectedItem() == sausage) {
			System.out.println("Sausage Meat Selected");
			meat = "sausage";
			ImageIcon meatIcon = new ImageIcon("Resources/sasuage.png");
			meatImage.setIcon(meatIcon);
		}
		if(meatOptions.getSelectedItem() == peperoni) {
			System.out.println("Peperoni Meat Selected");
			meat = "peperoni";
			ImageIcon meatIcon = new ImageIcon("Resources/pepperoni.png");
			meatImage.setIcon(meatIcon);
		}
		if(meatOptions.getSelectedItem() == none) {
			System.out.println("None Meat Selected");
			meat = "none";
			ImageIcon meatIcon = new ImageIcon("Resources/none.png");
			meatImage.setIcon(meatIcon);
		}
	}
		
	public static String getVeg1() {
		return veggie1;
	}
	
	public static String getVeg2() {
		return veggie2;
	}
	
	public static String getMeat() {
		return meat;
	}
}
