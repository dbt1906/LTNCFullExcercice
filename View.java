package Excercise_20;

import java.awt.Frame;

import javax.swing.JFrame;


public class View extends JFrame {
	Paint ve;
	View(){
		init();
		this.setVisible(true);
	}

	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		this.setTitle("Ve");
		this.setLocationRelativeTo(null);
		ve = new Paint();
		this.add(ve);
	}
	public static void main(String[] args) {
		new View();
	}
	
}
