package com.acme.example.archunit.user.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.acme.example.archunit.user.annotation.UserDescription;

@UserDescription(value = "Test Description User")
public class User implements Serializable {

	private static final long serialVersionUID = 3872338226794817168L;

	private Long id;
	
	private String name;
	
	private String rol;
	
	private Boolean enabled;   
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof User)) {
			return false;
		}
		
		final User other = (User)object;

		return new EqualsBuilder().append(getId(), other.getId())
				.append(getName(), other.getName())
				.append(getRol(), other.getRol())
				.append(getEnabled(), other.getEnabled())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).append(getName())
				.append(getRol()).append(getEnabled()).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", getId())
				.append("name", getName())
				.append("rol", getRol())
				.append("enabled", getEnabled())
				.toString();
	}

}