package com.yingge.permission.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yingge.permission.domain.UserVO;

@Mapper
public interface UserDao {
	List<UserVO> getAll();

	UserVO getOne(String id);

    void insert(UserVO user);

    void update(UserVO user);

    void delete(String id);

}
