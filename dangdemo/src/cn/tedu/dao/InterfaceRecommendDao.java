package cn.tedu.dao;

import java.util.List;

import cn.tedu.entity.Book;
import cn.tedu.entity.Category;

public interface InterfaceRecommendDao {

	List<Book> findrecommendBook();//���Ƽ��������

	List<Book> findNewBook();// ������ʱ������

	List<Book> findqunantityBook();//�������������

	List<Book> findIdBook(int id);//ͨ��ID�ҹ�����С˵

}
