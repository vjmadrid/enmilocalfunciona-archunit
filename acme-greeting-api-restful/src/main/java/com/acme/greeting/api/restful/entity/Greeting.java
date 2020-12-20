package com.acme.greeting.api.restful.entity;

import java.io.Serializable;
import java.util.Date;

public class Greeting implements Serializable {

	private static final long serialVersionUID = 6417305265257983657L;
	
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
