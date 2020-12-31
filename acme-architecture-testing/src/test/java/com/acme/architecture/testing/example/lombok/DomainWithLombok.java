package com.acme.architecture.testing.example.lombok;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainWithLombok implements Serializable {

	private static final long serialVersionUID = -2779837630741553986L;

	private long id;
	
    private String content;
    
    private Date responseTime;
	
}
