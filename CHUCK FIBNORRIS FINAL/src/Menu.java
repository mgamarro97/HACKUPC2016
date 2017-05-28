import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Menu extends JFrame {
	
	public Menu() throws HeadlessException {
	JFrame frame = new JFrame("CHUCK FIBNORRIS");
	try {
		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("res/spaceFIBNorris.jpg")))));
	} catch (IOException e) {
		e.printStackTrace();
	}
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	panel.add(label);
	frame.add(panel);
	frame.setSize(1000,600);
	Component mouseClick = new MyComponent();
	frame.addMouseListener((MouseListener) mouseClick);
	frame.setLocationRelativeTo(null);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
public static class MyComponent extends JComponent implements MouseListener {	
	
	public void mouseClicked(MouseEvent e) {
		//System.out.println("here was a click ! ");
		Point location = getLocation();
		double X = e.getX();
		double Y = e.getY();
		if ( (X > 470) && (X < 550) && (Y > 380) && (Y < 425) ) {
			try {
				Desktop.getDesktop().open(new File("res/Project.jar"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} System.exit(0);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String args[]) {
		Menu menu = new Menu();
	}
}

}

