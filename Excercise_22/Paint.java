package Excercise_22;

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
				int size = Controller.size;
				System.out.println(x+""+y);
				g=getGraphics();
				if(Controller.lineStr.equalsIgnoreCase("Line")) {
					g.drawLine(x, y, x+10, y+10);
				}
				if (Controller.blueStr.equalsIgnoreCase("Blue")) {
					g.setColor(Color.blue);
					if(Controller.squareStr.equalsIgnoreCase("Square")){
						System.out.println("Square chon");
						if(Controller.fillStr.equalsIgnoreCase("Fill")) {
							g.fillRect(x, y,size , size);
						}
						else if (Controller.outLineStr.equalsIgnoreCase("Out Line")) {
							g.drawRect(x, y, size, size);
						}
						
					}
					else if(Controller.ovalStr.equals("Oval")) {
						System.out.println("Oval");
						if(Controller.fillStr.equals("Fill")) {
							g.fillOval(x, y, size, size);
						}
						else if (Controller.outLineStr.equals("Out Line")) {
							g.drawOval(x, y, size, size);
						}
					
					}
				}
				else if(Controller.redStr.equals("Red"))
				{
					g.setColor(Color.red);
					if(Controller.squareStr.equals("Square")){
						if(Controller.fillStr.equals("Fill")) {
							g.fillRect(x, y, size, size);
						}
						else if (Controller.outLineStr.equals("Out Line")) {
							g.drawRect(x, y, size, size);
						}
					}
					else if(Controller.ovalStr.equals("Oval")) {
						if(Controller.fillStr.equals("Fill")) {
							g.fillOval(x, y, size, size);
						}
						else if (Controller.outLineStr.equals("Out Line")) {
							g.drawOval(x, y, size, size);
						}

				}}
			}}};
	@Override
	public void mouseClicked(MouseEvent e) {
		int count = e.getClickCount();
		System.out.println(count);
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
