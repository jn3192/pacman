import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display {
    public static int WIDTH;
    public static int HIEGHT;

    PacMan pacman;

    public Display(){
    //creat a windwo frame and set the title in the toolbar
    JFrame window = new JFrame("Art");
    MyCanvas canvas = new MyCanvas(WIDTH,HEIGHT);  
    //when we close the window stop the app
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);////window.setSize(900,600);
    //canvas.setPreferredSize(prefferedsize);`
    window.add(canvas);
    //dont allow the user to resize the window
    window.setResizable(false);
    //open window in the center of the screen
    window.setLocationRelativeTo(null);
    //display the window
    window.setVisible(true);
    System.out.println("works");
    }
    public static void main (String args[]){
        Display bruh= new Display();
    }
}
