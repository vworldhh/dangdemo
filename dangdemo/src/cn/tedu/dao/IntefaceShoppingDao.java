package cn.tedu.dao;

import cn.tedu.entity.T_Address;

public interface IntefaceShoppingDao {
	void SaveCarData(int idBook, int idUser);//�����ݴ������ݿ���
	boolean cheakCar(int idBook, int idUser);//�жϹ��ﳵ���Ƿ��Ѿ�����
}
