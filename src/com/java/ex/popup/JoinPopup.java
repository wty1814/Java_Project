package com.java.ex.popup;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.java.ex.join.JoinFrame;
import com.java.ex.login.LoginFrame;

public class JoinPopup extends JFrame {
	private JPanel panel,panel2;
	private JLabel lbl;
	private JButton okbtn;
	
	public JoinPopup() {
		super("가입완료");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = (JPanel)getContentPane();
		panel.setLayout(null);
		panel2 = (JPanel)getContentPane();
		panel2.setLayout(null);
		
		panel = new JPanel();
		panel2 = new JPanel();
		lbl = new JLabel("회원가입 완료");
		okbtn = new JButton("확인");
		
		panel.add(lbl);
		panel2.add(okbtn);
		
		add(panel);
		add(panel2);
		
		panel.setBounds(40,30,100,40);
		panel2.setBounds(40,70,100,40);
		
		okbtn.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JoinFrame jf = new JoinFrame();
			jf.dispose();
			LoginFrame lf = new LoginFrame();
			lf.setSize(new Dimension(500,500));
			lf.setVisible(true);
			dispose();
			
		}
	}
	public static void main(String[] args) {
		JoinPopup jp = new JoinPopup();
		jp.setVisible(true);
		jp.setSize(new Dimension(200,150));

	}

}
