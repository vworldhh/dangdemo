package cn.tedu.entity;

import java.util.List;

public class Category {
	private int id;
	private String name;
	private List<Category> categorys; 
 
	public Category(int id) {
	super();
	this.id = id;
}
	public Category() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Category> getCategorys() {
		return categorys;
	}
	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}
	
	
}
