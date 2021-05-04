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
public class SandwichVeggies extends JFrame implements ActionListener {
	
	private static String veg1;
	private static String veg2;
	private static String veg3;
	private JButton back;
	private JButton next;
	private JComboBox<String> options;
	private JComboBox<String> options2;
	private JComboBox<String> options3;
	private JButton veg1Image;
	private JButton veg2Image;
	private JButton veg3Image;
//Constructors
	public SandwichVeggies() {
		super("Level 1: Sandwich");
		
		JPanel main = new JPanel();
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
		JTextPane veg1 = new JTextPane();
		veg1.setText("Veggie 1");
		veg1.setFont(new Font("Montserrat", Font.PLAIN, 30));
		veg1.setEditable(false);
		left.add(veg1, BorderLayout.BEFORE_FIRST_LINE);
		 
		veg1Image = new JButton();
		ImageIcon image = new ImageIcon("Resources/tomato.png");
		veg1Image.setIcon(image);
		left.add(veg1Image, BorderLayout.CENTER);
		 
		options = new JComboBox<String>();
		options.addItem("Select One");
		options.addItem("Tomato");
		options.addItem("Lettuce");
		options.addItem("Cucumbers");
		options.addItem("Avacado");
		options.addItem("Nothing");
		left.add(options, BorderLayout.AFTER_LAST_LINE);
		
		main.add(left);
		//*****************************************************
		JPanel center = new JPanel();
		JTextPane veg2 = new JTextPane();
		veg2.setText("Veggie 2");
		veg2.setFont(new Font("Montserrat", Font.PLAIN, 30));
		veg2.setEditable(false);
		center.add(veg2, BorderLayout.NORTH);
		 
		veg2Image = new JButton();
		ImageIcon image2 = new ImageIcon("Resources/lettuce.png");
		veg2Image.setIcon(image2);
		center.add(veg2Image, BorderLayout.CENTER);
		 
		options2 = new JComboBox<String>();
		options2.addItem("Select One");
		options2.addItem("Tomato");
		options2.addItem("Lettuce");
		options2.addItem("Cucumbers");
		options2.addItem("Avacado");
		options2.addItem("Nothing");
		center.add(options2, BorderLayout.SOUTH);
		
		main.add(center);
		//***********************************************************
		JPanel right = new JPanel();
		JTextPane veg3 = new JTextPane();
		veg3.setText("Veggie 3");
		veg3.setFont(new Font("Montserrat", Font.PLAIN, 30));
		veg3.setEditable(false);
		right.add(veg3, BorderLayout.NORTH);
		 
		veg3Image = new JButton();
		ImageIcon image3 = new ImageIcon("Resources/avocado.png");
		veg3Image.setIcon(image3);
		right.add(veg3Image, BorderLayout.CENTER);
		 
		options3 = new JComboBox<String>();
		options3.addItem("Select One");
		options3.addItem("Tomato");
		options3.addItem("Lettuce");
		options3.addItem("Cucumbers");
		options3.addItem("Avocado");
		options3.addItem("Nothing");
		right.add(options3, BorderLayout.SOUTH);
		
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

	@Override
	//Method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("back selected");
			SandwichStart back = new SandwichStart();
			back.setBounds(50,50,1440,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			SandwichMeat next = new SandwichMeat();
			next.setBounds(50,50,1440,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		String a = (String) options.getSelectedItem();
		switch (a) {
		case "Tomato":
			veg1 = "Tomato";
			ImageIcon tomato = new ImageIcon("Resources/tomato.png");
			veg1Image.setIcon(tomato);
		case "Lettuce":
			veg1 = "Lettuce";
			ImageIcon lettuce = new ImageIcon("Resources/lettuce.ong");
			veg1Image.setIcon(lettuce);
		case "Cucumbers":
			veg1 = "Cucumber";
			ImageIcon cucumber = new ImageIcon("Resources/cucumber.png");
			veg1Image.setIcon(cucumber);
		case "Avocado":
			veg1 = "Avocado";
			ImageIcon avocado = new ImageIcon("Resources/avocado.png");
			veg1Image.setIcon(avocado);
//		case "Nothing":
//			veg1 = "none";
//			ImageIcon none = new ImageIcon("Resources/none.png");
//			veg1Image.setIcon(none);
		}
		
		String b = (String) options2.getSelectedItem();
		switch (b) {
		case "Tomato":
			veg2 = "Tomato";
			ImageIcon tomato = new ImageIcon("Resources/tomato.png");
			veg2Image.setIcon(tomato);
		case "Lettuce":
			veg2 = "Lettuce";
			ImageIcon lettuce = new ImageIcon("Resources/lettuce.ong");
			veg2Image.setIcon(lettuce);
		case "Cucumbers":
			veg2 = "Cucumber";
			ImageIcon cucumber = new ImageIcon("Resources/cucumber.png");
			veg2Image.setIcon(cucumber);
		case "Avocado":
			veg2 = "Avocado";
			ImageIcon avocado = new ImageIcon("Resources/avocado.png");
			veg2Image.setIcon(avocado);
//		case "Nothing":
//			veg2 = "none";
//			ImageIcon none = new ImageIcon("Resources/none.png");
//			veg2Image.setIcon(none);
		}
		
		String c = (String) options3.getSelectedItem();
		switch (c) {
		case "Tomato":
			veg3 = "Tomato";
			ImageIcon tomato = new ImageIcon("Resources/tomato.png");
			veg3Image.setIcon(tomato);
		case "Lettuce":
			veg3 = "Lettuce";
			ImageIcon lettuce = new ImageIcon("Resources/lettuce.ong");
			veg3Image.setIcon(lettuce);
		case "Cucumbers":
			veg3 = "Cucumber";
			ImageIcon cucumber = new ImageIcon("Resources/cucumber.png");
			veg3Image.setIcon(cucumber);
		case "Avocado":
			veg3 = "Avocado";
			ImageIcon avocado = new ImageIcon("Resources/avocado.png");
			veg3Image.setIcon(avocado);
//		case "Nothing":
//			veg3 = "none";
//			ImageIcon none = new ImageIcon("Resources/none.png");
//			veg3Image.setIcon(none);
		}
		
		refresh();
	}
	
	private void refresh() {
		// TODO Auto-generated method stub
		
	}

	public static String getVeg1() {
		return veg1;
	}
	
	public static String getVeg2() {
		return veg2;
	}
	
	public static String getVeg3() {
		return veg3;
	}

}
