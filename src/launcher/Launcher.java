package launcher;

import java.awt.Toolkit;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student s1 = new Student(43195779,"Harguindeguy","Juan Cruz","juancruzhar123@gmail.com","https://github.com/JuancruzHarguindeguy","/images/trol.png");
            	
            	SimplePresentationScreen s = new SimplePresentationScreen(s1);
            	s.setVisible(true);
            	s.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/tdp.png")));
            }
            
        });
    }
}