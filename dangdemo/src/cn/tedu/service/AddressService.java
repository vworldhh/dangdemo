package cn.tedu.service;

import cn.tedu.dao.AddressDao;
import cn.tedu.entity.T_Address;

public class AddressService {

	public void insterAddress(T_Address tAddress) {
		AddressDao adrdao = new AddressDao();
		adrdao.insert(tAddress);
		 
	}
    
}
