package Excercise_23;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
// +shift line
// +Crt cirlce
// +alt rec
public class Controller implements ActionListener, KeyListener{
	View view;
	 static  String   blackStr="",whiteStr="",redStr="",ovalStr="",squareStr="",clearStr="",lineStr="";
	 static int size=20;
	
	public Controller(View view) {
		this.view=view;
		view.redBtn.addActionListener(this);
		view.blackBtn.addActionListener(this);
		view.whiteBtn.addActionListener(this);
		view.clearBtn.addActionListener(this);
		view.rectangleMenuItem.addActionListener(this);
		view.circleMenuItem.addActionListener(this);
		view.lineMenuItem.addActionListener(this);
		view.exitMenuItem.addActionListener(this);
		
		view.addKeyListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		JButton button= (JButton)e.getSource();
//		JRadioButton radio= (JRadioButton)e.getSource();
		if(e.getSource()==view.blackBtn&&view.blackBtn.isSelected()) {
			blackStr="Black";
			redStr="";
			whiteStr="";
		}
		else if (e.getSource()==view.redBtn&&view.redBtn.isSelected()) {
			blackStr="";
			redStr="Red";
			whiteStr="";
		}
		else if (e.getSource()==view.whiteBtn&&view.whiteBtn.isSelected()) {
			blackStr="";
			redStr="";
			whiteStr="White";
		}
		else if (e.getSource()==view.circleMenuItem) {
			squareStr="";
			ovalStr="Oval";
			lineStr="";
		}
		else if (e.getSource()==view.lineMenuItem) {
			squareStr="";
			ovalStr="";
			lineStr="Line";
		}
		else if (e.getSource()==view.rectangleMenuItem) {
			squareStr="Square";
			ovalStr="";
			lineStr="";
		}
		else if (e.getSource()==view.exitMenuItem) {
			System.exit(1);
		}

		else if (e.getSource()==view.clearBtn) {
			clear();
		
	}
		
	}
	private void clear() {
			this.view.paintPanel.clear();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_C) {
			clear();
		}
		
		}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
