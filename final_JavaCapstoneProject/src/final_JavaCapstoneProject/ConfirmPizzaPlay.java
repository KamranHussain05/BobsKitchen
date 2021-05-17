package final_JavaCapstoneProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ConfirmPizzaPlay extends JFrame implements ActionListener {

	private JButton dismiss;
	
	public ConfirmPizzaPlay() {
	super("Confirm Playthrough");
		JPanel main = new JPanel();
		main.setBackground(new Color(200,200,200));
		
		JLabel warning = new JLabel();
		warning.setText("Are you Ready to Play?");
		main.add(warning);
		
		dismiss = new JButton();
		dismiss.setText("Yes! Im Hungry!");
		dismiss.setBackground(new Color(79,93,117));
		dismiss.setForeground(Color.WHITE);
		dismiss.addActionListener(this);
		this.add(dismiss);
		
		Container base = getContentPane();
		base.add(main, BorderLayout.CENTER);
		base.add(dismiss, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Pizza Playthrough Confirmed");
		PizzaStyle start = new PizzaStyle();
		start.setBounds(50,50,1440,900);
		start.setBackground(new Color(211,211,211));;
		start.setVisible(true);
		start.setIconImage(Main.getIcon());
		
		Main.closeHome();
		setVisible(false);
		dispose();
	}

}
