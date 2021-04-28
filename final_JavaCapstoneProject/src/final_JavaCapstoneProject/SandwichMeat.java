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
public class SandwichMeat extends JFrame implements ActionListener{
	
	private JButton turkey;
	private JButton ham;
	private JButton steak;
	private JButton bacon;
	private JButton back;
	private JButton next;

	public SandwichMeat() {
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
	    title.setText("Select Type of Meat");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    //*********************************************************************************
	    ImageIcon turkeyImage = new ImageIcon("Resources/turkey.png");
		turkey = new JButton();
		turkey.setIcon(turkeyImage);
		turkey.setHorizontalAlignment(JButton.CENTER);
		turkey.setBackground(Color.WHITE);
		turkey.addActionListener(this);
		this.add(turkey);
		main.add(turkey);
		
		//Level 2, make a burger
		ImageIcon hamImage = new ImageIcon("Resources/ham.png");
		ham = new JButton();
		ham.setIcon(hamImage);
		ham.setHorizontalAlignment(JButton.CENTER);
		ham.setBackground(Color.WHITE);
		ham.addActionListener(this);;
		this.add(ham);
		main.add(ham);
		
		//Level 3, make a souffle pancake
		ImageIcon steakImage = new ImageIcon("Resources/steak.png");
		steak = new JButton();
		steak.setIcon(steakImage);
		steak.setHorizontalAlignment(JButton.CENTER);
		steak.setBackground(Color.WHITE);
		steak.addActionListener(this);;
		this.add(steak);
		main.add(steak);

		ImageIcon baconImage = new ImageIcon("Resources/bacon.png");
		bacon = new JButton();
		bacon.setIcon(baconImage);
		bacon.setHorizontalAlignment(JButton.CENTER);
		bacon.setBackground(Color.WHITE);
		bacon.addActionListener(this);
		this.add(bacon);
		main.add(bacon);
	    
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
	    next.addActionListener(this);
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
			SandwichVeggies back = new SandwichVeggies();
			back.setBounds(50,50,1440,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			SandwichCondiments next = new SandwichCondiments();
			next.setBounds(50,50,1440,900);
			next.setBackground(new Color(211,211,211));
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
	}

}
