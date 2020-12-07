package com.acme.example.archunit.entity;

import java.io.Serializable;

public abstract class AbstractCustomEntity implements Serializable {

	private static final long serialVersionUID = -5199514979931305823L;

	@Override
	public abstract int hashCode();
	
	@Override
	public abstract boolean equals(Object object);
	
	@Override
	public abstract String toString();
	
}
