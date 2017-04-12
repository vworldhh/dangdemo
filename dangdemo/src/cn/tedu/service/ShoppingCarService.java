package cn.tedu.service;

import cn.tedu.dao.ShoppingCarDao;

/**
 * Service层是链接数据库的一层
 */

public class ShoppingCarService {
   /**
    * 存储购物车的Books的数据和用户的信息
    * @param idBook
    * @param idUser
    */
	public void SaveCar(int idBook, int idUser) {
		// TODO Auto-generated method stub
		ShoppingCarDao SC_Dao = new ShoppingCarDao();
		SC_Dao.SaveCarData(idBook, idUser);
	}
     /**
      * 判断购物车中是否已经存在
      * @param idBook
      * @param idUser
      * @return
      */
	public  boolean JudgeCar(int idBook, int idUser) {
		boolean flag;
		ShoppingCarDao SC_Dao = new ShoppingCarDao();
		flag = SC_Dao.cheakCar(idBook, idUser);
		return false;
		// TODO Auto-generated method stub
		
	}
    
	
}
