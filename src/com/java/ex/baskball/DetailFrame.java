package com.java.ex.baskball;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class DetailFrame {

	public static void main(String[] args) {
		Dimension dim = new Dimension(700,500);
		JFrame dtf = new JFrame("1��");
		dtf.setLocation(0,0);
		dtf.setPreferredSize(dim);   
		dtf.setLayout(null);
		
		JLabel kind_bask_1tlbl = new JLabel("���� - �� - 1��");
		kind_bask_1tlbl.setLocation(10,10);
		kind_bask_1tlbl.setSize(200,30);
		dtf.add(kind_bask_1tlbl);
		
		Font f2 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
		kind_bask_1tlbl.setFont(f2);
		
		JButton savebtn = new JButton("����");
		savebtn.setLocation(400,30);
		savebtn.setSize(100,30);
		dtf.add(savebtn);
		
		JButton bckbtn = new JButton("�ڷΰ���");
		bckbtn.setLocation(530,30);
		bckbtn.setSize(100,30);
		dtf.add(bckbtn);
		
        String header[]={"���", "��", "��", "����"}; //���� ǥ������ �̸����� ����
        String contents[][]={
                {"1���", "��", "��","92:83"}, //ù°�� �����Է�  null �ϸ� ��ĭ���� ���
                {"2���", "��", "��","82:83"},
                {"3���", "��", "��","84:95"},
                {"4���", "��", "��","95:91"}
        };
        JTable table = new JTable(contents, header);
        JScrollPane jscp1 = new JScrollPane(table);
        jscp1.setLocation(40,100);
        jscp1.setSize(600,200);		
        dtf.add(jscp1);
        
		
		dtf.pack(); //��ũ�⿡ �°� ����
		dtf.setVisible(true);
        dtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ��ư Ŭ���� ���α׷� ����

	}

}
