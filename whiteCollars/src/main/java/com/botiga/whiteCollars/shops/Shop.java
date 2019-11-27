package com.botiga.whiteCollars.shops;

import java.util.List;

import com.botiga.whiteCollars.collars.Collars;

public class Shop {
	
	private String shopName;
	private int maxCollars;
	private List<Collars> shopCollarsStock;
	
	/*
	public Shop() {
		
	}
	*/
	
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
