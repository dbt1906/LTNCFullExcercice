package Excercise_23;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class View extends JFrame{
	JButton clearBtn;
	JRadioButton redBtn,whiteBtn,blackBtn;
	ButtonGroup colorG;
	JPanel functionPanel,clearPanel;
	Paint paintPanel;
	JMenuBar menuBar;
	JMenu fileJMenu,shapeJMenu;
	JMenuItem exitMenuItem,lineMenuItem,circleMenuItem,rectangleMenuItem;
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
		
		// create menubar
		menuBar = new JMenuBar();
		fileJMenu = new JMenu("File");
		exitMenuItem = new JMenuItem("Exit");
		fileJMenu.add(exitMenuItem);
		shapeJMenu = new JMenu("Shape");
		lineMenuItem = new JMenuItem("Line");
		rectangleMenuItem = new JMenuItem("Rectangle");
		circleMenuItem = new JMenuItem("Circle");
		shapeJMenu.add(lineMenuItem);
		shapeJMenu.add(rectangleMenuItem);
		shapeJMenu.add(circleMenuItem);
		menuBar.add(fileJMenu);
		menuBar.add(shapeJMenu);
		this.setJMenuBar(menuBar);
	
		// create shape buttons
		whiteBtn=new JRadioButton("White");
		blackBtn= new JRadioButton("Black");
		redBtn=new JRadioButton("Red");
		colorG = new ButtonGroup();
		colorG.add(whiteBtn);
		colorG.add(blackBtn);
		colorG.add(redBtn);
		
		
		// create function panel
		functionPanel = new JPanel();
		functionPanel.setBackground(Color.pink);
		functionPanel.add(whiteBtn);
		functionPanel.add(redBtn);
		functionPanel.add(blackBtn);
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
		redBtn.setFocusable(false);
		blackBtn.setFocusable(false);
		whiteBtn.setFocusable(false);
		clearBtn.setFocusable(false);
		
	}
	public static void main(String[] args) {
		new View();
	}
	
}
