package cn.tedu.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.tedu.entity.Book;
import cn.tedu.entity.Category;
import cn.tedu.service.CategoryService;
import cn.tedu.service.RecommendService;

public class ShoppingCarServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("�ҽ�����..lalalal����������");
		//1�������������
		//2����ȡǰ�˲��� 
		//3������ҵ���
	    	List<Book> list = new ArrayList<Book>();
		    String idStr = request.getParameter("id");
		    String name  = request.getParameter("name");
		    System.out.println("��ִ���˵�һ��");
		    System.out.println(idStr); 
		    System.out.println(name);
		    
		   if(idStr != null) {
			   int id = Integer.parseInt(idStr);
			    RecommendService recommend = new RecommendService();
			    Book books = recommend.findShoppingBook(id);
			    list.add(books); 
				//4��ת����������ݴ��ݣ���װ��request/session��
				 request.setAttribute("listbook", list);
				 HttpSession session = request.getSession(); 
				 session.setAttribute("listbook",list); 
				 request.getRequestDispatcher("/cart/cart_list.jsp").forward(request, response);
				 
		   } 
		   System.out.println("��ִ���˵ڶ���");
	      if(name != null){
	    	  int Sum = Integer.parseInt(name);
	    	  if(Sum == -1) {
	    		  System.out.println("��ִ���˵�����");
		    	  request.getRequestDispatcher("/cart/cart_list.jsp").forward(request, response);
	    	  }
	    	   
	      } 
	}
}
