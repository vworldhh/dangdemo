package cn.tedu.entity;
 /*
   	t_user表：用户表
		id,
		 
		nickname：昵称
		pwd
		email
		update_time datetime:更新日期
  */
public class T_User {
     private int id; //用户序号
     private String nickname;//昵称
     private String pwd;//密码
     private String email;//用户eamil
     private String updat_time;//用户注册时间格式：0000-00-00
	public T_User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_User(int id, String nickname, String pwd, String email) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.pwd = pwd;
		this.email = email;
		 
	}
	public T_User(String nickname, String pwd, String email) {
		super();
		this.nickname = nickname;
		this.pwd = pwd;
		this.email = email;
	 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUpdat_time() {
		return updat_time;
	}
	public void setUpdat_time(String updatTime) {
		updat_time = updatTime;
	}
    
     
}
