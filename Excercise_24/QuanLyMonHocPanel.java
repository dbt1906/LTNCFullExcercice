package BaiTap24;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class QuanLyMonHocPanel extends JPanel{
	JLabel mssv,fullName,subjectId,subjectName;
	JTextField mssvTextField,subjectIdTextField,subjectNameTextField;
	JPanel addSubjectPanel,functionPanel,textAreaPanel;
	JButton addSubjectBtn,findStudentBtn;
	JTextArea textArea;
	JScrollPane scrollPane;
	JLabel fullNameLabel;
	public QuanLyMonHocPanel(){
		this.setLayout(new BorderLayout());
		initAddSubjectPanel();
		initFunctionPanel();
		initTextAreaPanel();
		this.setVisible(false);
		
	}
	private void initTextAreaPanel() {
		textAreaPanel = new JPanel();
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("STT\t"+"Ten mon hoc"+"\t \t \t \t"+"Diem   \n\n\n\n");
//		textArea.setSize(new Dimension(470,150));
		scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		textAreaPanel.add(scrollPane);
		this.add(textAreaPanel,BorderLayout.SOUTH);
	}
	private void initFunctionPanel() {
		functionPanel = new JPanel();
		functionPanel.setBorder(BorderFactory.createTitledBorder("Thao tac"));
		addSubjectBtn = new JButton("Them Mon Hoc");
		findStudentBtn = new JButton("Tim Sinh Vien");
		functionPanel.add(addSubjectBtn);
		functionPanel.add(findStudentBtn);
		this.add(functionPanel,BorderLayout.CENTER);
	}
	private void initAddSubjectPanel() {
		addSubjectPanel = new JPanel();
		addSubjectPanel.setLayout(new GridLayout(4,2));
		addSubjectPanel.setBorder(BorderFactory.createTitledBorder("Them mon hoc"));
		mssv = new JLabel("MSSV");
		mssv.setHorizontalAlignment(SwingConstants.RIGHT);
		fullName = new JLabel("Ho va ten");
		fullName.setHorizontalAlignment(SwingConstants.RIGHT);
		subjectId = new JLabel("Ma mon hoc");
		subjectId.setHorizontalAlignment(SwingConstants.RIGHT);
		subjectName = new JLabel("Ten mon hoc");
		subjectName.setHorizontalAlignment(SwingConstants.RIGHT);
		mssvTextField = new JTextField();
		subjectIdTextField = new JTextField();
		subjectNameTextField = new JTextField();
		fullNameLabel=new JLabel();
		addSubjectPanel.add(mssv);
		addSubjectPanel.add(mssvTextField);
		addSubjectPanel.add(fullName);
		addSubjectPanel.add(fullNameLabel);
		addSubjectPanel.add(subjectId);
		addSubjectPanel.add(subjectIdTextField);
		addSubjectPanel.add(subjectName);
		addSubjectPanel.add(subjectNameTextField);
		this.add(addSubjectPanel,BorderLayout.NORTH);
	}

		
}
