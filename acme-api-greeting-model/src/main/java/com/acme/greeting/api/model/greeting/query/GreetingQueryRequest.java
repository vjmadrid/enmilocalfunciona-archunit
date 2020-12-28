package com.acme.greeting.api.model.greeting.query;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.acme.greeting.api.model.greeting.constant.GreetingJsonFieldConstant;
import com.acme.greeting.api.model.greeting.constant.PatternConstant;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class GreetingQueryRequest implements Serializable {

	private static final long serialVersionUID = 6972308085653704085L;
	
	@Size(min = 1, max = 50)
	@Pattern(regexp = PatternConstant.ANY)
	@JsonProperty(GreetingJsonFieldConstant.FIELD_GREETING_CONTENT)
	private String content;

}
