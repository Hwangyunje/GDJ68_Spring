package com.is.main.utill;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnector {

	public static Connection getConnetion() throws Exception
	{
		String user="user01";
		String password="user01";
		String url="jdbc:orcle:thin:@13.125.249.153:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//1.드라이버를 메모리에 로딩
		Class.forName(driver);
		//2.DB연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		//ignore에추가
		System.out.println(con);
		return con;
		
	}
	
	
	public static void disConnect(ResultSet re, PreparedStatement st,Connection con )throws Exception {
		re.close();
		st.close();
		con.close();
	}
	public static void disConnect(PreparedStatement st, Connection con)throws Exception{
	st.close();
	con.close();
	}
	}