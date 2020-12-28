package com.acme.greeting.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.acme.greeting.api.entity.constant.GreetingEntityConstant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = GreetingEntityConstant.TABLE_GREETING)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Greeting implements Serializable {

	private static final long serialVersionUID = 620509239537658329L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = GreetingEntityConstant.FIELD_GREETING_ID, unique = true)
	private Long id;
	
	@Column(name = GreetingEntityConstant.FIELD_GREETING_CONTENT)
    private String content;
    
	@Column(name = GreetingEntityConstant.FIELD_GREETING_CREATED_AT)
    private Date createdAt;

}
