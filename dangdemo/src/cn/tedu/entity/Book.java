package cn.tedu.entity;

import java.util.Date;

public class Book {
	private int id;
	private String name;
	private Category category;
	private String image;
	private String author;
	private String publishing;
	private Date publish_date;
	private String brief;
	private double fixedPrice;
	private double dangPrice;
	private int score;
	
	
	public Book() {
		super();
	}
	public Book(String name, Category category, String image, String author,
			String publishing, Date publishDate, String brief,
			double fixedPrice, double dangPrice, int score) {
		super();
		this.name = name;
		this.category = category;
		this.image = image;
		this.author = author;
		this.publishing = publishing;
		publish_date = publishDate;
		this.brief = brief;
		this.fixedPrice = fixedPrice;
		this.dangPrice = dangPrice;
		this.score = score;
	}
	public Book(int id, String name, Category category, String image,
			String author, String publishing, Date publishDate, String brief,
			double fixedPrice, double dangPrice, int score) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.image = image;
		this.author = author;
		this.publishing = publishing;
		publish_date = publishDate;
		this.brief = brief;
		this.fixedPrice = fixedPrice;
		this.dangPrice = dangPrice;
		this.score = score;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publishDate) {
		publish_date = publishDate;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public double getFixedPrice() {
		return fixedPrice;
	}
	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	public double getDangPrice() {
		return dangPrice;
	}
	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
