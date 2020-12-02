

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinFrame extends JFrame{
	private JPanel panel1,panel2, panel3, panel4, panel5, panel6, panel,panel7;
	private JButton joinbtn;
	private JLabel idlabel, pwlabel, pwlabel2, namelabel, joinlabel;
	private JTextField idtf, pwtf, pwtf2, nametf;

	public JoinFrame() {
		super("회원가입");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = (JPanel)getContentPane();
		panel1.setLayout(null);
		panel2 = (JPanel)getContentPane();
		panel2.setLayout(null);
		panel3 = (JPanel)getContentPane();
		panel3.setLayout(null);
		panel4 = (JPanel)getContentPane();
		panel4.setLayout(null);
		panel5 = (JPanel)getContentPane();
		panel5.setLayout(null);
		panel6 = (JPanel)getContentPane();
		panel6.setLayout(null);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		
		joinlabel = new JLabel("회원가입");
		idlabel = new JLabel("아이디");
		idtf = new JTextField(15);
		pwlabel = new JLabel("비밀번호");
		pwtf = new JTextField(15);
		pwlabel2 = new JLabel("비밀번호확인");
		pwtf2 = new JTextField(15);
		namelabel = new JLabel("이름");
		nametf = new JTextField(15);
		joinbtn = new JButton("가입하기");
		
		Font f1 = new Font("", Font.BOLD,20);
		joinlabel.setFont(f1);
		
		panel1.add(joinlabel);
		panel2.add(idlabel);
		panel2.add(idtf);
		panel3.add(pwlabel);
		panel3.add(pwtf);
		panel4.add(pwlabel2);
		panel4.add(pwtf2);
		panel5.add(namelabel);
		panel5.add(nametf);
		panel6.add(joinbtn);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		panel1.setBounds(10,10,100,40);
		panel2.setBounds(75,100,300,60);
		panel3.setBounds(70,160,300,60);
		panel4.setBounds(55,220,300,60);
		panel5.setBounds(80,280,300,60);
		panel6.setBounds(350,400,100,40);
		
		
		joinbtn.addActionListener(new MyActionListener());
	}
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			LoginFrame lf = new LoginFrame();
			lf.setVisible(true);
			lf.setSize(new Dimension(500,500));
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		JoinFrame jf = new JoinFrame();
		jf.setSize(new Dimension(500,500));
		jf.setVisible(true);
	}

}
