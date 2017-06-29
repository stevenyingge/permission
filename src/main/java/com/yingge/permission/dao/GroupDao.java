package com.yingge.permission.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yingge.permission.domain.GroupVO;

@Mapper
public interface GroupDao {
	List<GroupVO> getAll();

	GroupVO getOne(String id);

    void insert(GroupVO group);

    void update(GroupVO group);

    void delete(String id);

}
