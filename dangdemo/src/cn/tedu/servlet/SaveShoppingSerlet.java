package cn.tedu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tedu.service.ShoppingCarService;

public class SaveShoppingSerlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		System.out.println("我进来购物车啦");
		String idstr = request.getParameter("id");
		String idstr2 = request.getParameter("id_user");
	    int id_book = Integer.parseInt(idstr);
	    int id_user = Integer.parseInt(idstr2);
	    ShoppingCarService s_car = new ShoppingCarService();
	    s_car.SaveCar(id_book, id_user);
		s_car.JudgeCar(id_book, id_user);
	}
}
