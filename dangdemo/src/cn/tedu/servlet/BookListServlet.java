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
			//0����� ��������(�Ѿ��ڹ������н��)
			//1����ȡǰ�˲���
			System.out.println("������");
			  
			String idstr = request.getParameter("id");
		    int id =  Integer.parseInt(idstr);
		    System.out.println(idstr);
			//3������ҵ���
		    RecommendService recommend = new RecommendService();
		    List<Book> result = recommend.findIdBook(id);
			//��¼�ɹ�������session����ת����Ӱ�б����ҳ��
		    request.setAttribute("idBooks", result);
		    request.getRequestDispatcher("/main/book_list.jsp").forward(request, response);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			doGet(req,resp);
		}
}

 
