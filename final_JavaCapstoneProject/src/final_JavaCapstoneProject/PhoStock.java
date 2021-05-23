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
public class PhoStock extends JFrame implements ActionListener{
	
	private JButton back;
	private JButton next;
	private JButton vegStock;
	private JButton beefStock;
	private JButton chickenStock;
	private static JPanel main;
	private static String stock;
	
	public PhoStock() {
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
	    title.setText("Select Type of Stock for the Broth");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    ImageIcon vegStockImage = new ImageIcon("Resources/whitebread.png");
		vegStock = new JButton();
		vegStock.setIcon(vegStockImage);
		vegStock.setHorizontalAlignment(JButton.CENTER);
		vegStock.setBackground(Color.WHITE);
		vegStock.addActionListener(this);
		this.add(vegStock);
		
		ImageIcon beefStockImage = new ImageIcon("Resources/baguette.png");
		beefStock = new JButton();
		beefStock.setIcon(beefStockImage);
		beefStock.setHorizontalAlignment(JButton.CENTER);
		beefStock.setBackground(Color.WHITE);
		beefStock.addActionListener(this);;
		this.add(beefStock);
		
		ImageIcon chickenStockImage = new ImageIcon("Resources/garlicbread.png");
		chickenStock = new JButton();
		chickenStock.setIcon(chickenStockImage);
		chickenStock.setHorizontalAlignment(JButton.CENTER);
		chickenStock.setBackground(Color.WHITE);
		chickenStock.addActionListener(this);;
		this.add(chickenStock);
		main.add(vegStock);
		main.add(beefStock);
		main.add(chickenStock);
	    
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
			System.out.println("Back button pressed");
			
			PhoStyle window = new PhoStyle();
			window.setBounds(50, 50, 1440,900);
			window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setIconImage(Main.getIcon());
	    	
	    	setVisible(false);
	    	dispose();
		}
		if(e.getSource() == next) {
			System.out.println("Next button pressed");
			PhoMeat nextWindow = new PhoMeat();
			nextWindow.setBounds(50,50, 1440,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		if(e.getSource() == vegStock) {
			System.out.println("Veg Stock Selected");
			stock = "veggie stock";
			beefStock.setEnabled(false);
			chickenStock.setEnabled(false);
		}
		if(e.getSource() == beefStock) {
			System.out.println("Beef Stock Selected");
			stock = "beef stock";
			vegStock.setEnabled(false);
			chickenStock.setEnabled(false);
		}
		if(e.getSource() == chickenStock) {
			System.out.println("Chicken Stock Selected");
			stock = "chicken stock";
			vegStock.setEnabled(false);
			beefStock.setEnabled(false);
		}
	}
	
	public static String getStock() {
		return stock;
	}

}
