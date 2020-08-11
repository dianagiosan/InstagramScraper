package com.example.InstagramBot;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UserFeed {
	public Integer count;
	public List<Media> mediaList= new ArrayList<>();
	
	public List<Media> getMediaList() {
		return mediaList;
	}
	
	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}
	
	public UserFeed() {
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
}
