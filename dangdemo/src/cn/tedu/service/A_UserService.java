package cn.tedu.service;

import cn.tedu.dao.A_UserDao;
import cn.tedu.entity.T_User;
  
public class A_UserService {

	public T_User authenticate(String name, String pwd) {
		// TODO Auto-generated method stub
		A_UserDao userDao = new A_UserDao();
		T_User user = userDao.findByEmail(name, pwd);   
		return user;
		 
	}

	 public boolean authenticate(String nickname) {
		   A_UserDao userDao = new A_UserDao();
			T_User user = userDao.findByNickname(nickname);
			
			if (user == null) {
				return false;
			}
			else {
				return true;
			}
			
			//return !(user == null || !user.getPwd().equals(pwd));
		
		}
		public boolean register(T_User user,String update_time) {
			A_UserDao userDao = new A_UserDao();	
			
			//判断昵称是否存在
			boolean u =authenticate(user.getNickname()); 
			//如果数据库中有该用户，则不能插入
			if (u) {
				return false;
			}
			//没有该用户，插入到数据库
			else {		
				userDao.insert(user,update_time);
				return true;
			}
			
	}
	 
}