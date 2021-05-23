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
public class PhoNoodles extends JFrame implements ActionListener {

	private JButton back;
	private JButton next;
	private JButton glassNoodles;
	private JButton vermicelli;
	private static JPanel main;
	private static String noodles;
	
	public PhoNoodles() {
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
	    title.setText("Select Type of Noodles");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    ImageIcon glassNoodleImage = new ImageIcon("Resources/glassnoodle.png");
		glassNoodles = new JButton();
		glassNoodles.setIcon(glassNoodleImage);
		glassNoodles.setHorizontalAlignment(JButton.CENTER);
		glassNoodles.setBackground(Color.WHITE);
		glassNoodles.addActionListener(this);
		this.add(glassNoodles);
		main.add(glassNoodles);
		
		ImageIcon vermicelliImage = new ImageIcon("Resources/vermicelli.png");
		vermicelli = new JButton();
		vermicelli.setIcon(vermicelliImage);
		vermicelli.setHorizontalAlignment(JButton.CENTER);
		vermicelli.setBackground(Color.WHITE);
		vermicelli.addActionListener(this);;
		this.add(vermicelli);
		main.add(vermicelli);
	    
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
			
			PhoMeat window = new PhoMeat();
			window.setBounds(50, 50, 1440,900);
			window.setBackground(new Color(211,211,211));
	    	window.setVisible(true);
	    	window.setIconImage(Main.getIcon());
	    	
	    	setVisible(false);
	    	dispose();
		}
		if(e.getSource() == next) {
			System.out.println("Next button pressed");
			PhoToppings nextWindow = new PhoToppings();
			nextWindow.setBounds(50,50, 1440,900);
			nextWindow.setBackground(new Color(211,211,211));
			nextWindow.setVisible(true);
			nextWindow.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
		if(e.getSource() == glassNoodles) {
			System.out.println("Glass Noodles Selected");
			noodles = "glass noodles";
			vermicelli.setEnabled(false);
		}
		if(e.getSource() == vermicelli) {
			System.out.println("Vermicelli Noodles Selected");
			noodles = "vermicelli";
			vermicelli.setEnabled(false);
		}
	}

	public static String getNoodles() {
		return noodles;
	}
}
