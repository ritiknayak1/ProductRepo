package com.example.assignment.vo;

public class ProductVo {
	private long id;
	private String productName;
	private String productType;
	private String productCategory;
	
	private PriceRangeVo pricerange;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	public PriceRangeVo getPricerange() {
		return pricerange;
	}
	public void setPricerange(PriceRangeVo pricerange) {
		this.pricerange = pricerange;
	}
	
	public ProductVo(long id, String productName, String productType, String productCategory, PriceRangeVo pricerange) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.pricerange = pricerange;
	}
	
	@Override
	public String toString() {
		return "ProductVo [id=" + id + ", productName=" + productName + ", productType=" + productType
				+ ", productCategory=" + productCategory + ", pricerange=" + pricerange + "]";
	}
	public ProductVo() {
		super();
	}
	

	
}
