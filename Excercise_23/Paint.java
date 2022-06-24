package Excercise_23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Paint  extends JPanel implements MouseListener{
//	String blueStr,redStr,ovalStr,squareStr,fillStr,outLineStr;
	Graphics g ;
	boolean isActive;
	int oX,oY;
	Paint(){
		this.setBackground(Color.yellow);
		this.addMouseListener(this);
	}
	public void clear() {
		Graphics g1 = getGraphics();
		g1.setColor(Color.yellow);
		g1.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	MouseMotionListener mouseMotionListener = new MouseMotionListener() {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
			if (isActive) {
				int x = e.getX();
				int y =	e.getY();
				int size =(int) Math.sqrt((x-oX)*(x-oX)+(y-oY)*(y-oY)) ;
				System.out.println(size);
				System.out.println(x+""+y);
				g=getGraphics();
				
				if (Controller.redStr.equalsIgnoreCase("Red")) {
					g.setColor(Color.red);
					System.out.println("red");
					if(Controller.squareStr.equalsIgnoreCase("Square")){
						System.out.println("square");
						g.fillRect(oX, oY, size, size);
						
					}
					else if(Controller.ovalStr.equals("Oval")) {
						g.fillOval(oX-size/2, oY-size/2, size, size);
						
					}
					else if(Controller.lineStr.equals("Line")) {
						g.drawLine(oX, oY, x, y);
						
					}
				}
				else if(Controller.whiteStr.equals("White"))
				{
					g.setColor(Color.white);
					if(Controller.squareStr.equalsIgnoreCase("Square")){
						g.fillRect(oX, oY, size, size);
						
					}
					else if(Controller.ovalStr.equals("Oval")) {
						g.fillOval(oX-size/2, oY-size/2, size, size);
						
					}
					else if(Controller.lineStr.equals("Line")) {
						g.drawLine(oX, oY, x, y);
						
					}
				}
				else if(Controller.blackStr.equals("Black"))
				{
					g.setColor(Color.black);
					if(Controller.squareStr.equalsIgnoreCase("Square")){
						g.fillRect(oX, oY, size, size);
						
					}
					else if(Controller.ovalStr.equals("Oval")) {
						g.fillOval(oX-size/2, oY-size/2, size, size);
						
					}
					else if(Controller.lineStr.equals("Line")) {
						g.drawLine(oX, oY, x, y);
						
					}
				}
			}}};
	@Override
	public void mouseClicked(MouseEvent e) {
		int count = e.getClickCount();
		System.out.println(count);
		 oX=e.getX();
		 oY=e.getY();
		if (count == 1) {
			isActive=true;
			this.addMouseMotionListener(mouseMotionListener); 
			}
		else if ( count == 2) {
			isActive=false;
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
}
