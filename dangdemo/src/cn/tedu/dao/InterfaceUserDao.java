package cn.tedu.dao;

import cn.tedu.entity.T_User;

public interface InterfaceUserDao {  
	
	T_User findByEmail(String email, String pwd); //通过别名和密码查找信息

	void insert(T_User user, String updateTime);

	T_User findByNickname(String nickname);//
	  
}
