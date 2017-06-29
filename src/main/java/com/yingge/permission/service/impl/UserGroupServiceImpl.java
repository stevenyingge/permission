package com.yingge.permission.service.impl;

import java.util.List;

import com.yingge.permission.domain.GroupVO;
import com.yingge.permission.domain.UserGroupVO;
import com.yingge.permission.domain.UserVO;
import com.yingge.permission.service.UserGroupService;

public class UserGroupServiceImpl implements UserGroupService {

	@Override
	public List<UserGroupVO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserGroupVO getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(UserGroupVO userGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserGroupVO userGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserVO> getUsersByGroupId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupVO> getGroupsByUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByUserId(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByGroupId(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
