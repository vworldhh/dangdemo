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
			
			//�ж��ǳ��Ƿ����
			boolean u =authenticate(user.getNickname()); 
			//������ݿ����и��û������ܲ���
			if (u) {
				return false;
			}
			//û�и��û������뵽���ݿ�
			else {		
				userDao.insert(user,update_time);
				return true;
			}
			
	}
	 
}