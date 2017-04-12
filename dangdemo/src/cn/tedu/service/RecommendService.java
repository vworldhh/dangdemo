package cn.tedu.service;

import java.util.List;

import cn.tedu.dao.CategoryDao;
import cn.tedu.dao.RecommendDao;
import cn.tedu.entity.Book;
import cn.tedu.entity.Category;

public class RecommendService {
	/**
	 * 
	 * @return
	 */
	public List<Category> findAllCategorys() {
		CategoryDao categoryDao = new CategoryDao();
		List<Category> categorys = categoryDao.findByParentId(0);//0表示根目录
		for (int i  = 0; i < categorys.size(); i++) {
			Category category = categorys.get(i);
			List<Category> subCategorys = categoryDao.findByParentId(category.getId());
			category.setCategorys(subCategorys);
		}
		return categorys;
	}
	/**
	 * 
	 * @return
	 */
	public List<Book> findrecommendBook() { 
		 System.out.println("已设置");
	   RecommendDao  recommenddao = new  RecommendDao();
	   List<Book> booklist = recommenddao.findrecommendBook();
		return booklist;
	}
	/**
	 * 
	 * @return
	 */
	public List<Book> findNewBook(){ 
		 
	   RecommendDao  recommenddao = new  RecommendDao();
	   List<Book> newbooklist = recommenddao.findNewBook();
		return newbooklist;
	}
	/**
	 * 
	 * @return
	 */
	public List<Book> findqunantityBook(){ 
		 
	   RecommendDao  recommenddao = new  RecommendDao();
	   List<Book> qunantityBook = recommenddao.findqunantityBook();
		return qunantityBook;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<Book> findIdBook(int id) {
		 RecommendDao  recommenddao = new  RecommendDao();
		   List<Book> qunantityBook = recommenddao.findIdBook(id);
			return qunantityBook;
	}
	
	/**
	 * 
	 */
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Book findShoppingBook(int id) {
		 RecommendDao  recommenddao = new  RecommendDao();
		 Book ShoppingBook = recommenddao.findShoppingBook(id);
			return ShoppingBook;
	}
}
