//Author: Kevin Choi
//Date: 5/22/2021 
//Revision 08
package final_JavaCapstoneProject;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	
	public static Home home = new Home();

	//The app's icon image, needed for all frames
	public static Image getIcon() {
		ImageIcon appIcon = new ImageIcon("Resources/appicon.png");
    	Image icon = appIcon.getImage();
    	return icon;
	}
	
	public static void closeHome() {
		home.setVisible(false);
		home.dispose();
	}
	//Main method that runs the home frame, starts the game
	public static void main(String[] args) {
    	home.setBounds(50, 50, 1000, 900);
    	home.setBackground(new Color(211,211,211));
    	home.setVisible(true);
    	home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	home.setIconImage(getIcon());
	}

}
