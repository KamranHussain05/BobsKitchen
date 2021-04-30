package final_JavaCapstoneProject;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Main {
	
	public static Home home = new Home();

	//The app's icon image, needed for all frames
	public static Image getIcon() {
		ImageIcon appIcon = new ImageIcon("Resources/sandwich.png");
    	Image icon = appIcon.getImage();
    	return icon;
	}
	
	public static void closeHome() {
		home.setVisible(false);
		home.dispose();
	}
	//Main method that runs the home frame, starts the game
	public static void main(String[] args) {
    	home.setBounds(50, 50, 1440, 900);
    	home.setBackground(new Color(211,211,211));
    	home.setVisible(true);
    	home.setIconImage(getIcon());
	}

}
