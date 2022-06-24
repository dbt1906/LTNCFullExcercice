package Excercise_20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Paint extends JPanel { 

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(50, 50, 100, 50);
		g.setColor(Color.red);
		g.fillOval(300, 200, 100, 100);
		g.setColor(Color.pink);
		g.drawOval(50, 200, 100, 100);
		g.setColor(Color.orange);
		g.fillArc(50, 250, 70, 70, 10, 60);
		g.setColor(Color.blue);
		g.drawLine(50, 320, 200, 320);
	}
	
}
