package com.acme.greeting.api.model.greeting.response;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.acme.greeting.api.model.greeting.constant.GreetingJsonFieldConstant;
import com.acme.greeting.api.model.greeting.constant.PatternConstant;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class GreetingResponse implements Serializable {

	private static final long serialVersionUID = 6389957248936286259L;

	@Min(0)
	@Max(Long.MAX_VALUE)
	@JsonProperty(GreetingJsonFieldConstant.FIELD_GREETING_ID)
	private Long id;

	@Size(min = 1, max = 50)
	@Pattern(regexp = PatternConstant.ANY)
	@JsonProperty(GreetingJsonFieldConstant.FIELD_GREETING_CONTENT)
	private String content;
	
	@JsonProperty(GreetingJsonFieldConstant.FIELD_GREETING_CREATED_AT)
	private Date createdAt;

}
