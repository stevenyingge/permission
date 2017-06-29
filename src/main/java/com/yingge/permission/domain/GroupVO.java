package com.yingge.permission.domain;

import java.util.List;

public class GroupVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3383146829120846746L;

	private String groupId;
	private String groupName;
	private String description;
	private List<UserVO> userVOs;
	public GroupVO() {
		super();
	}
	
	public List<UserVO> getUserVOs() {
		return userVOs;
	}

	public void setUserVOs(List<UserVO> userVOs) {
		this.userVOs = userVOs;
	}

	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
