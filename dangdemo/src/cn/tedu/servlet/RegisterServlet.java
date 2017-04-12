 package cn.tedu.servlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
import cn.tedu.entity.T_User;
import cn.tedu.service.A_UserService;
	public class RegisterServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			
			
			
			//0����� ��������
			request.setCharacterEncoding("utf-8");
			//1����ȡǰ�˲���
			String nickname = request.getParameter("nickname");
			String pwd = request.getParameter("password");
			System.out.println("��ǰ����Ϊ" + pwd);
			String email= request.getParameter("email");
			//2������У��
			//3������ҵ���
			A_UserService userService = new A_UserService();
			T_User user = new T_User(nickname,pwd,email);
			//�����ʽ������ʽ��
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			//���õ��ĵ�ǰ���ڰ�����ĸ�ʽתΪString���ͣ�
			Date date=new Date(); 
			String update_time= sf.format(date);
			boolean result = userService.register(user,update_time);
			   
			//4�����ݷ��ؽ������ת��ͬҳ��
			if (result) {
				request.setAttribute("email", email);
				request.setAttribute("nickname", nickname);
				request.getRequestDispatcher("/user/register_ok.jsp").forward(request,response);
			}
			else {
				request.setAttribute("errorMsg", "�û����ظ�������ע�ᣡ");
				request.getRequestDispatcher("/user/register_form.jsp").forward(request,response); 
			} 
		}
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doGet(request,response);
		}
	}