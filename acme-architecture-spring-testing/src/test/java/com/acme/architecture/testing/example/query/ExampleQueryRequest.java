package com.acme.architecture.testing.example.query;

import java.io.Serializable;
import java.util.Date;

public class ExampleQueryRequest implements Serializable {

	private static final long serialVersionUID = -2779837630741553986L;

	private long id;
	
    private String content;
    
    private Date responseTime;
	
}
