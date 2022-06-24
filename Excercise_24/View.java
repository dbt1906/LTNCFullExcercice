package BaiTap24;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class View extends JFrame implements ActionListener{
	JMenuBar menuBar;
	JMenu fileMenu,quanLyMenu;
	JMenuItem exitMenuItem,qlmhItem,qldItem;
	JLabel mainLabel;
	QuanLyMonHocPanel quanLyMonHocPanel;
	QuanLyDiemPanel quanLyDiemPanel;
	static QuanLySinhVien quanLySinhVien;
	public View() {
		init();
		addEvent();
		this.setVisible(true);
	}
	private void addEvent(){
		exitMenuItem.addActionListener(this);
		qlmhItem.addActionListener(this);
		qldItem.addActionListener(this);
		quanLyMonHocPanel.findStudentBtn.addActionListener(this);
		quanLyMonHocPanel.addSubjectBtn.addActionListener(this);
		quanLyDiemPanel.findStudentBtn.addActionListener(this);
		quanLyDiemPanel.addScoreBtn.addActionListener(this);
		
	}
	private void init() {
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Khoa Cong Nghe Thong Tin");
//		this.setLayout(new BorderLayout());
		// create and add menu
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		quanLyMenu = new JMenu("Quan ly sinh vien");
		exitMenuItem = new JMenuItem("Exit");
		qlmhItem = new JMenuItem("Quan ly mon hoc");
		qldItem = new JMenuItem("Quan ly diem");
		fileMenu.add(exitMenuItem);
		quanLyMenu.add(qlmhItem);
		quanLyMenu.add(qldItem);
		menuBar.add(fileMenu);
		menuBar.add(quanLyMenu);
		this.setJMenuBar(menuBar);
		
		// create and add main label;
		mainLabel = new JLabel("QUAN LY SINH VIEN K.CNTT");
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setVerticalAlignment(SwingConstants.CENTER);

		this.add(mainLabel,BorderLayout.CENTER);
		
		// create and add quanLyMonHocPanel
		quanLyDiemPanel = new QuanLyDiemPanel();
		quanLyMonHocPanel = new QuanLyMonHocPanel();
		this.add(quanLyMonHocPanel);
		this.add(quanLyDiemPanel);
		
		
	}
	public void quanLyMonHocPanelPrintOut(Student student) {
		String result = student.toString();
		quanLyMonHocPanel.textArea.setText(result);
		
	}
	public void quanLyDiemPanelPrintOut(Student student) {
		String result = student.toString();
		quanLyDiemPanel.textArea.setText(result);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitMenuItem) {
			System.exit(1);
		}
		else if (e.getSource()==qldItem) {
			this.remove(mainLabel);
			quanLyDiemPanel.setVisible(true);
			quanLyMonHocPanel.setVisible(false);
		}
		else if (e.getSource()==qlmhItem) {
			this.remove(mainLabel);
			quanLyMonHocPanel.setVisible(true);
			quanLyDiemPanel.setVisible(false);
		}
		else if (e.getSource()==quanLyMonHocPanel.findStudentBtn) {
			Student student = quanLySinhVien.findStudent(quanLyMonHocPanel.mssvTextField.getText());
			if(student!=null) {
				quanLyMonHocPanel.fullNameLabel.setText(student.getStudentName());
				quanLyMonHocPanelPrintOut(student);
			}
			else
				 JOptionPane.showMessageDialog(this,"Khong tim thay sinh vien");
		}
		else if(e.getSource()==quanLyMonHocPanel.addSubjectBtn) {
			String studentId = quanLyMonHocPanel.mssvTextField.getText();
			String subjectName = quanLyMonHocPanel.subjectNameTextField.getText();
			String subjectId = quanLyMonHocPanel.subjectIdTextField.getText();
			double score =0;
			Student student = quanLySinhVien.findStudent(studentId);
			if (student!=null) {
				if(!quanLyMonHocPanel.subjectNameTextField.getText().isEmpty()&&!quanLyMonHocPanel.subjectIdTextField.getText().isEmpty()
						) {
			student.addSubject(subjectName, subjectId, score);
			JOptionPane.showMessageDialog(this,"Chuc mung ban da them thanh cong mon hoc moi");
			quanLyMonHocPanelPrintOut(student);}
				else
					JOptionPane.showMessageDialog(this,"Chua nhap du thong tin");
		}
			else
				 JOptionPane.showMessageDialog(this,"Khong tim thay sinh vien");
			}
		else if (e.getSource()==quanLyDiemPanel.findStudentBtn) {
			Student student = quanLySinhVien.findStudent(quanLyDiemPanel.mssvTextField.getText());
			quanLyDiemPanel.subjectComboBox.removeAllItems();
			if(student!=null) {
				quanLyDiemPanel.fullNameLabel.setText(student.getStudentName());
				for (Subject subject : student.getStudentSubject()) {
					quanLyDiemPanel.subjectComboBox.addItem(subject.getSubjectName());
					quanLyDiemPanelPrintOut(student);
				}
			}
			else 
			JOptionPane.showMessageDialog(this,"Khong tim thay sinh vien");
		}
		else if (e.getSource()==quanLyDiemPanel.addScoreBtn) {
			Student student = quanLySinhVien.findStudent(quanLyDiemPanel.mssvTextField.getText());
			double newScore= Double.parseDouble(quanLyDiemPanel.scoreJTextField.getText());
			if(student!=null) {
				if(!quanLyDiemPanel.scoreJTextField.getText().isEmpty()) {
				String subjectName = quanLyDiemPanel.subjectComboBox.getSelectedItem().toString();
				student.setScore(subjectName, newScore);
				JOptionPane.showMessageDialog(this,"Chuc mung ban da them diem thanh cong");
				quanLyDiemPanelPrintOut(student);
				System.out.println(subjectName);}
				else
					JOptionPane.showMessageDialog(this,"Vui long dien so diem");
			}
			else
				JOptionPane.showMessageDialog(this,"Khong tim thay sinh vien");
		}
	}
	public static void main(String[] args) {
		Subject s1= new Subject("Lap trinh nang cao", "1111", 0);
		Subject s2= new Subject("Ly thuyet do thi", "2222", 0);
		Subject s3= new Subject("Lap trinh co ban", "3333", 0);
		Subject s4= new Subject("Thiet ke huong doi tuong", "9999", 0);
		
		Subject s01= new Subject("Lap trinh co ban", "3333", 0);
		Subject s02= new Subject("Thiet ke huong doi tuong", "9999", 0);
		
		List<Subject> subjectList1 = new ArrayList<Subject>();
		subjectList1.add(s4);
		subjectList1.add(s1);
		subjectList1.add(s2);
		subjectList1.add(s3);
		
		List<Subject> subjectList2 = new ArrayList<Subject>();
		subjectList2.add(s01);
		subjectList2.add(s02);
		
		Student student1= new Student("12345", "Du Thanh Minh", subjectList1);
		Student student2= new Student("12344", "Du Ban Teo", subjectList2);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student2);
		studentList.add(student1);
		
		quanLySinhVien = new QuanLySinhVien(studentList);
		new View();
	}
}
