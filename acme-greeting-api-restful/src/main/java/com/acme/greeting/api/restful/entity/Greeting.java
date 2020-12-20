package com.acme.greeting.api.restful.entity;

import java.util.Date;

public class Greeting {

	private final long id;
    private final String content;
    private Date responseTime;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.responseTime = new Date();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public Date getResponseTime() {
		return responseTime;
	}
	
}
