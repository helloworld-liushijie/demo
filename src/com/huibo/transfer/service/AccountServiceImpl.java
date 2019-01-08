package com.huibo.transfer.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.huibo.transfer.dao.AccountDao;

@Transactional
public class AccountServiceImpl implements AccountService {
	
	private AccountDao accountDao;
	
	//spring×¢ÈëÄ£°å
	private TransactionTemplate template;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void setTemplate(TransactionTemplate template) {
		this.template = template;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer,money);
		//int i = 1/0;
		accountDao.in(inner,money);
	}

	/*@Override
	public void transfer(final String outer, final String inner, final Integer money) {
		template.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.out(outer,money);
				//int i = 1/0;
				accountDao.in(inner,money);
			}
		});
	}*/
	

}
