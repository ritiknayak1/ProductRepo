package com.example.assignment.vo;

public class PriceRangeVo {
	private int minPrice;
	private int maxPrice;
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	@Override
	public String toString() {
		return "PriceRangeVo [minPrice=" + minPrice + ", maxPrice=" + maxPrice + "]";
	}
	public PriceRangeVo(int minPrice, int maxPrice) {
		super();
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}
	public PriceRangeVo() {
		super();
	}
	
}
