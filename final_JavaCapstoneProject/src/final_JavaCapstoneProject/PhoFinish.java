package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PhoFinish extends JFrame implements ActionListener {

	private JButton submit;
	private JButton back;
	private static JPanel main;
	
	public PhoFinish() {
super("Level 1: Sandwich");
		
		main = new JPanel();
		GridLayout layout = new GridLayout(1,2);
		layout.setHgap(5);
		main.setLayout(layout);
		main.setBackground(new Color(211,211,211));
		
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Finish");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    JPanel left = new JPanel();
	    left.setBackground(Color.WHITE);
	    JLabel imgLabel = new JLabel();
	    if(PhoStyle.getPhoType() == "veggie pho") {
	    	ImageIcon vegIcon = new ImageIcon("Resources/veggiepho.png");
	    	imgLabel.setIcon(vegIcon);
	    }
	    if(PhoStyle.getPhoType() == "beef pho") {
	    	ImageIcon beefIcon = new ImageIcon("Resources/beefpho.png");
	    	imgLabel.setIcon(beefIcon);
	    }
	    if(PhoStyle.getPhoType() == "chicken pho") {
	    	ImageIcon chickenIcon = new ImageIcon("Resources/chickenpho.png");
	    	imgLabel.setIcon(chickenIcon);
	    }
	    left.add(imgLabel);
	    main.add(left);
	    
	    //******************************************************
	    JPanel right = new JPanel();
	    GridLayout rightLayout = new GridLayout(7,1);
	    right.setLayout(rightLayout);
	    right.setBackground(Color.WHITE);
	    
	    JTextPane ingredients = new JTextPane();
	    ingredients.setText("Ingredients");
	    ingredients.setFont(new Font("Montserrat", Font.PLAIN, 35));
	    ingredients.setForeground(new Color(255, 255, 255));
	    ingredients.setBackground(new Color(79, 93, 117));
	    ingredients.setAlignmentX(CENTER_ALIGNMENT);
	    right.add(ingredients, BorderLayout.CENTER);
	    
	    JLabel phoType = new JLabel();
	    phoType.setText("<html><b>Pho Style:</b> " + PhoStyle.getPhoType());
	    phoType.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(phoType, BorderLayout.CENTER);
	    
	    JLabel broth = new JLabel();
	    broth.setText("<html><b>Broth Stock:</b> " + PhoStock.getStock());
	    broth.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(broth, BorderLayout.WEST);
	    
	    JLabel meat = new JLabel();
	    meat.setText("<html><b>Meat:</b><br>" + 
	    		PhoMeat.getBeef1() + 
	    		"<br>        "+ PhoMeat.getBeef2() +
	    		"<br>        " + PhoMeat.getChick1() +
	    		"<br>        " + PhoMeat.getChick2());
	    meat.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(meat);
	    
	    JLabel noodle = new JLabel();
	    noodle.setText("<html><b>Noodles:</b>        " + PhoNoodles.getNoodles());
	    noodle.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(noodle);
	    
	    JLabel condiments = new JLabel();
	    condiments.setText("<html><b>Toppings:</b>        "+ PhoToppings.getTop1() 
	    					+"<br>" + PhoToppings.getTop2()
	    					+"<br>" + PhoToppings.getTop3()
	    					+"<br>" + PhoToppings.getTop4()
	    					+"<br>" + PhoToppings.getTop5()
	    					+"<br>" + PhoToppings.getTop6()
	    					+"<br>" + PhoToppings.getTop7()
	    					+"<br>" + PhoToppings.getTop8()
	    					+"<br>" + PhoToppings.getTop9());
	    condiments.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    right.add(condiments);
	    
	    main.add(right);

	    JPanel footer = new JPanel();
	    back = new JButton();
	    back.setText("Back");
	    back.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    back.setBackground(new Color(191, 192, 192));
	    back.addActionListener(this);;
	    this.add(back);
	    submit = new JButton();
	    submit.setText("Submit Dish");
	    submit.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    submit.setBackground(new Color(191, 192, 192));
	    submit.addActionListener(this);;
	    this.add(submit);
	    footer.add(back, BorderLayout.EAST);
	    footer.add(submit, BorderLayout.WEST);

		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			System.out.println("back selected");
			SandwichCondiments back = new SandwichCondiments();
			back.setBounds(50,50,1440,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == submit) {
			System.out.println("submit dish selected");
			
			if(PhoStyle.getPhoType() == "veggie pho") {
				Scorer.veggiePho(PhoStock.getStock(), 
						PhoNoodles.getNoodles(), PhoMeat.getBeef1(), 
						PhoMeat.getBeef2(), PhoMeat.getChick1(), PhoMeat.getChick2(),
						PhoToppings.getTop1(), PhoToppings.getTop2(), PhoToppings.getTop3(),
						PhoToppings.getTop4(), PhoToppings.getTop5(), PhoToppings.getTop6(),
						PhoToppings.getTop7(), PhoToppings.getTop8(), PhoToppings.getTop9());
				submit.setEnabled(false);	
			}
			
			if(PhoStyle.getPhoType() == "beef pho") {
				Scorer.beefPho(PhoStock.getStock(), 
						PhoNoodles.getNoodles(), PhoMeat.getBeef1(), 
						PhoMeat.getBeef2(), PhoMeat.getChick1(), PhoMeat.getChick2(),
						PhoToppings.getTop1(), PhoToppings.getTop2(), PhoToppings.getTop3(),
						PhoToppings.getTop4(), PhoToppings.getTop5(), PhoToppings.getTop6(),
						PhoToppings.getTop7(), PhoToppings.getTop8(), PhoToppings.getTop9());
				submit.setEnabled(false);
			}
			
			if(PhoStyle.getPhoType() == "chicken pho") {
				Scorer.chickenPho(PhoStock.getStock(), 
						PhoNoodles.getNoodles(), PhoMeat.getBeef1(), 
						PhoMeat.getBeef2(), PhoMeat.getChick1(), PhoMeat.getChick2(),
						PhoToppings.getTop1(), PhoToppings.getTop2(), PhoToppings.getTop3(),
						PhoToppings.getTop4(), PhoToppings.getTop5(), PhoToppings.getTop6(),
						PhoToppings.getTop7(), PhoToppings.getTop8(), PhoToppings.getTop9());
				submit.setEnabled(false);
			}
			
			ScoreWindow window = new ScoreWindow();
			window.setBounds(50,50,1440,900);
			window.setVisible(true);
			window.setIconImage(Main.getIcon());
			window.setBackground(new Color(211,211,211));
			
			dispose();
			setVisible(false);
		}
		
	}
}
