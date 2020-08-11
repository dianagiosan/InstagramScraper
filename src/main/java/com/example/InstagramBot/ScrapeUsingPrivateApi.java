package com.example.InstagramBot;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class ScrapeUsingPrivateApi {
	public void Scrape() throws IOException {
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
			.url("https://instagram30.p.rapidapi.com/rapi/feed/173560420/%7Bcursor%7D")
			.get()
			.addHeader("x-rapidapi-host", "instagram30.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "97fa346593msh2721f0a561a88bap1ffa38jsn07905bc82177")
			.build();
		
		ObjectMapper objectMapper = new ObjectMapper();
		ResponseBody responseBody = client.newCall(request).execute().body();
		UserFeed entity = objectMapper.readValue(responseBody.string(), UserFeed.class);
		System.out.println(entity.getMediaList().get(0).imageHighResolutionUrl);
	}
}
