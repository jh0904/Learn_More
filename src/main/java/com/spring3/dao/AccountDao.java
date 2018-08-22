package com.spring3.dao;

/**
 * com.spring3.dao
 *
 * @author jh
 * @date 2018/8/22 15:19
 * description:
 */
public interface AccountDao {
	//加钱
	void addMoney(Integer id,Double money);
	//减钱
	void decrMoney(Integer id,Double money);
}
