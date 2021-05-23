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
public class PhoMeat extends JFrame implements ActionListener {
	
	private JButton back;
	private JButton next;
	private JButton beefImage1;
	private JButton beefImage2;
	private JButton chickenImage1;
	private JButton chickenImage2;
	
	private JComboBox<String> beefOptions1;
	private JComboBox<String> beefOptions2;
	private JComboBox<String> chickenOptions1;
	private JComboBox<String> chickenOptions2;

	private String fattyBrisket = "Fatty Brisket";
	private String beefTendon = "Beef Tendon";
	private String chickenSkin = "Chicken Skin";
	private String chickenBreast = "Chicken Breast";
	private String none = "none";
	
	private static JPanel main;
	private static String beef1;
	private static String beef2;
	private static String chick1;
	private static String chick2;

	public PhoMeat() {
		super("Bob's Kitchen");
		
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 4);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Pho Meat");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
//**********************************************************************************	    
	    JPanel left = new JPanel();
		JTextPane beef = new JTextPane();
		beef.setText("Beef 1");
		beef.setFont(new Font("Montserrat", Font.PLAIN, 30));
		beef.setEditable(false);
		left.add(beef, BorderLayout.BEFORE_FIRST_LINE);
	    
	    beefImage1 = new JButton();
		ImageIcon image = new ImageIcon("Resources/noimage.png");
		beefImage1.setIcon(image);
		beefImage1.setBackground(Color.WHITE);
		left.add(beefImage1, BorderLayout.CENTER);
		 
		beefOptions1 = new JComboBox<String>();
		beefOptions1.addItem("");
		beefOptions1.addItem(fattyBrisket);
		beefOptions1.addItem(beefTendon);
		beefOptions1.addItem(none);
		beefOptions1.addActionListener(this);
		left.add(beefOptions1, BorderLayout.AFTER_LAST_LINE);
		main.add(left);
		
		//*****************************************************
		JPanel centerLeft = new JPanel();
		JTextPane beef2 = new JTextPane();
		beef2.setText("Beef 2");
		beef2.setFont(new Font("Montserrat", Font.PLAIN, 30));
		beef2.setEditable(false);
		centerLeft.add(beef2, BorderLayout.NORTH);
		 
		beefImage2 = new JButton();
		ImageIcon image2 = new ImageIcon("Resources/noimage.png");
		beefImage2.setIcon(image2);
		beefImage2.setBackground(Color.WHITE);
		centerLeft.add(beefImage2, BorderLayout.CENTER);
		 
		beefOptions2 = new JComboBox<String>();
		beefOptions2.addItem("");
		beefOptions2.addItem(fattyBrisket);
		beefOptions2.addItem(beefTendon);
		beefOptions2.addItem(none);
		beefOptions2.addActionListener(this);
		centerLeft.add(beefOptions2, BorderLayout.AFTER_LAST_LINE);
		main.add(centerLeft);
		//***********************************************************
		JPanel centerRight = new JPanel();
		JTextPane chicken1 = new JTextPane();
		chicken1.setText("Chicken 1");
		chicken1.setFont(new Font("Montserrat", Font.PLAIN, 30));
		chicken1.setEditable(false);
		centerRight.add(chicken1, BorderLayout.NORTH);
		 
		chickenImage1 = new JButton();
		ImageIcon image3 = new ImageIcon("Resources/noimage.png");
		chickenImage1.setIcon(image3);
		chickenImage1.setBackground(Color.WHITE);
		centerRight.add(chickenImage1, BorderLayout.CENTER);
		 
		chickenOptions1 = new JComboBox<String>();
		chickenOptions1.addItem("");
		chickenOptions1.addItem(chickenSkin);
		chickenOptions1.addItem(chickenBreast);
		chickenOptions1.addItem(none);
		chickenOptions1.addActionListener(this);
		centerRight.add(chickenOptions1, BorderLayout.AFTER_LAST_LINE);
		main.add(centerRight);
		//***********************************************************
		JPanel right = new JPanel();
		JTextPane chicken2 = new JTextPane();
		chicken2.setText("Chicken 2");
		chicken2.setFont(new Font("Montserrat", Font.PLAIN, 30));
		chicken2.setEditable(false);
		right.add(chicken2, BorderLayout.NORTH);
		 
		chickenImage2 = new JButton();
		ImageIcon image4 = new ImageIcon("Resources/noimage.png");
		chickenImage2.setIcon(image4);
		chickenImage2.setBackground(Color.WHITE);
		right.add(chickenImage2, BorderLayout.CENTER);
		 
		chickenOptions2 = new JComboBox<String>();
		chickenOptions2.addItem("");
		chickenOptions2.addItem(chickenSkin);
		chickenOptions2.addItem(chickenBreast);
		chickenOptions2.addItem(none);
		chickenOptions2.addActionListener(this);
		right.add(chickenOptions2, BorderLayout.AFTER_LAST_LINE);
		main.add(right);
//***********************************************************************************	    
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
			PhoStock back = new PhoStock();
			back.setBounds(50,50,1000,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			PhoNoodles next = new PhoNoodles();
			next.setBounds(50,50,1000,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		
		if(beefOptions1.getSelectedItem() == fattyBrisket) {
			beef1 = "fattybrisket";
			ImageIcon fattyBrisketImage = new ImageIcon("Resources/fattybrisket.png");
			beefImage1.setIcon(fattyBrisketImage);
		}
		if(beefOptions1.getSelectedItem() == beefTendon) {
			beef1 = "tendon";
			ImageIcon tendonImage = new ImageIcon("Resources/beeftendon.png");
			beefImage1.setIcon(tendonImage);
		}
		if(beefOptions1.getSelectedItem() == none) {
			beef1 = "none";
			ImageIcon noneImage = new ImageIcon("Resources/none.png");
			beefImage1.setIcon(noneImage);
		}
		if(beefOptions2.getSelectedItem() == fattyBrisket) {
			beef2 = "fattybrisket";
			ImageIcon fattyBrisketImage = new ImageIcon("Resources/fattybrisket.png");
			beefImage2.setIcon(fattyBrisketImage);
		}
		if(beefOptions2.getSelectedItem() == beefTendon) {
			beef2 = "tendon";
			ImageIcon beefTendonImage = new ImageIcon("Resources/beeftendon.png");
			beefImage2.setIcon(beefTendonImage);
		}
		if(beefOptions2.getSelectedItem() == none) {
			beef2 = "none";
			ImageIcon noneImage = new ImageIcon("Resources/none.png");
			beefImage2.setIcon(noneImage);
		}
		if(chickenOptions1.getSelectedItem() == chickenSkin) {
			chick1 = "chickenskin";
			ImageIcon chickenskin = new ImageIcon("Resources/chickenskin.png");
			chickenImage1.setIcon(chickenskin);
		}
		if(chickenOptions1.getSelectedItem() == chickenBreast) {
			chick1 = "chickenbreast";
			ImageIcon chickenbreast = new ImageIcon("Resources/chickenbreast.png");
			chickenImage1.setIcon(chickenbreast);
		}
		if(chickenOptions1.getSelectedItem() == none) {
			chick1 = "none";
			ImageIcon noneImage = new ImageIcon("Resources/none.png");
			chickenImage1.setIcon(noneImage);
		}
		if(chickenOptions2.getSelectedItem() == chickenSkin) {
			chick2 = "chickenskin";
			ImageIcon chickenskin = new ImageIcon("Resources/chickenskin.png");
			chickenImage2.setIcon(chickenskin);
		}
		if(chickenOptions2.getSelectedItem() == chickenBreast) {
			chick2 = "chickenbreast";
			ImageIcon fattyBrisket = new ImageIcon("Resources/chickenbreast.png");
			chickenImage2.setIcon(fattyBrisket);
		}
		if(chickenOptions2.getSelectedItem() == none) {
			chick2 = "none";
			ImageIcon noneImage = new ImageIcon("Resources/none.png");
			chickenImage2.setIcon(noneImage);
		}
	}
	
	public static String getBeef1() {
		return beef1;
	}
	
	public static String getBeef2() {
		return beef2;
	}

	public static String getChick1() {
		return chick1;
	}
	
	public static String getChick2() {
		return chick2;
	}
}
