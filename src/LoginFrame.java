

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.Bounds;

public class LoginFrame extends JFrame {
	private JPanel panel1, panel2, panel3, panel;
	private JLabel idLabel, pwLabel, loginlabel;
	private JTextField idTf, pwTf;
	private JButton logBt, joinBt;
	
	public LoginFrame() {
		super("�α���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Xǥ ������ �ٷ� �����Ŵ
		panel1 = (JPanel)getContentPane(); // ()�� �տ� ������ ����ȯ�� ������
		panel2 = (JPanel)getContentPane();
		panel1.setLayout(null);
		panel2.setLayout(null);
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		loginlabel = new JLabel("�α���");
		panel.add(loginlabel);
		idLabel = new JLabel("ID");
		panel1.add(idLabel);
		pwLabel = new JLabel("PW");
		panel2.add(pwLabel);
		idTf = new JTextField(15);
		panel1.add(idTf);
		pwTf = new JTextField(15);
		panel2.add(pwTf);
		logBt = new JButton("�α���");
		joinBt = new JButton("ȸ������");
		
		Font f1 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
		loginlabel.setFont(f1);
		
		panel3.add(logBt);
		panel3.add(joinBt);
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		panel.setBounds(10,10, 100,50);
		panel1.setBounds(35,70,300,30);
		panel2.setBounds(30,100,300,30);
		panel3.setBounds(35,200,300,30);
		


	}
	public static void main(String[] args) {
		LoginFrame lgf = new LoginFrame();
		lgf.setSize(new Dimension(400,400));
		lgf.setVisible(true);

	}
	
}