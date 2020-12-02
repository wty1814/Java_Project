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
		JFrame dtf = new JFrame("1팀");
		dtf.setLocation(0,0);
		dtf.setPreferredSize(dim);   
		dtf.setLayout(null);
		
		JLabel kind_bask_1tlbl = new JLabel("종목 - 농구 - 1팀");
		kind_bask_1tlbl.setLocation(10,10);
		kind_bask_1tlbl.setSize(200,30);
		dtf.add(kind_bask_1tlbl);
		
		Font f2 = new Font("", Font.BOLD, 20); //("글자체", Font.글자스타일, 글자크기)
		kind_bask_1tlbl.setFont(f2);
		
		JButton savebtn = new JButton("저장");
		savebtn.setLocation(400,30);
		savebtn.setSize(100,30);
		dtf.add(savebtn);
		
		JButton bckbtn = new JButton("뒤로가기");
		bckbtn.setLocation(530,30);
		bckbtn.setSize(100,30);
		dtf.add(bckbtn);
		
        String header[]={"기록", "승", "패", "점수"}; //맨위 표가로줄 이름지정 지정
        String contents[][]={
                {"1경기", "승", "패","92:83"}, //첫째줄 내용입력  null 하면 빈칸으로 출력
                {"2경기", "패", "승","82:83"},
                {"3경기", "패", "승","84:95"},
                {"4경기", "승", "패","95:91"}
        };
        JTable table = new JTable(contents, header);
        JScrollPane jscp1 = new JScrollPane(table);
        jscp1.setLocation(40,100);
        jscp1.setSize(600,200);		
        dtf.add(jscp1);
        
		
		dtf.pack(); //폼크기에 맞게 지정
		dtf.setVisible(true);
        dtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 클릭시 프로그램 종료

	}

}
