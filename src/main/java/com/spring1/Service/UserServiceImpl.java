package com.spring1.Service;

/**
 * com.spring1.Service
 *
 * @author jh
 * @date 2018/8/21 16:55
 * description:
 */
public class UserServiceImpl implements UserService {
	@Override
	public void save() {
		//System.out.println ("打开事务");
		System.out.println ("保存用户");
		//throw new IllegalArgumentException ("aaaa");
		//System.out.println ("提交事务");
	}

	@Override
	public void delete() {
		System.out.println ("删除用户");
	}

	@Override
	public void update() {
		System.out.println ("更新用户");
	}

	@Override
	public void find() {
		System.out.println ("查找用户");
	}
}
