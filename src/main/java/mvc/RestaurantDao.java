package mvc;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	public RestaurantModel findByQuery(String query) {

		String sql = "SELECT 제목, 카테고리1, 카테고리2, 카테고리3, 지역명, 시군구명, 개요 FROM restaurant WHERE 제목 = ?";
		RowMapper<RestaurantModel> rm = new RowMapper<RestaurantModel>() {

			@Override
			public RestaurantModel mapRow(ResultSet rs, int arg1) throws SQLException {
				return new RestaurantModel(
						rs.getString("제목"),
						rs.getString("카테고리1"), 
						rs.getString("카테고리2"),
						rs.getString("카테고리3"),
						rs.getString("지역명"), 
						rs.getString("시군구명"), 
						rs.getString("개요"));
			}

		};

		return jdbcTemplate.queryForObject(sql, rm, query);
	}

}
