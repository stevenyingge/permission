package com.yingge.permission.service;

import java.util.List;

import com.yingge.permission.domain.UserVO;

public interface UserService {
	List<UserVO> getAll();

	UserVO getOne(String id);

    void insert(UserVO user);

    void update(UserVO user);

    void delete(String id);

}
