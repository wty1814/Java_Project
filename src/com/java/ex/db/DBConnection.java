package com.java.ex.db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	static String driver = "org.mariadb.jdbc.Driver";
	//static String url = "jdbc:mariadb://localhost:3307/test2"; //집
	static String url = "jdbc:mariadb://localhost:3306/test2"; // 학교
	static String uid = "root";
	static String pwd = "1111";
	public static Connection getConnection() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, pwd);
			System.out.println("DB연결 완료");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
		return conn;
	}

}

