package com.kadum.model;

import java.util.Arrays;

public class Brand {
	private int brandId;
	private String brandName;
	private Link[] links;

	public Brand() {
	}

	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}

	public Brand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public Brand(int brandId, String brandName, Link[] links) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.links = links;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Link[] getLinks() {
		return links;
	}

	public void setLinks(Link[] links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", links=" + Arrays.toString(links) + "]";
	}
	public String displayBrand() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName+"]";
	}
	
	
	
	
	
}
