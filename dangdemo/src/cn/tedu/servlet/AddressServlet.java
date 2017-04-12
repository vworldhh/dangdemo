package cn.tedu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.tedu.entity.T_Address;
import cn.tedu.entity.T_User;
import cn.tedu.service.A_UserService;
import cn.tedu.service.AddressService;

public class AddressServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//0、解决 中文乱码(已经在过滤器中解决)
		//1、获取前端参数
		
		 
	    String receiveName = request.getParameter("receiveName");
	    String fullAddress = request.getParameter("fullAddress");
	    String postalCode = request.getParameter("postalCode");
	    String phone = request.getParameter("phone");
	    String mobile = request.getParameter("mobile");
	    T_Address T_address = new T_Address(receiveName,fullAddress,postalCode,phone,mobile);
	    
		//3、调用业务层
	    AddressService address = new AddressService();
	     address.insterAddress(T_address); 
	     
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	

}
