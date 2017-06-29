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
import com.yingge.permission.domain.GroupVO;
import com.yingge.permission.domain.UserGroupVO;
import com.yingge.permission.domain.UserVO;

//@RunWith(SpringRunner.class)
//SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes = PermissionApplication.class)
public class UserGroupDaoTest {
	@Autowired
    private UserGroupDao userGroupDao;

    @Test
    public void testInsert() throws Exception {
    	UserGroupVO userGroup1 = new UserGroupVO();
    	userGroup1.setUserGroupId("ug1");
    	userGroup1.setUserId("u1");
    	userGroup1.setGroupId("g1");
    	UserGroupVO userGroup2 = new UserGroupVO();
    	userGroup2.setUserGroupId("ug2");
    	userGroup2.setUserId("u2");
    	userGroup2.setGroupId("g1");
    	UserGroupVO userGroup3 = new UserGroupVO();
    	userGroup3.setUserGroupId("ug3");
    	userGroup3.setUserId("u3");
    	userGroup3.setGroupId("g1");
    	UserGroupVO userGroup4 = new UserGroupVO();
    	userGroup4.setUserGroupId("ug4");
    	userGroup4.setUserId("u3");
    	userGroup4.setGroupId("g2");
    	UserGroupVO userGroup5 = new UserGroupVO();
    	userGroup5.setUserGroupId("ug5");
    	userGroup5.setUserId("u3");
    	userGroup5.setGroupId("g3");

    	userGroupDao.insert(userGroup1);
    	userGroupDao.insert(userGroup2);
    	userGroupDao.insert(userGroup3);
    	userGroupDao.insert(userGroup4);
    	userGroupDao.insert(userGroup5);


        Assert.assertEquals(5, userGroupDao.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
    	List<UserGroupVO> userGroups = userGroupDao.getAll();
    	System.out.println(userGroups.toString());
    }
    @Test
    public void testQueryOne() throws Exception {
        UserGroupVO user = userGroupDao.getOne("ug1");
        System.out.println(user.getUserGroupId());
    }

    @Test
    public void testUpdate() throws Exception {
    	UserGroupVO user = userGroupDao.getOne("ug1");
    	System.out.println(user.toString());
    	user.setUserId("u4");
    	userGroupDao.update(user);
//        Assert.assertTrue(("neo".equals(UserGroupDao.getOne(3l).getNickName())));
    }
    @Test
    public void testDelete() throws Exception {
    	int size = userGroupDao.getAll().size();
//    	UserGroupDao.delete("u1");
//    	UserGroupDao.delete("u2");
//    	UserGroupDao.delete("u3");
//    	UserGroupDao.delete("u4");
        userGroupDao.delete("ug5");
        Assert.assertEquals(size-1, userGroupDao.getAll().size());
    }
    
    @Test
    public void testGetUsersByGroupId() throws Exception {
    	List<UserVO> users = userGroupDao.getUsersByGroupId("g1");
    	Assert.assertEquals(3, users.size());
    }
    @Test
    public void testGetGroupsByUserId() throws Exception {
    	List<GroupVO> groups = userGroupDao.getGroupsByUserId("u3");
    	Assert.assertEquals(3, groups.size());
    }
    
    @Test
    public void testDeleteByUserId(){
    	List<GroupVO> groups = userGroupDao.getGroupsByUserId("u3");
    	int deleteNum = userGroupDao.deleteByUserId("u3");
    	Assert.assertEquals(groups.size(), deleteNum);
    }
    @Test
    public void testDeleteByGroupId(){
    	List<UserVO> users = userGroupDao.getUsersByGroupId("g1");
    	int deleteNum = userGroupDao.deleteByGroupId("g1");
    	Assert.assertEquals(users.size(), deleteNum);
    }
}
