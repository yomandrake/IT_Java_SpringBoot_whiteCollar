package com.botiga.whiteCollars.shops;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopRepository;
	/*
	private List<Shop> myShops = new ArrayList<>(Arrays.asList( 
		new Shop("Name1",1),
		new Shop("Name2",2))
	);
	*/
	public ShopService() {
		
	}

	///GET ALL
	public List<Shop> getAllShops() {
		List<Shop> allShops = new ArrayList<>();
		shopRepository.findAll().forEach(allShops::add);
		return allShops;
	}
	
	//POST -ADD NEW
	public void addShop(Shop shop) {
		//this.myShops.add(shop);
		shopRepository.save(shop);
	}
	//PUT or UPDATE shop
	public void updateShop(Shop shop) {
		shopRepository.save(shop);
	}
	//DELETE by Id in Path Variable /shops/{id}
	public void deleteShop(String id) {
		shopRepository.deleteById(id);		
	}
	//GET SHOP by Id in Path Variable /shops/{id}
	public Optional<Shop> getShopById(String id) {
		Optional<Shop> requestedShop = shopRepository.findById(id);
		return requestedShop;
	}
	
	
	
	
	

}
