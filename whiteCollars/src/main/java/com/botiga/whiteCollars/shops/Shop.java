package com.botiga.whiteCollars.shops;

public class Shop {
	
	private String shopName;
	private int maxCollars;
	
	public Shop() {
		
	}
	
	public Shop(String shopName, int maxCollars) {
		this.shopName = shopName;
		this.maxCollars = maxCollars;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getMaxCollars() {
		return maxCollars;
	}

	public void setMaxCollars(int maxCollars) {
		this.maxCollars = maxCollars;
	}
	
	
	
	

}
