package cn.tedu.dao;

import cn.tedu.entity.T_User;

public interface InterfaceUserDao {  
	
	T_User findByEmail(String email, String pwd); //ͨ�����������������Ϣ

	void insert(T_User user, String updateTime);

	T_User findByNickname(String nickname);//
	  
}
