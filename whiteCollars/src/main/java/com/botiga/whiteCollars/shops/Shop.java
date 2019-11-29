package com.botiga.whiteCollars.shops;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {
	
	@Id
	private String shopName;
	private int maxCollars;
	//private List<Collars> shopCollarsStock;
	
	
	public Shop() {
		
	}
	
	
	public Shop(String shopName, int maxCollars) {
		super();
		this.shopName = shopName;
		this.maxCollars = maxCollars;
		//this.shopCollarsStock = new ArrayList<>().;
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
