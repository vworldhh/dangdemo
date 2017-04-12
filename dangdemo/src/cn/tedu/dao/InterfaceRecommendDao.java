package cn.tedu.dao;

import java.util.List;

import cn.tedu.entity.Book;
import cn.tedu.entity.Category;

public interface InterfaceRecommendDao {

	List<Book> findrecommendBook();//按推荐升序查找

	List<Book> findNewBook();// 按出版时间排序

	List<Book> findqunantityBook();//按热销升序查找

	List<Book> findIdBook(int id);//通过ID找过内外小说

}
