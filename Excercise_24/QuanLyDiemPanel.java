package BaiTap24;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class QuanLyDiemPanel extends JPanel{
	JLabel mssv,fullName,subject,score,fullNameLabel;
	JTextField mssvTextField,scoreJTextField;
	JComboBox<String> subjectComboBox;
	JPanel addSubjectPanel,functionPanel,textAreaPanel;
	JButton addScoreBtn,findStudentBtn;
	JTextArea textArea;
	JScrollPane scrollPane;
	public QuanLyDiemPanel(){
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
		textArea.setText("STT\t"+"Ten mon hoc"+"\t \t \t \t"+"Diem\n");
		scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		textAreaPanel.add(scrollPane);
		this.add(textAreaPanel,BorderLayout.SOUTH);
	}
	private void initFunctionPanel() {
		functionPanel = new JPanel();
		functionPanel.setBorder(BorderFactory.createTitledBorder("Thao tac"));
		addScoreBtn = new JButton("Them Diem");
		findStudentBtn = new JButton("Tim Sinh Vien");
		functionPanel.add(addScoreBtn);
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
		subject = new JLabel("Mon Hoc");
		subject.setHorizontalAlignment(SwingConstants.RIGHT);
		score = new JLabel("Diem");
		score.setHorizontalAlignment(SwingConstants.RIGHT);
		mssvTextField = new JTextField();
		subjectComboBox = new JComboBox<String>();
		scoreJTextField = new JTextField();
		addSubjectPanel.add(mssv);
		addSubjectPanel.add(mssvTextField);
		addSubjectPanel.add(fullName);
		fullNameLabel = new JLabel();
		addSubjectPanel.add(fullNameLabel);
		addSubjectPanel.add(subject);
		addSubjectPanel.add(subjectComboBox);
		addSubjectPanel.add(score);
		addSubjectPanel.add(scoreJTextField);
		this.add(addSubjectPanel,BorderLayout.NORTH);
	}
}
