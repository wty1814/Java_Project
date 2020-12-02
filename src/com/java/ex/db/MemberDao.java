package com.java.ex.db;

import java.beans.Statement;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;


public class MemberDao {
	public MemberDao() {}
	private static MemberDao instance=new MemberDao();
	public static MemberDao getInstance() {
		return instance;
	}
	
	private Connection conn; //DB ���� ��ü
	private PreparedStatement pstmt = null; //Query �ۼ� ��ü
	private ResultSet rs; //Query ��� Ŀ��
	private Statement stmt;
//	static String driver = "org.mariadb.jdbc.Driver";
//	//static String url = "jdbc:mariadb://localhost:3307/test2"; //��
//	static String url = "jdbc:mariadb://localhost:3306/test2"; // �б�
//	static String uid = "root";
//	static String pwd = "1111";

	
	
	//���� 1, ���� -1
	//�α���
	public int findByUsernameAndPassword(String id, String pw) {
		
		//1. DB ����
		conn = DBConnection.getConnection();
		
		try {
			//2. Query �ۼ�
			pstmt = conn.prepareStatement("select * from member where id = ? and pw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			//4. Query ����
			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				return 1; //�α��� ����
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return -1; //�α��� ����
	}
	
	//���� 1, ���� -1
	//ȸ������
	public int insertDate(DTO dto) {
		conn = DBConnection.getConnection();
		
		try {
			
			pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.executeUpdate(); //return���� ó���� ���ڵ��� ����
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public Vector getMemberList() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from team order by POV desc"; // ������������
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String team = rs.getString("team");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String POV = rs.getString("POV");
				
				Vector row = new Vector();
				row.add(team);
				row.add(win);
				row.add(lose);
				row.add(POV);
				
				data.add(row);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	 
}

