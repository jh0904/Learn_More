package com.spring2.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.spring2.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.beans.PropertyVetoException;
import java.util.List;

/**
 * com.spring2.jdbc
 *
 * @author jh
 * @date 2018/8/22 9:52
 * description:
 */
@RunWith(SpringJUnit4ClassRunner.class)  //spring与Junit测试
@ContextConfiguration("classpath:applicationContextJDBC.xml")
public class Demo {

	@Resource(name ="userDao")
	private UserDao userDao;

	@Test
	public void test1() throws PropertyVetoException {
		//0准备连接池
		ComboPooledDataSource dataSource = new ComboPooledDataSource ();

		dataSource.setDriverClass ("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl ("jdbc:mysql:///demo");
		dataSource.setUser ("root");
		dataSource.setPassword ("root");

		//1.创建JDBC模板对象
		JdbcTemplate jt = new JdbcTemplate (dataSource);
		//2.书写sql
		String sql = "insert into user values(null,'jh')";
		int update = jt.update (sql);
		System.out.println (update);
	}

	@Test
	public void test2() throws Exception{
		User user = new User ();
		user.setName ("tom");
		userDao.save (user);
	}

	@Test
	public void test3() throws Exception{
		User user = new User ();
		user.setId (2);
		user.setName ("aaa");
		userDao.update (user);
	}

	@Test
	public void test4() throws Exception{

		List<User> all = userDao.getAll ();
		all.forEach (System.out::println);
	}

}
