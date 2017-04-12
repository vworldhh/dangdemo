package cn.tedu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.tedu.dao.RecommendDao;
import cn.tedu.entity.Book;
import cn.tedu.entity.T_User;
import cn.tedu.service.A_UserService;
import cn.tedu.service.RecommendService;

public class BookListServlet  extends HttpServlet{
 
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//0、解决 中文乱码(已经在过滤器中解决)
			//1、获取前端参数
			System.out.println("进来了");
			  
			String idstr = request.getParameter("id");
		    int id =  Integer.parseInt(idstr);
		    System.out.println(idstr);
			//3、调用业务层
		    RecommendService recommend = new RecommendService();
		    List<Book> result = recommend.findIdBook(id);
			//登录成功，设置session，跳转到电影列表控制页面
		    request.setAttribute("idBooks", result);
		    request.getRequestDispatcher("/main/book_list.jsp").forward(request, response);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			doGet(req,resp);
		}
}

 
