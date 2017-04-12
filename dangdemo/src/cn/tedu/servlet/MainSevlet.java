package cn.tedu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tedu.entity.Book;
import cn.tedu.entity.Category;
import cn.tedu.service.CategoryService;
import cn.tedu.service.RecommendService;

public class MainSevlet extends HttpServlet {


	/*
	 * 获取4类数据，传递给主页main.jsp.
	 * 1、所有目录
	 * 2、编辑推荐
	 * 3、热销图书
	 * 4、最新上架图书 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//1、解决中文乱码
		//2、获取前端参数 
		//3、调用业务层
		CategoryService categoryService = new CategoryService();
		List<Category> allCategorys = categoryService.findAllCategorys();
		
		RecommendService  recommend = new  RecommendService();
		List<Book> recommendBook = recommend.findrecommendBook();
		List<Book> newbook = recommend.findNewBook();
		List<Book> qunantityBook = recommend.findqunantityBook();
		
			
		
		//4、转向，如果有数据传递，封装到request/session中
		request.setAttribute("allCategorys", allCategorys);
		request.setAttribute("allBooks", recommendBook);
		request.setAttribute("newBooks", newbook);
		request.setAttribute("qunantityBooks", qunantityBook);
		
		request.getRequestDispatcher("/main/main.jsp").forward(request, response);
		
	}

}
