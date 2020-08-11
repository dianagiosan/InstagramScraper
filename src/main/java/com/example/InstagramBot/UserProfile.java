package com.example.InstagramBot;

public class UserProfile {
	public String biography;
	public String externalUrl;
	public Integer followersCount;
	public Integer followingsCount;
	public String fullname;
	public Integer id;
	public boolean isPrivate;
	public Integer mediaCount;
	public String profilePicUrl;
	public String username;
	public UserProfile(){
	
	}
	public UserProfile(String biography, String externalUrl, Integer followersCount, Integer followingsCount, String fullname, Integer id, boolean isPrivate, Integer mediaCount, String profilePicUrl, String username) {
		this.biography = biography;
		this.externalUrl = externalUrl;
		this.followersCount = followersCount;
		this.followingsCount = followingsCount;
		this.fullname = fullname;
		this.id = id;
		this.isPrivate = isPrivate;
		this.mediaCount = mediaCount;
		this.profilePicUrl = profilePicUrl;
		this.username = username;
	}
	
	public String getBiography() {
		return biography;
	}
	
	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	public String getExternalUrl() {
		return externalUrl;
	}
	
	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}
	
	public Integer getFollowersCount() {
		return followersCount;
	}
	
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}
	
	public Integer getFollowingsCount() {
		return followingsCount;
	}
	
	public void setFollowingsCount(Integer followingsCount) {
		this.followingsCount = followingsCount;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}
	
	public void setPrivate(boolean aPrivate) {
		isPrivate = aPrivate;
	}
	
	public Integer getMediaCount() {
		return mediaCount;
	}
	
	public void setMediaCount(Integer mediaCount) {
		this.mediaCount = mediaCount;
	}
	
	public String getProfilePicUrl() {
		return profilePicUrl;
	}
	
	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
