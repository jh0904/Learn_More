package com.spring2.jdbc;

import com.spring2.bean.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * com.spring2.jdbc
 *
 * @author jh
 * @date 2018/8/22 10:22
 * description:
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {


	@Override
	public void save(User user) {
		String sql = "insert into user values(null,?)";
		super.getJdbcTemplate ().update (sql, user.getName ());
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from user where id=?";
		super.getJdbcTemplate ().update (sql,id);
	}

	@Override
	public void update(User u) {
		String sql = "update user set name =? where id=?";
		super.getJdbcTemplate ().update (sql,u.getName (),u.getId ());
	}

	@Override
	public User getById(Integer id) {
		String sql = "select * from user where id=?";
		User user = super.getJdbcTemplate ().queryForObject (sql, new RowMapper<User> () {
			@Override
			public User mapRow(ResultSet rs, int i) throws SQLException {
				User user = new User ();
				user.setId (rs.getInt ("id"));
				user.setName (rs.getString ("name"));
				return user;
			}
		}, id);
		return user;
	}

	@Override
	public int getTotalCount() {
		String sql="select count(*) from user";

		int i = super.getJdbcTemplate ().queryForObject (sql, Integer.class);
		return i;
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from user  ";
		List<User> list = super.getJdbcTemplate ().query(sql, new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}});
		return list;
	}
}
