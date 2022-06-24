package Excercise_22;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class View extends JFrame{
	JButton blueBtn,redBtn,clearBtn;
	JRadioButton ovalBtn,squareBtn,fillBtn,outLineBtn;
	ButtonGroup colorG,shapeG,styleG;
	JPanel functionPanel,clearPanel;
	Paint paintPanel;
	View(){
		init();
		this.setVisible(true);
	}
	public void init() {
		this.setLocationRelativeTo(null);
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Phan mem ve hinh");
		this.setLayout(new BorderLayout());
		
		// create color buttons
		blueBtn=new JButton("Blue");
		blueBtn.setBackground(Color.blue);
		redBtn=new JButton("Red");
		redBtn.setBackground(Color.red);
		colorG = new ButtonGroup();
		colorG.add(blueBtn);
		colorG.add(redBtn);
		
		// create shape buttons
		ovalBtn=new JRadioButton("Oval");
		squareBtn= new JRadioButton("Square");
		shapeG = new ButtonGroup();
		shapeG.add(ovalBtn);
		shapeG.add(squareBtn);
		// create style buttons
		fillBtn=new JRadioButton("Fill");
		outLineBtn=new JRadioButton("Out line");
		styleG = new ButtonGroup();
		styleG.add(fillBtn);
		styleG.add(outLineBtn);
		
		// create function panel
		functionPanel = new JPanel();
		functionPanel.setBackground(Color.pink);
		functionPanel.add(blueBtn);
		functionPanel.add(redBtn);
		functionPanel.add(squareBtn);
		functionPanel.add(ovalBtn);
		functionPanel.add(fillBtn);
		functionPanel.add(outLineBtn);
		this.add(functionPanel,BorderLayout.NORTH);
		
		// create clear button and Clear panel
		clearBtn = new JButton("Clear all");
		clearPanel=new JPanel();
		clearPanel.setBackground(Color.pink);
		clearPanel.add(clearBtn);
		this.add(clearPanel,BorderLayout.WEST);
		
		// create paint panel
		paintPanel = new Paint();
		paintPanel.setBackground(Color.yellow);
		this.add(paintPanel,BorderLayout.CENTER);
		ovalBtn.setFocusable(false);
		squareBtn.setFocusable(false);
		blueBtn.setFocusable(false);
		redBtn.setFocusable(false);
		fillBtn.setFocusable(false);
		outLineBtn.setFocusable(false);
		clearBtn.setFocusable(false);
		
	}
	
}
