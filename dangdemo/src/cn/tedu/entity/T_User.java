package cn.tedu.entity;
 /*
   	t_user���û���
		id,
		 
		nickname���ǳ�
		pwd
		email
		update_time datetime:��������
  */
public class T_User {
     private int id; //�û����
     private String nickname;//�ǳ�
     private String pwd;//����
     private String email;//�û�eamil
     private String updat_time;//�û�ע��ʱ���ʽ��0000-00-00
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
