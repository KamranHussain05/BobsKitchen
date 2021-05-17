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

	private static String veg1;
	private static String veg2;
	private static String veg3;
	
	private JButton back;
	private JButton next;
	private JButton veg1Image;
	private JButton veg2Image;
	private JButton veg3Image;

	private JComboBox<String> veg1Options;
	private JComboBox<String> veg2Options;
	private JComboBox<String> veg3Options;
	
	private String select = "Select One";
	private String tomato = "Tomato";
	private String lettuce = "Lettuce";
	private String cucumber = "Cucumber";
	private String avocado = "Avocado";
	private String none = "None";
	
	public PizzaDough() {
		super("Bob's Kitchen");
		
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
		veg1Image.setBackground(Color.WHITE);
		left.add(veg1Image, BorderLayout.CENTER);
		 
		veg1Options = new JComboBox<String>();
		veg1Options.addItem(select);
		veg1Options.addItem(tomato);
		veg1Options.addItem(lettuce);
		veg1Options.addItem(cucumber);
		veg1Options.addItem(avocado);
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
		ImageIcon image2 = new ImageIcon("Resources/lettuce.png");
		veg2Image.setIcon(image2);
		veg2Image.setBackground(Color.WHITE);
		center.add(veg2Image, BorderLayout.CENTER);
		 
		veg2Options = new JComboBox<String>();
		veg2Options.addItem(select);
		veg2Options.addItem(tomato);
		veg2Options.addItem(lettuce);
		veg2Options.addItem(cucumber);
		veg2Options.addItem(avocado);
		veg2Options.addItem(none);
		veg2Options.addActionListener(this);
		center.add(veg2Options, BorderLayout.SOUTH);
		
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
		veg3Image.setBackground(Color.WHITE);
		right.add(veg3Image, BorderLayout.CENTER);
		 
		veg3Options = new JComboBox<String>();
		veg3Options.addItem(select);
		veg3Options.addItem(tomato);
		veg3Options.addItem(lettuce);
		veg3Options.addItem(cucumber);
		veg3Options.addItem(avocado);
		veg3Options.addItem(none);
		veg3Options.addActionListener(this);
		right.add(veg3Options, BorderLayout.SOUTH);
		
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
