package final_JavaCapstoneProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CardLayoutDemo extends JFrame implements ActionListener {
	
    JPanel cards; 
    JPanel card1;
    JPanel card2;
    JPanel card3;//a panel that uses CardLayout
    final String next = "next";
    final String previous = "previous";
    final String specific = "other";
    JTextPane title;
    
    public CardLayoutDemo() {
    	super("Bob's Kitchen");
    }
    
    public void addComponentToPane(Container pane) {
    	
        //Create the "cards".
        card1 = new JPanel();
        card1.add(Home.getBody());
        
        card2 = new JPanel();
        card2.add(HomeGui.getSecondCard());
        
        card3 = new JPanel();
        card3.add(HomeGui.getBody());
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        cards.add(card1, next);
        cards.add(card2, previous);
        cards.add(card3, specific);
        
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
        cb3.setActionCommand(specific);
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
    
    public void actionPerformed(ActionEvent e) {
    	CardLayout c1 = (CardLayout)(cards.getLayout());
    	String button = e.getActionCommand();
    	if(button.equals(next)) {
    		c1.next(cards);
    	}
    	if(button.equals(previous)) {
    		c1.previous(cards);
    	}
    	if(button.equals(specific)) {
    		c1.show(cards, specific);
    	}
    }
    
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