package com.jodev.servicedesk.model;

import javax.annotation.processing.Generated;

public class ResponseDescriptor {
	private String testDescription;
	private String url;
	private String acceptedMethod;
	private String necessaryParam;
	private String consumes;
	private String produces;
	private String requestBody;

	@Generated("SparkTools")
	private ResponseDescriptor(Builder builder) {
		this.testDescription = builder.testDescription;
		this.url = builder.url;
		this.acceptedMethod = builder.acceptedMethod;
		this.necessaryParam = builder.necessaryParam;
		this.consumes = builder.consumes;
		this.produces = builder.produces;
		this.requestBody = builder.requestBody;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAcceptedMethod() {
		return acceptedMethod;
	}
	public void setAcceptedMethod(String acceptedMethod) {
		this.acceptedMethod = acceptedMethod;
	}
	public String getNecessaryParam() {
		return necessaryParam;
	}
	public void setNecessaryParam(String necessaryParam) {
		this.necessaryParam = necessaryParam;
	}
	public String getConsumes() {
		return consumes;
	}
	public void setConsumes(String consumes) {
		this.consumes = consumes;
	}
	public String getProduces() {
		return produces;
	}
	public void setProduces(String produces) {
		this.produces = produces;
	}
	
	
	@Override
	public String toString() {
		return "ResponseDescriptor [testDescription=" + testDescription + ", url=" + url + ", acceptedMethod="
				+ acceptedMethod + ", necessaryParam=" + necessaryParam + ", consumes=" + consumes + ", produces="
				+ produces + ", requestBody=" + requestBody + "]";
	}
	
	

	/**
	 * Creates builder to build {@link ResponseDescriptor}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link ResponseDescriptor}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String testDescription;
		private String url;
		private String acceptedMethod;
		private String necessaryParam;
		private String consumes;
		private String produces;
		private String requestBody;

		private Builder() {
		}

		public Builder withTestDescription(String testDescription) {
			this.testDescription = testDescription;
			return this;
		}

		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}

		public Builder withAcceptedMethod(String acceptedMethod) {
			this.acceptedMethod = acceptedMethod;
			return this;
		}

		public Builder withNecessaryParam(String necessaryParam) {
			this.necessaryParam = necessaryParam;
			return this;
		}

		public Builder withConsumes(String consumes) {
			this.consumes = consumes;
			return this;
		}

		public Builder withProduces(String produces) {
			this.produces = produces;
			return this;
		}

		public Builder withRequestBody(String requestBody) {
			this.requestBody = requestBody;
			return this;
		}

		public ResponseDescriptor build() {
			return new ResponseDescriptor(this);
		}
	}
}
