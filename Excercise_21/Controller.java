package Excercise_21;

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
	 static  String   blueStr="",redStr="",ovalStr="",squareStr="",fillStr="",outLineStr="",clearStr="";
	 static int size=20;
	
	public Controller(View view) {
		this.view=view;
		view.blueBtn.addActionListener(this);
		view.redBtn.addActionListener(this);
		view.ovalBtn.addActionListener(this);
		view.squareBtn.addActionListener(this);
		view.outLineBtn.addActionListener(this);
		view.fillBtn.addActionListener(this);
		view.clearBtn.addActionListener(this);
		view.addKeyListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		JButton button= (JButton)e.getSource();
//		JRadioButton radio= (JRadioButton)e.getSource();
		if(e.getSource()==view.blueBtn) {
			blueStr="Blue";
			redStr="";
		}
		else if (e.getSource()==view.redBtn) {
			redStr="Red";
			blueStr="";
		}
		else if (e.getSource()==view.squareBtn&&view.squareBtn.isSelected()) {
			System.out.println("Square");
			squareStr="Square";
			ovalStr="";}
		else if (e.getSource()==view.ovalBtn&&view.ovalBtn.isSelected()) {
			System.out.println("Oval chon");
			ovalStr="Oval";
			squareStr="";}

		else if (e.getSource()==view.fillBtn&&view.fillBtn.isSelected()) {
			fillStr="Fill";
			outLineStr="";}
		else if (e.getSource()==view.outLineBtn&&view.outLineBtn.isSelected()) {
			outLineStr="Out Line";
			fillStr="";
		}
		else if (e.getSource()==view.clearBtn) {
			clear();
		
	}}
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
		else if (e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_1) {
			this.view.ovalBtn.setSelected(true);
			ovalStr="Oval";
			squareStr="";}
		else if (e.isAltDown()&& e.getKeyCode()==KeyEvent.VK_1) {
			this.view.squareBtn.setSelected(true);
			squareStr="Square";
			ovalStr="";}
		else if (e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_0) {
			size+=5;
		}
		else if (e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_9) {
			size-=5;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
