package com.java.ex.baseball;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.java.ex.main.BaseballMainFrame;

public class LGDateFrame extends JFrame  {

	private JLabel kind_base_1tlbl;
	private JButton savebtn, bckbtn;
	private JPanel panel,panel1,panel2,panel3;
	private JTable table;
	private JScrollPane jscp;
	String header[]={"���", "��", "��", "����"};
	String contents[][]={
          {"1���", "��", "��","7:3"}, //ù°�� �����Է�  null �ϸ� ��ĭ���� ���
          {"2���", "��", "��","2:3"},
          {"3���", "��", "��","4:5"},
          {"4���", "��", "��","5:1"}
	};
	
		public LGDateFrame() {
			super("���� - �߱� - LG");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panel = (JPanel)getContentPane();
			panel1 = (JPanel)getContentPane();
			panel.setLayout(null);
			panel1.setLayout(null);
			
			
			panel = new JPanel();
			panel1 = new JPanel();
			panel2 = new JPanel();
			panel3 = new JPanel();
			
			kind_base_1tlbl = new JLabel("���� - �߱� - LG");
			savebtn = new JButton("����");
			bckbtn = new JButton("�ڷΰ���");
			table = new JTable(contents, header);
			jscp = new JScrollPane(table);
			
			Font f2 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
			kind_base_1tlbl.setFont(f2);
			
			panel.add(kind_base_1tlbl);
			panel1.add(savebtn);
			panel1.add(bckbtn);
			
			
			add(panel);
			add(panel1);
			add(jscp);
			
			panel.setBounds(10,10,200,50);
			panel1.setBounds(500,10,200,50);
			jscp.setBounds(30,100,600,200);
			
			savebtn.addActionListener(new MyActionListener1());
			bckbtn.addActionListener(new MyActionListener2());
			
		}
	
		class MyActionListener1 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				BaseballMainFrame bf = new BaseballMainFrame();
				bf.setSize(new Dimension(700,500));
				bf.setVisible(true);
				dispose();
			}
			
		}
		class MyActionListener2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				BaseballMainFrame bf = new BaseballMainFrame();
				bf.setSize(new Dimension(700,500));
				bf.setVisible(true);
				dispose();
			}
			
		}
		public static void main(String[] args) {
			LGDateFrame df = new LGDateFrame();
			df.setSize(new Dimension(700,500));
			df.setVisible(true);
			
		}

}
//

//		Dimension dim = new Dimension(700,500);
//		dtf.setLocation(0,0);
//		dtf.setPreferredSize(dim);   
//		dtf.setLayout(null);
//		
//		JLabel kind_base_1tlbl = new JLabel("���� - �߱� - 1��");
//		kind_base_1tlbl.setLocation(10,10);
//		kind_base_1tlbl.setSize(200,30);
//		dtf.add(kind_base_1tlbl);
//		
//		Font f2 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
//		kind_base_1tlbl.setFont(f2);
//		
//		JButton savebtn = new JButton("����");
//		savebtn.setLocation(400,30);
//		savebtn.setSize(100,30);
//		dtf.add(savebtn);
//		
//		JButton bckbtn = new JButton("�ڷΰ���");
//		bckbtn.setLocation(530,30);
//		bckbtn.setSize(100,30);
//		dtf.add(bckbtn);
//		
//        String header[]={"���", "��", "��", "����"}; //���� ǥ������ �̸����� ����
//        String contents[][]={
//                {"1���", "��", "��","7:3"}, //ù°�� �����Է�  null �ϸ� ��ĭ���� ���
//                {"2���", "��", "��","2:3"},
//                {"3���", "��", "��","4:5"},
//                {"4���", "��", "��","5:1"}
//        };
//        JTable table = new JTable(contents, header);
//        JScrollPane jscp1 = new JScrollPane(table);
//        jscp1.setLocation(40,100);
//        jscp1.setSize(600,200);		
//        dtf.add(jscp1);
//        
//		
//		dtf.pack(); //��ũ�⿡ �°� ����
//		dtf.setVisible(true);
//        dtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ��ư Ŭ���� ���α׷� ����


