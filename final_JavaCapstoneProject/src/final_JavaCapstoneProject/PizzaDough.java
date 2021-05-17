package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PizzaDough extends JFrame implements ActionListener { 
	
	private JButton newYork;
	private JButton neopolitan;
	private JButton back;
	private JButton next;
	private final static JPanel main = new JPanel();

	public PizzaDough() {
		super("Select Pizza Style");
		
		GridLayout layout = new GridLayout(3,1);
		layout.setVgap(5);
		layout.setHgap(5);
		main.setBackground(new Color(200,200,200));
		main.setLayout(layout);
		
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

		ImageIcon newYorkImage = new ImageIcon("Resources/none.png");
		newYork = new JButton();
		newYork.setIcon(newYorkImage);
		newYork.setHorizontalAlignment(JButton.CENTER);
		newYork.setBackground(Color.WHITE);
		newYork.addActionListener(this);
		this.add(neopolitan);
		
		ImageIcon neopolitanImage = new ImageIcon("Resources/none.png");
		neopolitan.setIcon(neopolitanImage);
		neopolitan.setHorizontalAlignment(JButton.CENTER);
		neopolitan.setBackground(Color.WHITE);
		neopolitan.addActionListener(this);
		this.add(neopolitan);
		main.add(newYork);
		main.add(neopolitan);
		
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

	public Component getContent() {
		return main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == neopolitan) {
			System.out.println("Neopolitan Style Selected");
		}
		if(e.getSource()==neopolitan) {
			System.out.println("Neopolitan Style Selected");
		}
		if(e.getSource() == back) {
			System.out.println("Back button selected");
		}
		if(e.getSource() == next) {
			System.out.println("Next button selected");
		}
	}
}