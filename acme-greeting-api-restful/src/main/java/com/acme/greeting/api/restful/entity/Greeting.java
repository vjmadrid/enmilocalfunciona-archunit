package com.acme.greeting.api.restful.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting implements Serializable {

	private static final long serialVersionUID = 6417305265257983657L;
	
	private long id;
	
    private String content;
    
    private Date responseTime;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.responseTime = new Date();
    }
	
}
