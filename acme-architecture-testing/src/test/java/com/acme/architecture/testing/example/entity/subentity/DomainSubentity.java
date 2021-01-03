package com.acme.architecture.testing.example.entity.subentity;

import java.io.Serializable;
import java.util.Date;

public class DomainSubentity implements Serializable {

	private static final long serialVersionUID = -2779837630741553986L;

	private long id;
	
    private String content;
    
    private Date responseTime;

    public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
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
