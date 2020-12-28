package com.acme.greeting.api.model.greeting.query;

import java.io.Serializable;

import com.acme.greeting.api.model.greeting.constant.GreetingQueryJsonFieldConstant;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GreetingFullQueryRequest implements Serializable {

	private static final long serialVersionUID = 3971304089713862466L;
	
	@JsonProperty(GreetingQueryJsonFieldConstant.FIELD_GREETING_QUERY)
	private GreetingQueryRequest greetingQuery;

}
