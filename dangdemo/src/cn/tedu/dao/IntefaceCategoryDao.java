package cn.tedu.dao;

import java.util.List;

import cn.tedu.entity.Category;

public interface  IntefaceCategoryDao {

	List<Category> findByParentId(int id);

}
