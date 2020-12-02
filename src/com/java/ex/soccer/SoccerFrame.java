package com.java.ex.soccer;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SoccerFrame extends JFrame{
	
    public static void main(String args[]){

        Dimension dim = new Dimension(700, 500);  //�ܼ� 2������ �Է��� ���� Ŭ����

        JFrame bemf = new JFrame("�౸ ���");
        bemf.setLocation(0, 0);				  //��� ��ġ�� ȭ�� �»�ܿ� ��ġ
        bemf.setPreferredSize(dim);              //�� �ڵ忡�� ������ ��ǥ�� ������ ������� ���
        bemf.setLayout(null);                    //���̾ƿ��� ������� �ʰ� ������ǥ�� ���

        JLabel kind_sclbl = new JLabel("���� - �౸");
        kind_sclbl.setLocation(10,10);
        kind_sclbl.setSize(150,30);
        bemf.add(kind_sclbl);
		Font f2 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
		kind_sclbl.setFont(f2);
        
        String header[]={"����/���", "��", "��", "�·�","����"}; //���� ǥ������ �̸����� ����
        String contents[][]={
                {"1��", "15", "5", null, null}, //ù°�� �����Է�  null �ϸ� ��ĭ���� ���
                {"2��", "13", "7", null, null},
                {"3��", "10", "10", null, null},
                {"4��", "5", "15", null, null}
        };

        JTable table = new JTable(contents, header); //���̺������ ������ ǥ�����ٰ� ���� �־ ����
        //table.setLocation(0,0);

        JScrollPane jscp1 = new JScrollPane(table); //�̷������� �����ÿ� ���̺��� �Ѱ��־�� ���������� �� �� �ִ�.
                                                    //jscp1.add(table); �� ���� �����ϸ�, ���������� ��µ��� ����.
        jscp1.setLocation(40,100);
        jscp1.setSize(600,200);					//��ũ�� ũ������
        bemf.add(jscp1);
        
        String items[] = {"1��","2��","3��","4��"};
        JComboBox<String> timelist = new JComboBox<String>(items);
        timelist.setLocation(300,30);
        timelist.setSize(100,30);
        bemf.add(timelist);
        
        JButton detailbtn = new JButton("�󼼺���"); //��ư �󼼺���
        detailbtn.setLocation(430,30); //��ư ��ġ ���� (������ ������ġ, �������� ������ġ)
        detailbtn.setSize(100,30); //��ư ũ�� ���� (������ ����ũ��, �������� ����ũ��)
        bemf.add(detailbtn); //������ ������ ������ �߰�
        
        JButton joinbtn = new JButton("����߰�"); // �󼼺��� �����̶� ����
        joinbtn.setLocation(550,30);
        joinbtn.setSize(100,30);
        bemf.add(joinbtn);
        
        JButton mainbtn = new JButton("����ȭ��");
        mainbtn.setLocation(550,400);
        mainbtn.setSize(100,30);
        bemf.add(mainbtn);


        bemf.pack(); //��ũ�⿡ �°� ����
        bemf.setVisible(true);
        bemf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ��ư Ŭ���� ���α׷� ����

    }
}


