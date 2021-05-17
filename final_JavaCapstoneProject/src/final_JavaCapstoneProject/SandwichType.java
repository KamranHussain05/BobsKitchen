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
public class SandwichType extends JFrame implements ActionListener{

	private JButton grilledCheese;
	private JButton blt;
	private JButton banhmi;
	private JButton back;
	private JButton next;
	private static JPanel main;
	private static String sandwichType;
	
	public SandwichType() {
		super("Bob's Kitchen, Level 1");
		
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(1, 3);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Select Type Sandwich, you can only choose once!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	  //*********************************************************************************
	    ImageIcon grilledCheeseImage = new ImageIcon("Resources/none.png");
		grilledCheese = new JButton();
		grilledCheese.setIcon(grilledCheeseImage);
		grilledCheese.setHorizontalAlignment(JButton.CENTER);
		grilledCheese.setBackground(Color.WHITE);
		grilledCheese.addActionListener(this);
		this.add(grilledCheese);
		
		//Level 2, make a burger
		ImageIcon bltImage = new ImageIcon("Resources/none.png");
		blt = new JButton();
		blt.setIcon(bltImage);
		blt.setHorizontalAlignment(JButton.CENTER);
		blt.setBackground(Color.WHITE);
		blt.addActionListener(this);;
		this.add(blt);
		
		//Level 3, make a souffle pancake
		ImageIcon banhmiImage = new ImageIcon("Resources/none.png");
		banhmi = new JButton();
		banhmi.setIcon(banhmiImage);
		banhmi.setHorizontalAlignment(JButton.CENTER);
		banhmi.setBackground(Color.WHITE);
		banhmi.addActionListener(this);;
		this.add(banhmi);
		
		main.add(grilledCheese);
		main.add(blt);
		main.add(banhmi);
	    
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
		if(e.getSource() == grilledCheese) {
			System.out.println("Grilled Cheese Style selected");
			sandwichType = "grilled cheese";
			blt.setEnabled(false);
			banhmi.setEnabled(false);
		}
		if(e.getSource() == blt) {
			System.out.println("BLT Style Selected");
			sandwichType = "blt";
			grilledCheese.setEnabled(false);
			banhmi.setEnabled(false);
		}
		if(e.getSource() == banhmi) {
			System.out.println("banhmi");
			sandwichType = "banhmi";
			blt.setEnabled(false);
			grilledCheese.setEnabled(false);
		}
		if(e.getSource() == next) {
			System.out.println("Next Button Selected");
			SandwichStart window = new SandwichStart();
			window.setBounds(50,50, 1440,900);
			window.setBackground(new Color(211,211,211));
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == back) {
			System.out.println("Back Button Selected");
			ConfirmExit confirm = new ConfirmExit();
			confirm.setBounds(500, 500, 300,200);
			confirm.setBackground(new Color(211,211,211));
	    	confirm.setVisible(true);
	    	confirm.setIconImage(Main.getIcon());
	    	
	    	if(ConfirmExit.isDismissed() == true) {
	    		setVisible(false);
	    		dispose();
	    	}
		}
	}
	
	public static String getSandwichStyle() {
		return sandwichType;
	}

}
