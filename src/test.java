
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//ù ��° ������
class MainFrame extends Frame implements MouseListener {    
    Label lbl;
    MainFrame() {
        super("â ��ȯ 1�� ������");
        this.setVisible(true);
        this.setBounds(700, 400, 300, 300);
        this.setLayout(null);
        this.addWindowListener(new MyWinExit());
        lbl = new Label("���� (Ŭ��) ������",1);
        lbl.setBackground(Color.yellow);
        lbl.setBounds(70, 120, 130, 20);
        add(lbl);
        lbl.addMouseListener(this);
    }
    //paint() �޼ҵ� ���� 
    public void paint(Graphics g){
        g.drawString("����� ù ��° ������ 11111", 70, 100);
    }    
    // ������ ���� Ŭ����
    public class MyWinExit extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0); // ���� ����
        }
    }
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseClicked(MouseEvent e) {        
        new MainFrame_Second(); //���Ⱑ ������ ��ȯ ����
        this.setVisible(false);
    }
    @Override    //���콺 �̺�Ʈ  �������̽� ���� 
    public void mousePressed(MouseEvent e) {/*��������*/}
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseReleased(MouseEvent e) {/*��������*/}
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseEntered(MouseEvent e) {/*��������*/}    
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseExited(MouseEvent e) {/*��������*/}
}//ù ��° ������ ��
 
class MainFrame_Second extends Frame implements MouseListener {
    private static final long serialVersionUID = 1L;
    Label lbl;
    MainFrame_Second() {
        super("â ��ȯ  2�� ������");
        this.setVisible(true);
        this.setBounds(700, 400, 300, 300);
        this.setLayout(null);
        this.addWindowListener(new MyWinExit());
 
        lbl = new Label("���� (Ŭ��) ������",1);
        lbl.setBackground(Color.yellow);
        lbl.setBounds(70, 120, 130, 20);
        add(lbl);
        lbl.addMouseListener(this);
    }
    //paint() �޼ҵ� ���� 
    public void paint(Graphics g){
        g.drawString("����� �� ��° ������22222", 70, 100);
    }    
    // ������ ���� Ŭ����
    public class MyWinExit extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0); // ���� ����
        }
    }
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseClicked(MouseEvent e) {
        new MainFrame();   //���Ⱑ ������ ��ȯ ����   
        this.setVisible(false);   
    }
    @Override    //���콺 �̺�Ʈ  �������̽� ���� 
    public void mousePressed(MouseEvent e) {/*��������*/}
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseReleased(MouseEvent e) {/*��������*/}
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseEntered(MouseEvent e) {/*��������*/}    
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseExited(MouseEvent e) {/*��������*/}
}
//�� ��° ������ �� 
 
//���� �Լ�
public class test {
    public static void main(String[] args) {
        new MainFrame();
    }
}