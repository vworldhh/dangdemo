package cn.tedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.tedu.entity.T_Address;
import cn.tedu.util.JdbcUtil;

public class AddressDao implements InterfaceAddressDao{
	
	@Override
	public void insert(T_Address address){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			String sql="insert into t_address(name,address,postalCode,phone_call,phonenumber)value(?,?,?,?,?)";
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
		 
			ps.setString(1,address.getName());
			ps.setString(2, address.getAddress()); 
			ps.setString(3, address.getPostalCode());  
			ps.setString(4, address.getPhone_all());
			ps.setString(5,address.getPhonenumber());
		
			ps.executeUpdate();	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, ps, conn);
		}
		
		}
	}
	

 
