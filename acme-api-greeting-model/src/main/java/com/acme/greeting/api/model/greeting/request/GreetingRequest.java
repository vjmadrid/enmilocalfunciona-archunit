package com.acme.greeting.api.model.greeting.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
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
public class GreetingRequest implements Serializable {

	private static final long serialVersionUID = 7691151745396482238L;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Pattern(regexp = PatternConstant.ANY)
	@JsonProperty(GreetingJsonFieldConstant.FIELD_GREETING_CONTENT)
	private String content;

}
