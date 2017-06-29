package com.yingge.permission.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yingge.permission.PermissionApplication;
import com.yingge.permission.domain.GroupVO;
import com.yingge.permission.domain.GroupVO;

//@RunWith(SpringRunner.class)
//SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes = PermissionApplication.class)
public class GroupDaoTest {
	@Autowired
    private GroupDao GroupDao;

    @Test
    public void testInsert() throws Exception {
    	GroupVO group1 = new GroupVO();
    	group1.setGroupId("g1");
    	group1.setGroupName("groupname1");
    	GroupVO group2 = new GroupVO();
    	group2.setGroupId("g2");
    	group2.setGroupName("groupname2");
    	GroupVO group3 = new GroupVO();
    	group3.setGroupId("g3");
    	group3.setGroupName("groupname3");
    	GroupVO group4 = new GroupVO();
    	group4.setGroupId("g4");
    	group4.setGroupName("groupname4");
    	GroupVO group5 = new GroupVO();
    	group5.setGroupId("g5");
    	group5.setGroupName("groupname5");
    	GroupDao.insert(group1);
    	GroupDao.insert(group2);
    	GroupDao.insert(group3);
    	GroupDao.insert(group4);
    	GroupDao.insert(group5);



        Assert.assertEquals(5, GroupDao.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
    	List<GroupVO> users = GroupDao.getAll();
    	System.out.println(users.toString());
    }
    @Test
    public void testQueryOne() throws Exception {
        GroupVO group = GroupDao.getOne("g1");
        System.out.println(group.getGroupName());
    }

    @Test
    public void testUpdate() throws Exception {
    	GroupVO group = GroupDao.getOne("g1");
    	System.out.println(group.toString());
    	group.setGroupName("name1");
    	GroupDao.update(group);
//        Assert.assertTrue(("neo".equals(GroupDao.getOne(3l).getNickName())));
    }
    @Test
    public void testDelete() throws Exception {
    	int size = GroupDao.getAll().size();
//    	GroupDao.delete("u1");
//    	GroupDao.delete("u2");
//    	GroupDao.delete("u3");
//    	GroupDao.delete("u4");
        GroupDao.delete("g5");
        Assert.assertEquals(size-1, GroupDao.getAll().size());
    }
}
