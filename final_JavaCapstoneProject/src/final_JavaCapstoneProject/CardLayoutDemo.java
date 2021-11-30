//Author: Kamran Hussain
//Date: 5/23/21
//Rev: 01 - CardLayout is used with the HomeGUI class to call cards(panels)
//Rev 02 - CardLayout is expanded to multiple classes.
//NOTE: CARDLAYOUT IS NOT INCLUDED IN HEIRARHCY -- CLASS IS RESEARCH

package final_JavaCapstoneProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CardLayoutDemo extends JFrame implements ActionListener {
	
	//Creates the cards that are switched to refresh the main window
    static JPanel cards; 
    static JPanel card1;
    private JPanel card2;
//    private JPanel card3; //a panel that uses CardLayout
//    private JPanel card4;
    static CardLayout c1;
    static String next = "next";
    static String previous = "previous";
    static String home = "home";
    static String sandwichType = "st";
    static String sandwichBread = "sb";
    JTextPane title;
    
    //Sets the window title.
    public CardLayoutDemo() {
    	super("Bob's Kitchen");
    }
    
    //Adds content to the content pane of the window
    public void addComponentToPane(Container pane) {
    	
        //Create the "cards".
        card1 = new JPanel();
        card1.add(Home.getBody());
        
        card2 = new JPanel();
        card2.add(HomeGui.getSecondCard());
        
//        card3 = new JPanel();
//        card3.add(CakeStyle.getBody());
//       
//        card4 = new JPanel();
//        card4.add(SandwichType.getBody());
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        cards.add(card1, next);
        cards.add(card2, previous);
//        cards.add(card3, home);
        
    	JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    title = new JTextPane();
	    title.setText("Bob's Kitchen!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    JPanel footer = new JPanel();
        JButton cb = new JButton("next");
        cb.setActionCommand(next);
        cb.addActionListener(this);
        cb.setText("Forward");
        this.add(cb);
        footer.add(cb);
        
        JButton cb2 = new JButton("previous");
        cb2.setActionCommand(previous);
        cb2.addActionListener(this);
        cb2.setText("Back");
        this.add(cb2);
        footer.add(cb2);
        
        JButton cb3 = new JButton("other");
        cb3.setActionCommand(home);
        cb3.addActionListener(this);
        cb3.setText("other");
        this.add(cb3);
        footer.add(cb3);
        
        JPanel bottom = new JPanel();
        bottom.add(cards);

        pane.add(header, BorderLayout.BEFORE_FIRST_LINE);
        pane.add(bottom, BorderLayout.CENTER);
        pane.add(footer, BorderLayout.AFTER_LAST_LINE);
    }
    
    //switches the cards when the proper button is clicked.
    public void actionPerformed(ActionEvent e) {
    	c1 = (CardLayout)(cards.getLayout());
    	String button = e.getActionCommand();
    	if(button.equals(next)) {
    		c1.next(cards);
    	}
    	if(button.equals(previous)) {
    		c1.previous(cards);
    	}
    	if(button.equals(home)) {
    		c1.show(cards, home);
    	}
    	if(button.equals(SandwichType.getGrilledCheese())) {
    		System.out.println("Sandwich listener is working");
    	}
    }
    //the main method for this research to create the window
    public static void main(String[] args) {
    	
    	CardLayoutDemo window = new CardLayoutDemo();
    	window.setExtendedState(JFrame.MAXIMIZED_BOTH);
    	window.setUndecorated(false);
    	window.setBackground(new Color(211,211,211));
    	window.setVisible(true);
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.setIconImage(Main.getIcon());
    	
    	CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(window.getContentPane());
        
        //Display the window.
        window.pack();
    }
}