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
public class SandwichCondiments extends JFrame implements ActionListener {
	
	private JButton back;
	private JButton next;
	private JComboBox<String> options;

	public SandwichCondiments() {
		super("Level 1: Sandwich");
		
		JPanel main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 2);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Add Sauce and Cheese");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    JPanel saucePanel = new JPanel();
		JTextPane sauce = new JTextPane();
		sauce.setText("Sauce");
		sauce.setFont(new Font("Montserrat", Font.PLAIN, 30));
		sauce.setEditable(false);
		saucePanel.add(sauce, BorderLayout.BEFORE_LINE_BEGINS);
		 
		JButton sauceImage = new JButton();
		ImageIcon image = new ImageIcon("Resources/honeymustard.png");
		sauceImage.setBackground(Color.WHITE);
		sauceImage.setIcon(image);
		saucePanel.add(sauceImage, BorderLayout.CENTER);
		 
		options = new JComboBox<String>();
		options.addItem("");
		options.addItem("Honey Mustard");
		options.addItem("Mayonnaise");
		options.addItem("Ketchup");
		options.addItem("1000 Island Dressing");
		options.addItem("None");
		options.addActionListener(this);
		this.add(options);
		saucePanel.add(options, BorderLayout.AFTER_LAST_LINE);
		
		main.add(saucePanel);
		
		JPanel cheesePanel = new JPanel();
		JTextPane cheese = new JTextPane();
		cheese.setText("Cheese");
		cheese.setFont(new Font("Montserrat", Font.PLAIN, 30));
		cheese.setEditable(false);
		cheesePanel.add(cheese, BorderLayout.NORTH);
		 
		JButton cheeseImage = new JButton();
		ImageIcon image2 = new ImageIcon("Resources/pancakethumbnail.png");
		cheeseImage.setIcon(image2);
		cheesePanel.add(cheeseImage, BorderLayout.CENTER);
		 
		JComboBox<String> cheeseOptions = new JComboBox<String>();
		cheeseOptions.addItem("");
		cheeseOptions.addItem("Chedder");
		cheeseOptions.addItem("Mozzarella");
		cheeseOptions.addItem("Provolone");
		cheeseOptions.addItem("Cream Cheese");
		cheeseOptions.addItem("None");
		cheesePanel.add(cheeseOptions, BorderLayout.AFTER_LAST_LINE);
		
		main.add(cheesePanel);
	    
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
		if(e.getSource() == back) {
			System.out.println("back selected");
			SandwichMeat next = new SandwichMeat();
			next.setBounds(50,50,1440,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			SandwichFinish next = new SandwichFinish();
			next.setBounds(50,50,1440,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		} if(e.getSource() == options.getSelectedItem()) {
			System.out.println("Test");
		}
	}

}
