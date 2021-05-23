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
public class GameOver extends JFrame implements ActionListener {
	
	private JPanel main;
	private JButton endGame;
	private JButton prize;

	public GameOver() {
		super("Bob's Kitchen");
		

		main = new JPanel();
		GridLayout layout = new GridLayout(1,2);
		layout.setHgap(5);
		main.setLayout(layout);
		main.setBackground(new Color(211,211,211));
		
		JPanel header = new JPanel();
	    header.setBackground(new Color(79, 93, 117));
	    JTextPane title = new JTextPane();
	    title.setText("You Unlocked Bob's Secret Vault!");
	    title.setEditable(false);
	    title.setAlignmentX(CENTER_ALIGNMENT);
	    title.setFont(new Font("Montserrat", Font.PLAIN, 40));
	    title.setForeground(new Color(255, 255, 255));
	    title.setBackground(new Color(79, 93, 117));
	    header.add(title);
	    
	    prize = new JButton();
	    prize.setBackground(Color.WHITE);
	    prize.setIcon(new ImageIcon("Resources/rickroll.gif"));
	    main.add(prize);
	    
	    JLabel summary = new JLabel();
	    summary.setText("<html><b>Congratulations on Entering Bob's Vault</b>,"
	    		+"<br> You have worked hard to get here! And you have proven you are worthy"
	    		+"<br> of the contents in my secret vault to the left. Well Done! <br> -Bob the Kitchen</html>");
	    summary.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    main.add(summary);
	    
	    JPanel footer = new JPanel();
	    endGame = new JButton();
	    endGame.setText("End Game");
	    endGame.setFont(new Font("Montserrat", Font.PLAIN, 20));
	    endGame.setBackground(new Color(191, 192, 192));
	    endGame.addActionListener(this);;
	    this.add(endGame);
	    footer.add(endGame, BorderLayout.EAST);

		Container base = getContentPane();
		base.add(header, BorderLayout.BEFORE_FIRST_LINE);
		base.add(main, BorderLayout.CENTER);
		base.add(footer, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == endGame) {
			System.exit(0);
		}
		
	}

}
