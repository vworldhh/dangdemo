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
			
			
			
			
			//0、解决 中文乱码
			request.setCharacterEncoding("utf-8");
			//1、获取前端参数
			String nickname = request.getParameter("nickname");
			String pwd = request.getParameter("password");
			System.out.println("当前密码为" + pwd);
			String email= request.getParameter("email");
			//2、做简单校验
			//3、调用业务层
			A_UserService userService = new A_UserService();
			T_User user = new T_User(nickname,pwd,email);
			//定义格式化的形式；
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			//将得到的当前日期按上面的格式转为String类型；
			Date date=new Date(); 
			String update_time= sf.format(date);
			boolean result = userService.register(user,update_time);
			   
			//4、根据返回结果，跳转不同页面
			if (result) {
				request.setAttribute("email", email);
				request.setAttribute("nickname", nickname);
				request.getRequestDispatcher("/user/register_ok.jsp").forward(request,response);
			}
			else {
				request.setAttribute("errorMsg", "用户名重复，不能注册！");
				request.getRequestDispatcher("/user/register_form.jsp").forward(request,response); 
			} 
		}
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doGet(request,response);
		}
	}