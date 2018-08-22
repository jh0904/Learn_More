package com.spring3.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * com.spring3.dao
 *
 * @author jh
 * @date 2018/8/22 15:22
 * description:
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	@Override
	public void addMoney(Integer id, Double money) {
		getJdbcTemplate ().update ("update account set money =money+? where id=?",money,id);
	}

	@Override
	public void decrMoney(Integer id, Double money) {
		getJdbcTemplate ().update ("update account set money =money-? where id=?",money,id);
	}
}
