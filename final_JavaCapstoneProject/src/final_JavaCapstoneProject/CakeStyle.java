package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class CakeStyle extends JFrame implements ActionListener{
	
	private JButton button;
	private JButton enter;
	private int value;
	private String password;
	private String typed = "";
	private JTextField update;
	private JPanel main;
	private boolean accepted;

	public CakeStyle() {
		main = new JPanel();
		GridLayout layout = new GridLayout(4,3,5,5);
		main.setLayout(layout);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		main.setBackground(new Color(200,200,200));
		
		//The title header with colors
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("Enter the Passcode");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    JPanel pressed = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    update = new JTextField();
	    update.setText(typed);
	    update.setEditable(false);
	    update.setAlignmentX(CENTER_ALIGNMENT);
	    update.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    update.setForeground(new Color(255, 255, 255));
	    update.setBackground(new Color(79, 93, 117));
	    header.add(update);
		
		for (int i = 0; i < 10; i++) {
			button = new JButton();
			String s = Integer.toString(value);
			button.setText(s);
			button.setActionCommand(s);
			button.setBackground(new Color(200,200,200));
			button.addActionListener(this);
			this.add(button);
			value++;
			main.add(button);
		}
		
		JPanel footer = new JPanel();
	    enter = new JButton();
	    enter.setText("Enter");
	    enter.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    enter.setBackground(new Color(191, 192, 192));
	    enter.addActionListener(this);;
	    this.add(enter);
	    footer.add(enter, BorderLayout.EAST);
		
		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(pressed, BorderLayout.NORTH);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		password = "213426960";
		if(e.getActionCommand().equals("0")) {
			System.out.println("Number 0 Button Selected");
			typed = typed + "0";
			refresh();
		}
		if(e.getActionCommand().equals("1")) {
			System.out.println("Number 1 Button Selected");
			typed = typed + "1";
			refresh();
		}
		if(e.getActionCommand().equals("2")) {
			System.out.println("Number 2 Button Selected");
			typed = typed + "2";
			refresh();
		}
		if(e.getActionCommand().equals("3")) {
			System.out.println("Number 3 Button Selected");
			typed = typed + "3";
			refresh();
		}
		if(e.getActionCommand().equals("4")) {
			System.out.println("Number 4 Button Selected");
			typed = typed + "4";
		}
		if(e.getActionCommand().equals("5")) {
			System.out.println("Number 5 Button Selected");
			typed = typed + "5";
			refresh();
		}
		if(e.getActionCommand().equals("6")) {
			System.out.println("Number 6 Button Selected");
			typed = typed + "6";
			refresh();
		}
		if(e.getActionCommand().equals("7")) {
			System.out.println("Number 7 Button Selected");
			typed = typed + "7";
			refresh();
		}
		if(e.getActionCommand().equals("8")) {
			System.out.println("Number 8 Button Selected");
			typed = typed + "8";
			refresh();
		}
		if(e.getActionCommand().equals("9")) {
			System.out.println("Number 9 Button Selected");
			typed = typed + "9";
			refresh();
		}
		
		if(typed.equals(password)) {
			accepted = true;
		}
		if(e.getSource() == enter && accepted == true) {
			System.out.println("Password Entered and Accepted");
		} else if(e.getSource() == enter && accepted == false){
			System.out.println("Incorrect Password");
		}
	}
	
	public void refresh() {
		update.setText("again");
	}

}