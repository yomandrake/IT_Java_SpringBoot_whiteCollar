package com.botiga.whiteCollars.Pictures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botiga.whiteCollars.shops.ShopService;

@Service
public class PictureService {
	
	@Autowired
	private PictureRepository pictureRepository;
	@Autowired
	private ShopService shopService;
	
	public PictureService() {
		
	}

	///GET ALL PICTURES BY Shop Id ///CHECK
	public List<Picture> getAllPictures(String shopId) {
		List<Picture> allPictures = new ArrayList<>();
		pictureRepository.findByShopShopName(shopId).forEach(allPictures::add);
		return allPictures;
	}
	
	//POST 
	public void addPicture(Picture picture) {
		pictureRepository.save(picture);
	}
	//PUT or UPDATE picture
	public void updatePicture(Picture shop) {
		pictureRepository.save(shop);
	}
	//DELETE by Id in Path Variable /shops/{id}
	public void deletePicture(String id) {
		pictureRepository.deleteById(id);		
	}
	//GET PICTURE by Id in Path Variable /shops/{shopId}/pictures/{id}
	public Optional<Picture> getPictureById(String id) {
		Optional<Picture> requestedPicture = pictureRepository.findById(id);
		return requestedPicture;
	}
	
	//CHECK ROOM FOR NEW PICTURES
	public boolean isRoomForMorePict(String shopId) {
		//Check if we reached capacity
		int maxQ = shopService.getShopById(shopId).get().getMaxCollars();
		int pictStockQ = this.getAllPictures(shopId).size();
		
		if(pictStockQ < maxQ) {
			return true;
		}else {
			return false;
		}
		
	}

	public void deleteAllPicturesByShopId(String shopId) {
		pictureRepository.findByShopShopName(shopId).forEach(pict -> deletePicture(pict.getPictureName()));	
		
		
	}
	
	
	

}
