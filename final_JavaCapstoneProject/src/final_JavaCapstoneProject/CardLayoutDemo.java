package final_JavaCapstoneProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CardLayoutDemo extends JFrame implements ActionListener {
	
    JPanel cards; 
    JPanel card2;
    JPanel card3;//a panel that uses CardLayout
    final static String BUTTONPANEL = "Home Page";
    final static String TEXTPANEL = "Sandwich Finish";
    final String next = "next";
    final String previous = "previous";
    
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
        JButton cb = new JButton("next");
        cb.setActionCommand(next);
        cb.addActionListener(this);
        cb.setText("Button");
        this.add(cb);
        comboBoxPane.add(cb);
        
        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(HomeGui.getBody());
        
        card2 = new JPanel();
        card2.add(HomeGui.getSecondCard());
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, next);
        cards.add(card2, TEXTPANEL);
        
        @SuppressWarnings("unused")
		class ControlActionListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	        	CardLayout c1 = (CardLayout)(cards.getLayout());
	        	String button = e.getActionCommand();
	        	if(button.equals(next)) {
	        		c1.next(cards);
	        	}
	        	if(button.equals(previous)) {
	        		c1.previous(cards);
	        	}
	        }
        }
        
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    public void actionPerformed(ActionEvent e) {
    	CardLayout c1 = (CardLayout)(cards.getLayout());
    	String button = e.getActionCommand();
    	if(button.equals(next)) {
    		c1.next(cards);
    	}
    }
    
    public static void main(String[] args) {
    	
    	CardLayoutDemo window = new CardLayoutDemo();
    	window.setBounds(50, 50, 700, 500);
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