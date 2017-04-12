package cn.tedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.tedu.entity.Category;
import cn.tedu.util.JdbcUtil;

public class CategoryDao  implements IntefaceCategoryDao{

	@Override
	public List<Category> findByParentId(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Category> list = new ArrayList<Category>();
		try {			
			String sql = "select id, name from t_category where parent_id = ?";
			conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();		
			
			while (rs.next()) {
				Category category = new Category();
				category.setId(rs.getInt("id"));				
				category.setName(rs.getString("name"));
				list.add(category);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, pstm, conn);
		}
		
		return list;
	}

}
