//Author: Kevin Choi and Kamran Hussain
//Date: 5/22/2021 
//Revision 08

package final_JavaCapstoneProject;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//The Main class is also a Home
public class Main extends Home {
	
	//Field that instantiates the main JFrame
	static Main main = new Main();
	
	//The app's icon image, needed for all frames
	public static Image getIcon() {
		ImageIcon appIcon = new ImageIcon("Resources/appicon.png");
    	Image icon = appIcon.getImage();
    	return icon;
	}
	//Closes the home page
	public static void closeHome() {
		main.setVisible(false);
		main.dispose();
	}
	//Main method that runs the home frame, starts the game
	public static void main(String[] args) {
		
    	main.setBounds(50, 50, 1000, 900);
    	main.setBackground(new Color(211,211,211));
    	main.setVisible(true);
    	main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	main.setIconImage(getIcon());
	}

}
