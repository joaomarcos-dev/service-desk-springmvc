package com.jodev.servicedesk.model;

import javax.annotation.processing.Generated;

public class Form01 {
	public Form01(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public Form01() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String phone;
	
	@Generated("SparkTools")
	private Form01(Builder builder) {
		this.name = builder.name;
		this.phone = builder.phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * Creates builder to build {@link Form01}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link Form01}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String name;
		private String phone;

		private Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Form01 build() {
			return new Form01(this);
		}
	}
	@Override
	public String toString() {
		return "Form01 [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
