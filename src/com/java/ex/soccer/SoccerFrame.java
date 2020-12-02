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

        Dimension dim = new Dimension(700, 500);  //단순 2차원값 입력을 위한 클래스

        JFrame bemf = new JFrame("축구 기록");
        bemf.setLocation(0, 0);				  //출력 위치를 화면 좌상단에 위치
        bemf.setPreferredSize(dim);              //위 코드에서 지정한 좌표를 프레임 사이즈로 사용
        bemf.setLayout(null);                    //레이아웃을 사용하지 않고 절대좌표계 사용

        JLabel kind_sclbl = new JLabel("종목 - 축구");
        kind_sclbl.setLocation(10,10);
        kind_sclbl.setSize(150,30);
        bemf.add(kind_sclbl);
		Font f2 = new Font("", Font.BOLD, 20); //("글자체", Font.글자스타일, 글자크기)
		kind_sclbl.setFont(f2);
        
        String header[]={"팀명/기록", "승", "패", "승률","연승"}; //맨위 표가로줄 이름지정 지정
        String contents[][]={
                {"1팀", "15", "5", null, null}, //첫째줄 내용입력  null 하면 빈칸으로 출력
                {"2팀", "13", "7", null, null},
                {"3팀", "10", "10", null, null},
                {"4팀", "5", "15", null, null}
        };

        JTable table = new JTable(contents, header); //테이블생성후 위에서 표가로줄과 내용 넣어서 생성
        //table.setLocation(0,0);

        JScrollPane jscp1 = new JScrollPane(table); //이런식으로 생성시에 테이블을 넘겨주어야 정상적으로 볼 수 있다.
                                                    //jscp1.add(table); 과 같이 실행하면, 정상적으로 출력되지 않음.
        jscp1.setLocation(40,100);
        jscp1.setSize(600,200);					//스크롤 크기지정
        bemf.add(jscp1);
        
        String items[] = {"1팀","2팀","3팀","4팀"};
        JComboBox<String> timelist = new JComboBox<String>(items);
        timelist.setLocation(300,30);
        timelist.setSize(100,30);
        bemf.add(timelist);
        
        JButton detailbtn = new JButton("상세보기"); //버튼 상세보기
        detailbtn.setLocation(430,30); //버튼 위치 지정 (왼쪽이 가로위치, 오른쪽이 새로위치)
        detailbtn.setSize(100,30); //버튼 크기 지정 (왼쪽이 가로크기, 오른쪽이 새로크기)
        bemf.add(detailbtn); //위에서 생성한 폼에다 추가
        
        JButton joinbtn = new JButton("결과추가"); // 상세보기 설명이랑 동일
        joinbtn.setLocation(550,30);
        joinbtn.setSize(100,30);
        bemf.add(joinbtn);
        
        JButton mainbtn = new JButton("메인화면");
        mainbtn.setLocation(550,400);
        mainbtn.setSize(100,30);
        bemf.add(mainbtn);


        bemf.pack(); //폼크기에 맞게 지정
        bemf.setVisible(true);
        bemf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 클릭시 프로그램 종료

    }
}


