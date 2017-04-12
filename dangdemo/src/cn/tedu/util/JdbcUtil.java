package cn.tedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dangdang","root","123456");
		return conn;
	} 
	public static void release(ResultSet rs, Statement stm, Connection conn) {
		if (rs != null)	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		if (stm != null)	try {stm.close();} catch (SQLException e) {e.printStackTrace();}
		if (conn != null)	try {conn.close();} catch (SQLException e) {e.printStackTrace();}
	} 
}
