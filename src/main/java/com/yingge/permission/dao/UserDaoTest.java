package com.yingge.permission.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.yingge.permission.PermissionApplication;
import com.yingge.permission.domain.UserVO;

//@RunWith(SpringRunner.class)
//SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes = PermissionApplication.class)
public class UserDaoTest {
	@Autowired
    private UserDao userDao;

    @Test
    public void testInsert() throws Exception {
    	/*UserVO user1 = new UserVO();
    	user1.setUserId("u1");
    	user1.setUserName("name1");
    	UserVO user2 = new UserVO();
    	user2.setUserId("u2");
    	user2.setUserName("name2");
    	UserVO user3 = new UserVO();
    	user3.setUserId("u3");
    	user3.setUserName("name3");
    	UserVO user4 = new UserVO();
    	user4.setUserId("u4");
    	user4.setUserName("name4");
    	UserVO user5 = new UserVO();
    	user5.setUserId("u5");
    	user5.setUserName("name5");
    	userDao.insert(user1);
    	userDao.insert(user2);
    	userDao.insert(user3);
    	userDao.insert(user4);
        userDao.insert(user5);*/

        UserVO user6 = new UserVO();
    	user6.setUserName("name6");
    	userDao.insert(user6);
        
        Assert.assertEquals(5, userDao.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
    	List<UserVO> users = userDao.getAll();
    	System.out.println(users.toString());
    }
    @Test
    public void testQueryOne() throws Exception {
        UserVO user = userDao.getOne("u3");
        System.out.println(user.getUserName());
    }

    @Test
    public void testUpdate() throws Exception {
    	UserVO user = userDao.getOne("u1");
    	System.out.println(user.toString());
    	user.setUserName("username1");
    	userDao.update(user);
//        Assert.assertTrue(("neo".equals(userDao.getOne(3l).getNickName())));
    }
    @Test
    public void testDelete() throws Exception {
    	int size = userDao.getAll().size();
//    	userDao.delete("u1");
//    	userDao.delete("u2");
//    	userDao.delete("u3");
//    	userDao.delete("u4");
        userDao.delete("u5");
        Assert.assertEquals(size-1, userDao.getAll().size());
    }
}
