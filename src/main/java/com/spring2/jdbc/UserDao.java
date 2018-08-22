package com.spring2.jdbc;

import com.spring2.bean.User;

import java.util.List;

/**
 * com.spring2.jdbc
 *
 * @author jh
 * @date 2018/8/22 10:18
 * description:
 */
public interface UserDao {
	// 增
	void save(User user);
	// 删
	void delete(Integer id);
	// 改
	void update(User u);
	// 查
	User getById(Integer id);
	//查
	int getTotalCount();
	//查
	List<User> getAll();
}
