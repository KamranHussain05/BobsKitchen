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

public class SandwichStart extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	//Fields
	private JButton back;
	private JButton next;
	private JButton whiteBread;
	private JButton sweetBread;
	private JButton garlicBread;
	private static String breadType = "";

	//Constructor
	public SandwichStart() {
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
	    title.setText("Select Type of Bread");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    //*********************************************************************************
	    ImageIcon whiteBreadImage = new ImageIcon("Resources/whitebread.png");
		whiteBread = new JButton();
		whiteBread.setIcon(whiteBreadImage);
		whiteBread.setHorizontalAlignment(JButton.CENTER);
		whiteBread.setBackground(Color.WHITE);
		whiteBread.addActionListener(this);
		this.add(whiteBread);
		main.add(whiteBread);
		
		//Level 2, make a burger
		ImageIcon sweetBreadImage = new ImageIcon("Resources/sweetbread.png");
		sweetBread = new JButton();
		sweetBread.setIcon(sweetBreadImage);
		sweetBread.setHorizontalAlignment(JButton.CENTER);
		sweetBread.setBackground(Color.WHITE);
		sweetBread.addActionListener(this);;
		this.add(sweetBread);
		main.add(sweetBread);
		
		//Level 3, make a souffle pancake
		ImageIcon garlicBreadImage = new ImageIcon("Resources/garlicbread.png");
		garlicBread = new JButton();
		garlicBread.setIcon(garlicBreadImage);
		garlicBread.setHorizontalAlignment(JButton.CENTER);
		garlicBread.setBackground(Color.WHITE);
		garlicBread.addActionListener(this);;
		this.add(garlicBread);
		main.add(garlicBread);
	    
	    
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
			System.out.println("Back button pressed");
			
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
		if(e.getSource() == next) {
			System.out.println("Next button pressed");
			SandwichVeggies nextWindow = new SandwichVeggies();
			nextWindow.setBounds(50,50, 1440,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		//Breads *********************************************************************
		if(e.getSource() == whiteBread) {
			System.out.println("White Bread Selected");
			breadType = "White Bread";
			whiteBread.setBackground(new Color(211,211,211));
			sweetBread.setEnabled(false);
			garlicBread.setEnabled(false);
		}
		if(e.getSource() == sweetBread) {
			System.out.println("Sweet Bread Selected");
			breadType = "Sweet Bread";
			sweetBread.setBackground(new Color(211,211,211));
			whiteBread.setEnabled(false);
			garlicBread.setEnabled(false);
		}
		if(e.getSource() == garlicBread) {
			System.out.println("Garlic Bread");
			breadType = "Garlic Bread";
			garlicBread.setBackground(new Color(211,211,211));
			whiteBread.setEnabled(false);
			sweetBread.setEnabled(false);
		}
	}
	
	//Method
	public static String getBread() {
		return breadType;
	}

}
