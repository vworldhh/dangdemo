package cn.tedu.service;

import cn.tedu.dao.ShoppingCarDao;

/**
 * Service�����������ݿ��һ��
 */

public class ShoppingCarService {
   /**
    * �洢���ﳵ��Books�����ݺ��û�����Ϣ
    * @param idBook
    * @param idUser
    */
	public void SaveCar(int idBook, int idUser) {
		// TODO Auto-generated method stub
		ShoppingCarDao SC_Dao = new ShoppingCarDao();
		SC_Dao.SaveCarData(idBook, idUser);
	}
     /**
      * �жϹ��ﳵ���Ƿ��Ѿ�����
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
