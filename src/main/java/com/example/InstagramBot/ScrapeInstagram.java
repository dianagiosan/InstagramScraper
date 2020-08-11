package com.example.InstagramBot;

import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.InstagramUserFeedRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem;
import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;

import java.io.IOException;

public class ScrapeInstagram {
	public void Scrape() throws IOException {
		
		Instagram4j instagram4j = Instagram4j.builder().username("dianatestapp6").password("TestApp123").build();
		instagram4j.setup();
		instagram4j.login();
		InstagramSearchUsernameResult searchUsernameResult = instagram4j.sendRequest(new InstagramSearchUsernameRequest("diana_giosan"));
		System.out.println(searchUsernameResult.getUser().profile_pic_url);
		InstagramFeedResult feedResult = instagram4j.sendRequest(new InstagramUserFeedRequest(searchUsernameResult.getUser().getPk()));
		for(InstagramFeedItem post : feedResult.getItems()) {
			System.out.println(post.like_count);
			System.out.println(post.caption);
			System.out.println(post.has_liked);
	}
}
}
