package com.yingge.permission.domain;

import java.util.List;

public class UserVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7047319482799640923L;

	private String userId;
	private String userName;
	private String region;
	private String country;
	private List<GroupVO> groupVOs;
	public UserVO() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<GroupVO> getGroupVOs() {
		return groupVOs;
	}
	public void setGroupVOs(List<GroupVO> groupVOs) {
		this.groupVOs = groupVOs;
	}
	
}
