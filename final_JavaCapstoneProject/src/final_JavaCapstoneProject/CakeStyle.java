package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CakeStyle extends JFrame implements ActionListener{
	
	private JLabel label;
	private JLabel error;
	private JPanel main;
	private JTextField inputPassword;
	private JButton enter;
	private JButton back;
	private String password = "afullpassword";
	private boolean accepted;

	public CakeStyle() {
		main = new JPanel();
		GridLayout layout = new GridLayout(4,1, 5, 5);
		main.setLayout(layout);
		main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		main.setBackground(new Color(200,200,200));
		
		label = new JLabel();
		label.setText("<html> <b>Enter the Password You Have Found!</b> <br>"
				+ " Pasword is 9 characters and case sensitive</html>");
		
		inputPassword = new JTextField(20);

		accepted = false;
		
		enter = new JButton();
		enter.setText("Enter");
		enter.addActionListener(this);
		this.add(enter);
		
		error = new JLabel();
		error.setText("");
		
		main.add(label);
		main.add(inputPassword);
		main.add(enter);
		main.add(error, BorderLayout.CENTER);
		
		Container base = getContentPane();
		base.add(main);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enter) {
			System.out.println("password entered");
			String input = inputPassword.getText();
			if(input == password) {
				System.out.println("Password is Right, ready to move on");
				error.setText("Password Accepted! Move on...");
				accepted = true;
			} else {
				System.out.println("Password is Wrong, Trying again");
				error.setText("Incorrect Password. Try Again");
				accepted = false;
			}
			if(accepted == true) {
				JFrame window = new JFrame();
			}
		}
		
	}

}
