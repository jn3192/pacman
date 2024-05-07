import java.awt.*;
import javax.swing.*;
import java.util.*;

//public class MyCanvas extends JPanel{

class MyCanvas extends JPanel{
	int ix;
	int iy;
	
    /**
     * @param sizeWidth
     * @param sizeHeight
     */
	public MyCanvas(int sizeWidth, int sizeHeight){
		setPreferredSize(new Dimension(sizeWidth,sizeHeight));
		//setting our background with a method that belong to out parent class
		setBackground(Color.black);
	}



    /**
     * this method replaces something in the parent class
     */
    @Override
	public void paintComponent(Graphics g){
		//super allows to still use important code in parent class but overriding 
		super.paintComponent(g);
		//g.setColor(Color.red);
		// g.fillOval(this.ix, this.iy,3,3);
	}

	// public void drawPoint(int x, int y){
	// 	this.ix=x;
	// 	this.iy=y;
	// 	repaint();
	// }

	public static void main( String args[] )
        { 
        JFrame window = new JFrame("naur");
        
        //when we close the window stop the app
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyCanvas canvas = new MyCanvas( 600, 300);
         window.add(canvas);

        //fit the window around the compents (just our canvas)
        window.pack();

        //dont allow the user to resize the window
        window.setResizable(false);

        //open window in the center of the screen
        window.setLocationRelativeTo(null);

        //display the window
        window.setVisible(true);
        }


}

