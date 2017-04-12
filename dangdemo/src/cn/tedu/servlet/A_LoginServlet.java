package cn.tedu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  

import cn.tedu.entity.T_User;
import cn.tedu.service.A_UserService;

public class A_LoginServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//0����� ��������(�Ѿ��ڹ������н��)
			//1����ȡǰ�˲���
			
			String email = request.getParameter("name");
			String pwd = request.getParameter("password");
		 
			//3������ҵ���
			A_UserService userService = new A_UserService();
			T_User result = userService.authenticate(email,pwd);
			 
			//��¼�ɹ�������session����ת����Ӱ�б����ҳ��
			if (result != null) {
				//�õ�session
				HttpSession session = request.getSession(); 
				request.setAttribute("flag","1");
				session.setAttribute("Email",email);	
				request.getRequestDispatcher("/index.jsp").forward(request,response);
			}else {
				request.setAttribute("errorMsg", "�û������������"); 
			    request.getRequestDispatcher("/user/login_form.jsp").forward(request,response); 
			}
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			doGet(req,resp);
		}
}
