package com.yingge.permission.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yingge.permission.domain.GroupVO;
import com.yingge.permission.domain.UserGroupVO;
import com.yingge.permission.domain.UserVO;

@Mapper
public interface UserGroupDao {
	List<UserGroupVO> getAll();

	UserGroupVO getOne(String id);

    void insert(UserGroupVO userGroup);

    void update(UserGroupVO userGroup);

    void delete(String id);
    
    List<UserVO> getUsersByGroupId(String id);
    List<GroupVO> getGroupsByUserId(String id);
    
    int deleteByUserId(String userId);
    int deleteByGroupId(String userId);
}
