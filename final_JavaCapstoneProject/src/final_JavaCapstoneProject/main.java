package final_JavaCapstoneProject;

import java.awt.Color;
import javax.swing.ImageIcon;

public class main {

	public static void main(String[] args) {
		Home home = new Home();
    	home.setBounds(500, 500, 1440, 900);
    	home.setBackground(new Color(211,211,211));
    	home.setVisible(true);
    	
    	ImageIcon appIcon = new ImageIcon("Resources/sandwich.png");
    	home.setIconImage(appIcon.getImage());
	}

}
