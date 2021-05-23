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
public class PhoStyle extends JFrame implements ActionListener {
	
	private JButton back;
	private JButton next;
	private JButton veggie;
	private JButton chicken;
	private JButton beef;
	private static JPanel main;
	private static String phoType;

	public PhoStyle() {
		super("Bob's Kitchen");
		
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
	    title.setText("Select Type of Pho, you can only choose once!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	  //*********************************************************************************
	    ImageIcon veggiePhoImage = new ImageIcon("Resources/veggiepho.png");
		veggie = new JButton();
		veggie.setIcon(veggiePhoImage);
		veggie.setHorizontalAlignment(JButton.CENTER);
		veggie.setBackground(Color.WHITE);
		veggie.addActionListener(this);
		this.add(veggie);
		
		//Level 2, make a burger
		ImageIcon beefPhoImage = new ImageIcon("Resources/beefpho.png");
		beef = new JButton();
		beef.setIcon(beefPhoImage);
		beef.setHorizontalAlignment(JButton.CENTER);
		beef.setBackground(Color.WHITE);
		beef.addActionListener(this);;
		this.add(beef);
		
		//Level 3, make a souffle pancake
		ImageIcon chickenPhoImage = new ImageIcon("Resources/chickenpho.png");
		chicken = new JButton();
		chicken.setIcon(chickenPhoImage);
		chicken.setHorizontalAlignment(JButton.CENTER);
		chicken.setBackground(Color.WHITE);
		chicken.addActionListener(this);;
		this.add(chicken);
		
		main.add(veggie);
		main.add(beef);
		main.add(chicken);
	    
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
		if(e.getSource() == next) {
			System.out.println("Next Button Selected");
			PhoStock window = new PhoStock();
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
			confirm.setBounds(500, 500, 300, 200);
			confirm.setBackground(new Color(211,211,211));
	    	confirm.setVisible(true);
	    	confirm.setIconImage(Main.getIcon());
	    	
	    	if(ConfirmExit.isDismissed() == true) {
	    		setVisible(false);
	    		dispose();
	    	}
		
		}
		
		if(e.getSource() == veggie) {
			System.out.println("Veggie Pho Style selected");
			phoType = "veggie pho";
			beef.setEnabled(false);
			chicken.setEnabled(false);
		}
		if(e.getSource() == beef) {
			System.out.println("Beef Pho Style Selected");
			phoType = "beef pho";
			veggie.setEnabled(false);
			chicken.setEnabled(false);
		}
		if(e.getSource() == chicken) {
			System.out.println("Chicken Pho Style Selected");
			phoType = "chicken pho";
			beef.setEnabled(false);
			veggie.setEnabled(false);
		}
	}
	
	public static String getPhoType() {
		return phoType;
	}

}
