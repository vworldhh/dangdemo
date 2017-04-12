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
	 * ��ȡ4�����ݣ����ݸ���ҳmain.jsp.
	 * 1������Ŀ¼
	 * 2���༭�Ƽ�
	 * 3������ͼ��
	 * 4�������ϼ�ͼ�� 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//1�������������
		//2����ȡǰ�˲��� 
		//3������ҵ���
		CategoryService categoryService = new CategoryService();
		List<Category> allCategorys = categoryService.findAllCategorys();
		
		RecommendService  recommend = new  RecommendService();
		List<Book> recommendBook = recommend.findrecommendBook();
		List<Book> newbook = recommend.findNewBook();
		List<Book> qunantityBook = recommend.findqunantityBook();
		
			
		
		//4��ת����������ݴ��ݣ���װ��request/session��
		request.setAttribute("allCategorys", allCategorys);
		request.setAttribute("allBooks", recommendBook);
		request.setAttribute("newBooks", newbook);
		request.setAttribute("qunantityBooks", qunantityBook);
		
		request.getRequestDispatcher("/main/main.jsp").forward(request, response);
		
	}

}
