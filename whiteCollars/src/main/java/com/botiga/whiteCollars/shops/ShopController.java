package com.botiga.whiteCollars.shops;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
	
	@Autowired
	private ShopService myShopService;
	
	//GET BY ID
	@RequestMapping(method=RequestMethod.GET,value = "/shops/{id}")
	public Optional<Shop> getShopById(@PathVariable String id) {
		return myShopService.getShopById(id);
	}
	
	//GET ALL
	@RequestMapping("/shops") ///GET by SpingRequested Mapp default
	public List<Shop> getAllShops(){
		return myShopService.getAllShops();
	}
	//POST
	@RequestMapping(method=RequestMethod.POST, value = "/shops")
	public void addShop(@RequestBody Shop shop){
		myShopService.addShop(shop);
	}
	//PUT or UPDATE
	@RequestMapping(method=RequestMethod.PUT,value = "/shops")
	public void updateShop(@RequestBody Shop shop){
		myShopService.updateShop(shop);
	}
	//DELETE
	@RequestMapping(method=RequestMethod.DELETE,value = "/shops/{id}")
	public void deleteShop(@PathVariable String id) {
		myShopService.deleteShop(id);
	}
	
	

}
