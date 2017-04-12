package cn.tedu.dao;

import cn.tedu.entity.T_Address;

public interface IntefaceShoppingDao {
	void SaveCarData(int idBook, int idUser);//将数据存入数据库中
	boolean cheakCar(int idBook, int idUser);//判断购物车中是否已经存在
}
