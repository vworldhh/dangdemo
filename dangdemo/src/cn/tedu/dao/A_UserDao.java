package cn.tedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

import cn.tedu.entity.T_User; 
import cn.tedu.util.JdbcUtil; 

public class A_UserDao implements InterfaceUserDao {
	@Override
    public T_User findByEmail(String email, String pwd) { 
    	Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; 
		try {			
			String sql = "select id,nickname,password,email,update_time from t_user where email = ? and password = ?";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, pwd);
			rs = pstm.executeQuery();	 
			//3、根据返回结果，转到相应页面
			if (rs.next()) {
				T_User user = new T_User();
				user.setId(rs.getInt("id"));
				user.setNickname("nickname");
				user.setPwd("password");
				user.setEmail("email");
				user.setUpdat_time("update_time");
				return user;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return null;
	}
		 /**
		  * 
		  */
	@Override
	public void insert(T_User user,String update_time){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			String sql="insert into t_user(nickname,password,email,update_time)value(?,?,?,?)";
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getNickname());
			ps.setString(2,user.getPwd());
			ps.setString(3, user.getEmail());
			ps.setString(4, update_time);
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
		//查找在注册昵称时数据库是否已存在,存在返回true，否则返回false
	@Override
		public T_User findByNickname(String nickname){
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try{
				String sql="select email, nickname,password,update_time from t_user where nickname=? ";
				conn = JdbcUtil.getConnection();
				ps = conn.prepareStatement(sql);
				ps.setString(1, nickname);
			    rs=ps.executeQuery();	 
				if(rs.next()){
					T_User user = new T_User();
					user.setEmail(rs.getString("email"));
					user.setNickname(rs.getString("nickname"));
					user.setPwd(rs.getString("password"));
					return user;	
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JdbcUtil.release(rs, ps, conn);
			}

			return null;
			
		}

		 
	} 
	 
 
 