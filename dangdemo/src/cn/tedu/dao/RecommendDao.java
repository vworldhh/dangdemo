package cn.tedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.tedu.entity.Book;
import cn.tedu.entity.Category;
import cn.tedu.util.JdbcUtil;

public class RecommendDao implements InterfaceRecommendDao{
	@Override
	public List<Book> findrecommendBook() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<Book>();
		try {			
			String sql = "select * from t_book order by recommend desc limit 0,2";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql); 
			rs = pstm.executeQuery();	 
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));				
				book.setName(rs.getString("name"));
				book.setCategory(new Category(rs.getInt("category_id")));	
				book.setAuthor(rs.getString("author"));
				book.setBrief(rs.getString("brief"));
				book.setDangPrice(rs.getDouble("dang_price"));
				book.setFixedPrice(rs.getDouble("fixed_Price"));
				book.setImage(rs.getString("image"));
				book.setPublish_date(rs.getDate("publish_date"));
				book.setPublishing(rs.getString("publishing"));
				book.setScore(rs.getInt("score"));
				list.add(book);
				System.out.println("已找到");
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return list;
	}
	@Override
	public List<Book> findqunantityBook() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<Book>();
		try {			
			String sql = "select * from t_book order by sale_qunantity desc limit 0,4";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql); 
			rs = pstm.executeQuery();	 
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));	
				book.setCategory(new Category(rs.getInt("category_id")));				
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setBrief(rs.getString("brief"));
				book.setDangPrice(rs.getDouble("dang_price"));
				book.setFixedPrice(rs.getDouble("fixed_Price"));
				book.setImage(rs.getString("image"));
				book.setPublish_date(rs.getDate("publish_date"));
				book.setPublishing(rs.getString("publishing"));
				book.setScore(rs.getInt("score"));
				list.add(book);
				System.out.println("已找到");
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return list;
	}
	@Override
	public List<Book> findNewBook() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<Book>();
		try {			
			String sql = "select * from t_book order by publish_date desc limit 0,3";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql); 
			rs = pstm.executeQuery();	 
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));	
				book.setCategory(new Category(rs.getInt("category_id")));				
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setBrief(rs.getString("brief"));
				book.setDangPrice(rs.getDouble("dang_price"));
				book.setFixedPrice(rs.getDouble("fixed_Price"));
				book.setImage(rs.getString("image"));
				book.setPublish_date(rs.getDate("publish_date"));
				book.setPublishing(rs.getString("publishing"));
				book.setScore(rs.getInt("score"));
				list.add(book);
				System.out.println("已找到");
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return list;
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public List<Book> findIdBook(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<Book>();
		try {			
			String sql = "select * from t_book  where  category_id = ?";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql); 
			pstm.setInt(1, id);
			rs = pstm.executeQuery();	 
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));	
				book.setCategory(new Category(rs.getInt("category_id")));				
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setBrief(rs.getString("brief"));
				book.setDangPrice(rs.getDouble("dang_price"));
				book.setFixedPrice(rs.getDouble("fixed_Price"));
				book.setImage(rs.getString("image"));
				book.setPublish_date(rs.getDate("publish_date"));
				book.setPublishing(rs.getString("publishing"));
				book.setScore(rs.getInt("score"));
				list.add(book);
				 System.out.println("找到过内外小说了");
			} 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return list;
	}
	public Book findShoppingBook(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Book book = new Book();
		try {			
			String sql = "select * from t_book  where  id = ?";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql); 
			pstm.setInt(1, id);
			rs = pstm.executeQuery();	 
			while (rs.next()) { 
				book.setId(rs.getInt("id"));	
				book.setCategory(new Category(rs.getInt("category_id")));				
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setBrief(rs.getString("brief"));
				book.setDangPrice(rs.getDouble("dang_price"));
				book.setFixedPrice(rs.getDouble("fixed_Price"));
				book.setImage(rs.getString("image"));
				book.setPublish_date(rs.getDate("publish_date"));
				book.setPublishing(rs.getString("publishing"));
				book.setScore(rs.getInt("score"));
				 return book;
			} 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return null;
	}

}
