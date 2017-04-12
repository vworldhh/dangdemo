package cn.tedu.service;

import java.util.List;

import cn.tedu.dao.CategoryDao;
import cn.tedu.entity.Category;

public class CategoryService {
	public List<Category> findAllCategorys() {
		CategoryDao categoryDao = new CategoryDao();
		List<Category> categorys = categoryDao.findByParentId(0);//0表示根目录
		for (int i  = 0; i < categorys.size(); i++) {
			Category category = categorys.get(i);
			List<Category> subCategorys = categoryDao.findByParentId(category.getId());
			category.setCategorys(subCategorys);
		}
		return categorys;
	}
	
	public static void main(String[] args) {
		new CategoryService().findAllCategorys();
	}
}
