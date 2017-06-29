package com.yingge.permission.domain;

public class UserGroupVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7429645970306931576L;

	private String userGroupId;
	private String userId;
	private String groupId;
	public UserGroupVO() {
		super();
	}
	public String getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
}
