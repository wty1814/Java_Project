package com.java.ex.insert;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListInsertBask extends JFrame{
	private JPanel panel, panel1, panel2, panel3;
	private JLabel inlbl, vclbl, deflbl;
	private JTextField vctf, detf;
	private JButton inbtn, canbtn;
	
	public ListInsertBask() {
		super("����߰�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = (JPanel)getContentPane();
		panel1 = (JPanel)getContentPane();
		panel2 = (JPanel)getContentPane();
		panel3 = (JPanel)getContentPane();
		panel.setLayout(null);
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		inlbl = new JLabel("�� - ����߰�");
		vclbl = new JLabel("Victory");
		deflbl = new JLabel("Defeat");
		vctf = new JTextField(15);
		detf = new JTextField(15);
		inbtn = new JButton("�߰�");
		canbtn = new JButton("���");
		
		Font f1 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
		inlbl.setFont(f1);
		
		panel.add(inlbl);
		panel1.add(vclbl);
		panel1.add(vctf);
		panel2.add(deflbl);
		panel2.add(detf);
		panel2.add(detf);
		panel3.add(inbtn);
		panel3.add(canbtn);
		
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		panel.setBounds(10,10, 150,50);
		panel1.setBounds(35,70, 300,50);
		panel2.setBounds(35,130, 300,50);
		panel3.setBounds(250,200, 200,50);
		
		
	}
	
	
	public static void main(String[] args) {
		ListInsertBask li = new ListInsertBask();
		li.setSize(new Dimension(450,300));
		li.setVisible(true);

	}

}
