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
public class PhoToppings extends JFrame implements ActionListener {

	private static JPanel main;
	private static String top1;
	private static String top2;
	private static String top3;
	
	private JButton next;
	private JButton back;
	
	private JButton greenOnion;
	private JButton basil;
	private JButton scallions;
	private JButton cilantro;
	private JButton friedOnions;
	private JButton beanSprouts;
	private JButton chiliOil;
	private JButton sriracha;
	private JButton hoison;
	
	public PhoToppings() {
		main = new JPanel();
		GridLayout mainLayout = new GridLayout(3, 3);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		mainLayout.setVgap(5);
		mainLayout.setHgap(5);
		main.setLayout(mainLayout);
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Pho Condiments");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    ImageIcon greenOnionImage = new ImageIcon("Resources/greenonion.png");
	    greenOnion = new JButton();
	    greenOnion.setBackground(Color.WHITE);
	    greenOnion.setEnabled(true);
	    greenOnion.setIcon(greenOnionImage);
	    greenOnion.addActionListener(this);
	    this.add(greenOnion);
	    main.add(greenOnion);
	    
	    ImageIcon basilImage = new ImageIcon("Resources/basil.png");
	    basil = new JButton();
	    basil.setBackground(Color.WHITE);
	    basil.setEnabled(true);
	    basil.setIcon(basilImage);
	    basil.addActionListener(this);
	    this.add(basil);
	    main.add(basil);
	    
	    ImageIcon scallionsImage = new ImageIcon("Resources/scallions.png");
	    scallions = new JButton();
	    scallions.setBackground(Color.WHITE);
	    scallions.setEnabled(true);
	    scallions.setIcon(scallionsImage);
	    scallions.addActionListener(this);
	    this.add(scallions);
	    main.add(scallions);
	    
	    ImageIcon cilantroImage = new ImageIcon("Resources/cilantro.png");
	    cilantro = new JButton();
	    cilantro.setBackground(Color.WHITE);
	    cilantro.setEnabled(true);
	    cilantro.setIcon(scallionsImage);
	    cilantro.addActionListener(this);
	    this.add(cilantro);
	    main.add(cilantro);
	    
	    ImageIcon friedOnionsImage = new ImageIcon("Resources/friedonions.png");
	    friedOnions = new JButton();
	    friedOnions.setBackground(Color.WHITE);
	    friedOnions.setEnabled(true);
	    friedOnions.setIcon(friedOnionsImage);
	    friedOnions.addActionListener(this);
	    this.add(friedOnions);
	    main.add(friedOnions);
	    
	    ImageIcon beanSproutsImage = new ImageIcon("Resources/beansprouts.png");
	    beanSprouts = new JButton();
	    beanSprouts.setBackground(Color.WHITE);
	    beanSprouts.setEnabled(true);
	    beanSprouts.setIcon(beanSproutsImage);
	    beanSprouts.addActionListener(this);
	    this.add(beanSprouts);
	    main.add(beanSprouts);
	    
	    ImageIcon chiliOilImage = new ImageIcon("Resources/chilioil.png");
	    chiliOil = new JButton();
	    chiliOil.setBackground(Color.WHITE);
	    chiliOil.setEnabled(true);
	    chiliOil.setIcon(chiliOilImage);
	    chiliOil.addActionListener(this);
	    this.add(chiliOil);
	    main.add(chiliOil);
	    
	    ImageIcon srirachaImage = new ImageIcon("Resources/sriracha.png");
	    sriracha = new JButton();
	    sriracha.setBackground(Color.WHITE);
	    sriracha.setEnabled(true);
	    sriracha.setIcon(srirachaImage);
	    sriracha.addActionListener(this);
	    this.add(sriracha);
	    main.add(sriracha);
	    
	    ImageIcon hoisonImage = new ImageIcon("Resources/hoisinsauce.png");
	    hoison = new JButton();
	    hoison.setBackground(Color.WHITE);
	    hoison.setEnabled(true);
	    hoison.setIcon(hoisonImage);
	    hoison.addActionListener(this);
	    this.add(hoison);
	    main.add(hoison);
	    
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
			PhoMeat back = new PhoMeat();
			back.setBounds(50,50,1440,900);
			back.setBackground(new Color(211,211,211));;
			back.setVisible(true);
			back.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		if(e.getSource() == next) {
			System.out.println("next selected");
			Home next = new Home();
			next.setBounds(50,50,1440,900);
			next.setBackground(new Color(211,211,211));;
			next.setVisible(true);
			next.setIconImage(Main.getIcon());
			
			setVisible(false);
			dispose();
		}
		
	}
}
