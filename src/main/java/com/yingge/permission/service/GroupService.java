package com.yingge.permission.service;

import java.util.List;

import com.yingge.permission.domain.GroupVO;

public interface GroupService {
	
	
	List<GroupVO> getAll();

	GroupVO getOne(String id);

    void insert(GroupVO group);

    void update(GroupVO group);

    void delete(String id);
}
