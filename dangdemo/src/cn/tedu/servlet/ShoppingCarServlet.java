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
		System.out.println("我进来了..lalalal。。。。。");
		//1、解决中文乱码
		//2、获取前端参数 
		//3、调用业务层
	    	List<Book> list = new ArrayList<Book>();
		    String idStr = request.getParameter("id");
		    String name  = request.getParameter("name");
		    System.out.println("我执行了第一步");
		    System.out.println(idStr); 
		    System.out.println(name);
		    
		   if(idStr != null) {
			   int id = Integer.parseInt(idStr);
			    RecommendService recommend = new RecommendService();
			    Book books = recommend.findShoppingBook(id);
			    list.add(books); 
				//4、转向，如果有数据传递，封装到request/session中
				 request.setAttribute("listbook", list);
				 HttpSession session = request.getSession(); 
				 session.setAttribute("listbook",list); 
				 request.getRequestDispatcher("/cart/cart_list.jsp").forward(request, response);
				 
		   } 
		   System.out.println("我执行了第二步");
	      if(name != null){
	    	  int Sum = Integer.parseInt(name);
	    	  if(Sum == -1) {
	    		  System.out.println("我执行了第三步");
		    	  request.getRequestDispatcher("/cart/cart_list.jsp").forward(request, response);
	    	  }
	    	   
	      } 
	}
}
