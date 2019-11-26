package com.botiga.whiteCollars.shops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
	
	@Autowired
	private ShopService myShopService;
	
	@RequestMapping("/shops")
	public List<Shop> getAllShops(){
		return myShopService.getAllShops();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/shops")
	public void addShop(@RequestBody Shop shop){
		myShopService.addShop(shop);
	}
	

}
