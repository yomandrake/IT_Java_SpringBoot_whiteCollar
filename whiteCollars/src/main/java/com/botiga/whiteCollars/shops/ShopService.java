package com.botiga.whiteCollars.shops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShopService {
	
	private List<Shop> myShops = new ArrayList<>(Arrays.asList( 
		new Shop("Name1",1),
		new Shop("Name2",2))
	);
	
	public ShopService() {
		
	}

	public List<Shop> getMyShops() {
		return myShops;
	}

	public void setMyShops(List<Shop> myShops) {
		this.myShops = myShops;
	}

	public List<Shop> getAllShops() {
		return this.myShops;
	}

	public void addShop(Shop shop) {
		this.myShops.add(shop);		
	}
	
	
	
	
	

}
