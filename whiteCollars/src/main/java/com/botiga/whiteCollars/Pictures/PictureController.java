package com.botiga.whiteCollars.Pictures;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.botiga.whiteCollars.shops.Shop;

@RestController
public class PictureController {
	
	@Autowired
	private PictureService pictureService;
	

	//GET ALL PICTURES
	@RequestMapping(method=RequestMethod.GET,value = "/shops/{shopId}/pictures") ///GET by SpingRequested Mapp default
	public List<Picture> getAllPictures(@PathVariable String shopId){
		return pictureService.getAllPictures(shopId);
	}
	//GET PICTURE BY ID 
	@RequestMapping(method=RequestMethod.GET,value = "/shops/{shopId}/pictures/{id}")
	public Optional<Picture> getPictureById(@PathVariable String id) {
		return pictureService.getPictureById(id);
	}
	
	//POST PICTURE WITH SHOP ID
	@RequestMapping(method=RequestMethod.POST, value = "/shops/{shopId}/pictures")
	public void addPicture(@PathVariable String shopId,@RequestBody Picture picture){
		
		Picture newPicture = new Picture(picture.getPictureName(),picture.getPictureAuthor(),picture.getPicturePrice());
		
		Shop shop = new Shop(shopId,0);///El maxCollars luego lo resolvera solo
		newPicture.setShop(shop);
		//newPicture.setPictureEntryDate("Hola!!");
		pictureService.updatePicture(newPicture);
	}
	//PUT or UPDATE PICTURE WITH PICTURE ID
	@RequestMapping(method=RequestMethod.PUT,value = "/shops/{shopId}/pictures/{id}")
	public void updatePicture(@PathVariable String shopId,@PathVariable String id, @RequestBody Picture picture){
		Picture newPicture = new Picture(picture.getPictureName(),picture.getPictureAuthor(),picture.getPicturePrice());
		Shop shop = new Shop(shopId,0);///El maxCollars luego lo resolvera solo
		newPicture.setShop(shop);
		newPicture.setPictureEntryDate("Hola!!");
		pictureService.updatePicture(newPicture);
		
	}
	//DELETE PICTURE WITH PICTURE ID
	@RequestMapping(method=RequestMethod.DELETE,value = "/shops/{shopId}/pictures/{id}")
	public void deletePicture(@PathVariable String id) {
		pictureService.deletePicture(id);
	}
	
	

}
