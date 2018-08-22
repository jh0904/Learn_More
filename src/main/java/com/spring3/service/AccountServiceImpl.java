package com.spring3.service;

import com.spring3.dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * com.spring3.service
 *
 * @author jh
 * @date 2018/8/22 15:26
 * description:
 */
public class AccountServiceImpl implements AccountService {
	private AccountDao ad;
	private TransactionTemplate tp;

	@Override
	@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
	public void transFer(Integer from, Integer to, Double money) {
		tp.execute (new TransactionCallbackWithoutResult () {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				//减钱
				ad.decrMoney (from, money);
				//int i=1/0;
				//加钱
				ad.addMoney (to, money);
			}
		});

		//打开事务
		//调用doInTransactionWithoutResult方法

	}

	public AccountDao getAd() {
		return ad;
	}

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

	public TransactionTemplate getTp() {
		return tp;
	}

	public void setTp(TransactionTemplate tp) {
		this.tp = tp;
	}
}
